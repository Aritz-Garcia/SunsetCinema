package interfazeak;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

public class EgunaAukeratu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EgunaAukeratu window = new EgunaAukeratu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EgunaAukeratu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		/*------------------------------------------------------------------------------------------------------*/
		
		JLabel lblRegistro = new JLabel("Egun Aukeraketa");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 1;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		ArrayList<String> ArrayEnpresaKargua = new ArrayList<>();
		ArrayEnpresaKargua.add("");
		ArrayEnpresaKargua.add("Astelehena");
		ArrayEnpresaKargua.add("Asteartea");
		ArrayEnpresaKargua.add("Asteazkena");
		ArrayEnpresaKargua.add("Osteguna");
		ArrayEnpresaKargua.add("Ostirala");
		ArrayEnpresaKargua.add("Larunbata");
		ArrayEnpresaKargua.add("Igandea");
		
		/*------------------------------------------------------------------------------------------------------*/
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 3;
		panel.add(horizontalBox_1, gbc_horizontalBox_1);
		
		JLabel lblEnpresaKargua = new JLabel("Hautatu duzun eguna:");
		horizontalBox_1.add(lblEnpresaKargua);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_4);
		JComboBox comboBoxEnpresaKargua = new JComboBox(ArrayEnpresaKargua.toArray());
		
		
		horizontalBox_1.add(comboBoxEnpresaKargua);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		horizontalBox_4.setVisible(false);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setVisible(false);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setVisible(false);
		GridBagConstraints gbc_horizontalBox_2  = new GridBagConstraints();
		gbc_horizontalBox_2 .fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2 .insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2 .gridx = 1;
		gbc_horizontalBox_2 .gridy = 5;
		panel.add(horizontalBox_2 , gbc_horizontalBox_2);
		
		JLabel lblEdukiak = new JLabel("Eguneko edukiak: ");
		horizontalBox_2 .add(lblEdukiak);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_2 .add(rigidArea);
		
		JLabel lblEdukiakErantz = new JLabel("");
		horizontalBox_2.add(lblEdukiakErantz);
		GridBagConstraints gbc_horizontalBox_3  = new GridBagConstraints();
		gbc_horizontalBox_3 .fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_3 .insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3 .gridx = 1;
		gbc_horizontalBox_3 .gridy = 6;
		panel.add(horizontalBox_3 , gbc_horizontalBox_3);
		
		JLabel lblEduki_kop = new JLabel("Eduki kopurua: ");
		horizontalBox_3 .add(lblEduki_kop);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_3 .add(rigidArea_2);
		
		JLabel lblEdKopErantz = new JLabel("");
		horizontalBox_3.add(lblEdKopErantz);
		GridBagConstraints gbc_horizontalBox_4  = new GridBagConstraints();
		gbc_horizontalBox_4 .fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_4 .insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_4 .gridx = 1;
		gbc_horizontalBox_4 .gridy = 7;
		panel.add(horizontalBox_4 , gbc_horizontalBox_4);
		
		JLabel lblBatazBesteko_iraupena = new JLabel("Bataz-besteko iraunpena: ");
		horizontalBox_4 .add(lblBatazBesteko_iraupena);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_4 .add(rigidArea_3);
		
		JLabel lblBatBestIraupErantz = new JLabel("");
		horizontalBox_4.add(lblBatBestIraupErantz);
		/*if(comboBoxEnpresaKargua.getSelectedIndex() > 0)
			btnKartelera.setEnabled(true);
			
		else
			btnKartelera.setEnabled(false);*/
		
		/*------------------------------------------------------------------------------------------------------*/
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setIcon(new ImageIcon(Confirmacion.class.getResource("../imagenes/logoa/logo_pequeno.png")));
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.gridheight = 6;
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 2;
		gbc_lblLogo.gridy = 2;
		panel.add(lblLogo, gbc_lblLogo);
		
		Box horizontalBox_filler = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_filler = new GridBagConstraints();
		gbc_horizontalBox_filler.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_filler.gridx = 1;
		gbc_horizontalBox_filler.gridy = 8;
		panel.add(horizontalBox_filler, gbc_horizontalBox_filler);
		
		Component rigidArea_filler = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_filler.add(rigidArea_filler);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_5 = new GridBagConstraints();
		gbc_horizontalBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_5.gridx = 1;
		gbc_horizontalBox_5.gridy = 9;
		panel.add(horizontalBox_5, gbc_horizontalBox_5);
		
		JButton btnHasiera = new JButton("Hasiera");
		horizontalBox_5.add(btnHasiera);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_5.add(rigidArea_5);
		
		JButton btnKartelera = new JButton("Kartelera");
		btnKartelera.setEnabled(false);
		horizontalBox_5.add(btnKartelera);
		
		btnHasiera.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	frame.setVisible(false);
            	Ongietorria.main(null);
            }
		});
		
		btnKartelera.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	frame.setVisible(false);
            	Contenidos.main(null);
            }
		});
		
		/*------------------------------------------------------------------------------------------------------*/
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_6 = new GridBagConstraints();
		gbc_horizontalBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_6.gridx = 2;
		gbc_horizontalBox_6.gridy = 9;
		panel.add(horizontalBox_6, gbc_horizontalBox_6);
		
		JButton btnAsteko_laburpena = new JButton("Asteko laburpena");
		btnAsteko_laburpena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		horizontalBox_6.add(btnAsteko_laburpena);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_6.add(rigidArea_6);
		
		JButton btnBalioztatu = new JButton("Balioztatu");
		btnBalioztatu.setEnabled(false);
		horizontalBox_6.add(btnBalioztatu);
		
		btnBalioztatu.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	frame.setVisible(false);
            	Confirmacion.main(null);
            }
		});
		
		comboBoxEnpresaKargua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEnpresaKargua.getSelectedIndex() > 0)
					btnKartelera.setEnabled(true);
				else
					btnKartelera.setEnabled(false);
			}
		});
		
		comboBoxEnpresaKargua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEnpresaKargua.getSelectedIndex() > 0)
					horizontalBox_2.setVisible(true);
				else
					horizontalBox_2.setVisible(false);
			}
		});
		
		comboBoxEnpresaKargua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEnpresaKargua.getSelectedIndex() > 0)
					horizontalBox_3.setVisible(true);
				else
					horizontalBox_3.setVisible(false);
			}
		});
		
		comboBoxEnpresaKargua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEnpresaKargua.getSelectedIndex() > 0)
					horizontalBox_4.setVisible(true);
				else
					horizontalBox_4.setVisible(false);
			}
		});
	}

}