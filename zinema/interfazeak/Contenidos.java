package interfazeak;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;

public class Contenidos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contenidos window = new Contenidos();
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
	public Contenidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRegistro = new JLabel("CONTENIDOS");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 1;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		ArrayList<String> ArrayPelikulak = new ArrayList<>();
		ArrayPelikulak.add("Peli1");
		ArrayPelikulak.add("Peli2");
		ArrayPelikulak.add("Peli3");
		ArrayPelikulak.add("Peli4");
		ArrayPelikulak.add("Peli5");
		
		JButton btnBueltatu = new JButton("Bueltatu Egun Aukeraketara");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(btnBueltatu, gbc_btnNewButton_1);
		
		btnBueltatu.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
            	EgunaAukeratu.main(null);
            }
		});
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 3;
		panel.add(horizontalBox, gbc_horizontalBox);
		

		JLabel lblPelicDisp = new JLabel("Aukeratu pelikula:");
		lblPelicDisp.setFont(new Font("Tahoma", Font.BOLD, 13));
		horizontalBox.add(lblPelicDisp);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox.add(rigidArea);
		JComboBox comboBoxPelikulak = new JComboBox(ArrayPelikulak.toArray());
		horizontalBox.add(comboBoxPelikulak);
		
		JButton btnEdukiaEditatu = new JButton("Edukia Editatu");
		GridBagConstraints gbc_btnEdukiaEditatu = new GridBagConstraints();
		gbc_btnEdukiaEditatu.anchor = GridBagConstraints.WEST;
		gbc_btnEdukiaEditatu.insets = new Insets(0, 0, 5, 5);
		gbc_btnEdukiaEditatu.gridx = 1;
		gbc_btnEdukiaEditatu.gridy = 5;
		panel.add(btnEdukiaEditatu, gbc_btnEdukiaEditatu);
		
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setVisible(false);
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.anchor = GridBagConstraints.WEST;
		gbc_verticalBox.gridheight = 5;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 1;
		gbc_verticalBox.gridy = 6;
		panel.add(verticalBox, gbc_verticalBox);
		
		JButton btnEditar = new JButton("Editatu");
		verticalBox.add(btnEditar);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_2);
		
		JButton btnBorrar = new JButton("Ezabatu");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxPelikulak.getSelectedIndex() > -1) {
			        ArrayPelikulak.remove(comboBoxPelikulak.getSelectedIndex());
			        comboBoxPelikulak.getSelectedIndex();
			        comboBoxPelikulak.setModel(new DefaultComboBoxModel(ArrayPelikulak.toArray()));
				}
			}
		});
		verticalBox.add(btnBorrar);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_3);
		
		JButton btnNuevo = new JButton("Berria");
		verticalBox.add(btnNuevo);
		
		JLabel lblLogo1 = new JLabel("");
		lblLogo1.setBackground(Color.WHITE);
		lblLogo1.setIcon(new ImageIcon(Confirmacion.class.getResource("../imagenes/logoa/logo_pequeno.png")));
		GridBagConstraints gbc_lblLogo1 = new GridBagConstraints();
		gbc_lblLogo1.gridheight = 8;
		gbc_lblLogo1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo1.gridx = 2;
		gbc_lblLogo1.gridy = 5;
		panel.add(lblLogo1, gbc_lblLogo1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setVisible(false);
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.anchor = GridBagConstraints.WEST;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 1;
		gbc_horizontalBox_2.gridy = 11;
		panel.add(horizontalBox_2, gbc_horizontalBox_2);
		
		JButton btnCancelar = new JButton("Kantzelatu");
		horizontalBox_2.add(btnCancelar);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_4);
		
		JButton btnConfirmar = new JButton("Baieztatu");
		horizontalBox_2.add(btnConfirmar);
		
		Box verticalBox_2 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_2 = new GridBagConstraints();
		gbc_verticalBox_2.anchor = GridBagConstraints.WEST;
		gbc_verticalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_2.gridx = 1;
		gbc_verticalBox_2.gridy = 12;
		panel.add(verticalBox_2, gbc_verticalBox_2);
		
		JButton btnAnadirPelic = new JButton("Pelikula gehitu");
		btnAnadirPelic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		verticalBox_2.add(btnAnadirPelic);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(10, 10));
		verticalBox_2.add(rigidArea_5);
		
		JButton btnResDia = new JButton("Eguneko Laburpena");
		btnResDia.setEnabled(false);
		verticalBox_2.add(btnResDia);
		
		
		btnEditar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	frame.setVisible(false);
            	EdukiaEditatu.main(null);
            }
		});
		
		btnNuevo.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	EdukiBerria.main(null);
            }
		});
		
		btnEdukiaEditatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (verticalBox_2.isVisible()) {
					verticalBox_2.setVisible(false);
					
					verticalBox.setVisible(true);
					horizontalBox_2.setVisible(true);
				}
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (verticalBox.isVisible() || horizontalBox_2.isVisible()) {
					verticalBox.setVisible(false);
					horizontalBox_2.setVisible(false);
					
					verticalBox_2.setVisible(true);
				}
			}
		});
		
	}

}