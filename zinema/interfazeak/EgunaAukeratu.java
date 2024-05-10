package interfazeak;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import objektuak.AstekoEguna;
import objektuak.SunsetCinema;

public class EgunaAukeratu extends JPanel {

	private JFrame frame;
	private JLabel edukiKop;
	private JLabel denboraSob;
	private JLabel bzbsIraupena;

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
		frame.setBounds(100, 100, 595, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 30, 278, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 0, 30, 0, 0, 0, 30, 0, 30 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		frame.getContentPane().setLayout(gridBagLayout);

		/*------------------------------------------------------------------------------------------------------*/

		JLabel lblRegistro = new JLabel("Egun Aukeraketa");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 1;
		gbc_lblRegistro.gridy = 1;
		frame.getContentPane().add(lblRegistro, gbc_lblRegistro);

		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 3;
		frame.getContentPane().add(horizontalBox_1, gbc_horizontalBox_1);

		JLabel lblEnpresaKargua = new JLabel("Hautatu duzun eguna:");
		horizontalBox_1.add(lblEnpresaKargua);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_4);
		JComboBox comboBoxEnpresaKargua = new JComboBox(AstekoEguna.values());

		horizontalBox_1.add(comboBoxEnpresaKargua);

		Box horizontalBox_4 = Box.createHorizontalBox();
		//horizontalBox_4.setVisible(false);

		Box horizontalBox_3 = Box.createHorizontalBox();
		//horizontalBox_3.setVisible(false);

		Box horizontalBox_2 = Box.createHorizontalBox();
		//horizontalBox_2.setVisible(false);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setVisible(false);
		verticalBox.setBorder(BorderFactory.createTitledBorder(""));
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 1;
		gbc_verticalBox.gridy = 5;
		frame.getContentPane().add(verticalBox, gbc_verticalBox);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_10);

		verticalBox.add(horizontalBox_2);

		Component glue_4 = Box.createGlue();
		verticalBox.add(glue_4);
		verticalBox.add(horizontalBox_3);

		Component glue_3 = Box.createGlue();
		verticalBox.add(glue_3);
		verticalBox.add(horizontalBox_4);

		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 1;
		gbc_horizontalBox_2.gridy = 5;

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_7);

		JLabel lblEdukiak = new JLabel("Eduki kopurua: ");
		horizontalBox_2.add(lblEdukiak);

		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea);

		edukiKop = new JLabel("");
		horizontalBox_2.add(edukiKop);

		Component glue = Box.createGlue();
		horizontalBox_2.add(glue);
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3.gridx = 1;
		gbc_horizontalBox_3.gridy = 6;

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_8);

		JLabel lblEduki_kop = new JLabel("Bataz-besteko iraunpena: ");
		horizontalBox_3.add(lblEduki_kop);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_2);

		bzbsIraupena = new JLabel("");
		horizontalBox_3.add(bzbsIraupena);

		Component glue_1 = Box.createGlue();
		horizontalBox_3.add(glue_1);
		GridBagConstraints gbc_horizontalBox_4 = new GridBagConstraints();
		gbc_horizontalBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_4.gridx = 1;
		gbc_horizontalBox_4.gridy = 7;

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_9);

		denboraSob = new JLabel("Egunak sobrean duen denbora: ");
		horizontalBox_4.add(denboraSob);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_4.add(rigidArea_3);

		JLabel lblBatBestIraupErantz = new JLabel("");
		horizontalBox_4.add(lblBatBestIraupErantz);

		Component glue_2 = Box.createGlue();
		horizontalBox_4.add(glue_2);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_11);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EgunaAukeratu.class.getResource("/imagenes/logoa/logo_gris.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		Box horizontalBox_5 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_5 = new GridBagConstraints();
		gbc_horizontalBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_5.gridwidth = 3;
		gbc_horizontalBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_5.gridx = 1;
		gbc_horizontalBox_5.gridy = 7;
		frame.getContentPane().add(horizontalBox_5, gbc_horizontalBox_5);

		JButton btnHasiera = new JButton("Hasiera");
		horizontalBox_5.add(btnHasiera);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_5);

		JButton btnKartelera = new JButton("Kartelera");
		btnKartelera.setEnabled(false);
		horizontalBox_5.add(btnKartelera);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_1);

		JButton btnAsteko_laburpena = new JButton("Asteko laburpena");
		horizontalBox_5.add(btnAsteko_laburpena);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_6);

		JButton btnBalioztatu = new JButton("Balioztatu");
		horizontalBox_5.add(btnBalioztatu);
		btnBalioztatu.setEnabled(false);

		btnBalioztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Confirmacion.main(null);
			}
		});
		btnAsteko_laburpena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AstekoLaburpena.main(null);
			}
		});

		btnHasiera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Ongietorria.main(null);
			}
		});

		btnKartelera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Edukiak.main((AstekoEguna)comboBoxEnpresaKargua.getSelectedItem());
			}
		});

		comboBoxEnpresaKargua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iraup = SunsetCinema.getNireSunsetCinema().getIraupena(comboBoxEnpresaKargua.getSelectedIndex());
				int egunDenb = SunsetCinema.getNireSunsetCinema().getOrduMax(comboBoxEnpresaKargua.getSelectedIndex())*60;
				int sobEmaitza = egunDenb-iraup;
				if(SunsetCinema.getNireSunsetCinema().infoDauka(comboBoxEnpresaKargua.getSelectedIndex())){
					int edukiKopEmaitza = SunsetCinema.getNireSunsetCinema().getEdukiKop(comboBoxEnpresaKargua.getSelectedIndex());
					int batazBest = iraup/edukiKopEmaitza;
					edukiKop.setText(edukiKopEmaitza + "");
					bzbsIraupena.setText(batazBest + "");
					verticalBox.setVisible(true);
					horizontalBox_2.setVisible(true);
					horizontalBox_3.setVisible(true);
					horizontalBox_4.setVisible(true);
				} else {
					verticalBox.setVisible(true);
					horizontalBox_2.setVisible(false);
					horizontalBox_3.setVisible(false);
					horizontalBox_4.setVisible(true);
				}
				lblBatBestIraupErantz.setText(sobEmaitza + " minutu soberan");
				if (sobEmaitza==0) {
					btnBalioztatu.setEnabled(true);
					btnKartelera.setEnabled(false);
				} else {
					btnBalioztatu.setEnabled(false);
					btnKartelera.setEnabled(true);
				}
			}
		});

	}

}