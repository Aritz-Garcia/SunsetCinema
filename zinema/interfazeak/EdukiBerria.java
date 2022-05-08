package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import objektuak.Pegi;
import objektuak.SunsetCinema;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

public class EdukiBerria extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField titulua;
	private JTextField iraupena;
	private JTextField produktorea;
	private JTextField fabula;
	private JTextField generoa;
	private JTextField tema;
	private JPanel panelLab;
	private JPanel panelPel;
	private JPanel panelDok;
	private Box horizontalBox;
	private JRadioButton aukeLab;
	private JRadioButton aukePel;
	private JRadioButton aukeDok;
	private final ButtonGroup botoiak = new ButtonGroup();
	private JLabel lblNewLabel_7;
	private Box horizontalBox_1;
	private JButton okBot;
	private JButton ezBot;
	private Component glue;
	private Component rigidArea;
	private List<JTextField> fieldList = new ArrayList<JTextField>();
	private String zein = "";
	private JComboBox pegiBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdukiBerria frame = new EdukiBerria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EdukiBerria() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 80, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		lblNewLabel_7 = new JLabel("Eduki Berria Sortu");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 1;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);

		JLabel lblNewLabel = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		id = new JTextField();

		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.insets = new Insets(0, 0, 5, 5);
		gbc_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_id.gridx = 2;
		gbc_id.gridy = 2;
		contentPane.add(id, gbc_id);
		id.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Titulua:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		titulua = new JTextField();
		GridBagConstraints gbc_titulua = new GridBagConstraints();
		gbc_titulua.insets = new Insets(0, 0, 5, 5);
		gbc_titulua.fill = GridBagConstraints.HORIZONTAL;
		gbc_titulua.gridx = 2;
		gbc_titulua.gridy = 3;
		contentPane.add(titulua, gbc_titulua);
		titulua.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Iraupena:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		iraupena = new JTextField();
		GridBagConstraints gbc_iraupena = new GridBagConstraints();
		gbc_iraupena.insets = new Insets(0, 0, 5, 5);
		gbc_iraupena.fill = GridBagConstraints.HORIZONTAL;
		gbc_iraupena.gridx = 2;
		gbc_iraupena.gridy = 4;
		contentPane.add(iraupena, gbc_iraupena);
		iraupena.setColumns(10);

		panelLab = new JPanel();
		GridBagConstraints gbc_panelLab = new GridBagConstraints();
		gbc_panelLab.gridwidth = 2;
		gbc_panelLab.insets = new Insets(0, 0, 5, 5);
		gbc_panelLab.fill = GridBagConstraints.BOTH;
		gbc_panelLab.gridx = 1;
		gbc_panelLab.gridy = 5;
		contentPane.add(panelLab, gbc_panelLab);
		GridBagLayout gbl_panelLab = new GridBagLayout();
		gbl_panelLab.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelLab.rowHeights = new int[] { 0, 0 };
		gbl_panelLab.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelLab.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelLab.setLayout(gbl_panelLab);

		JLabel lblNewLabel_3 = new JLabel("Fabula:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		panelLab.add(lblNewLabel_3, gbc_lblNewLabel_3);

		fabula = new JTextField();
		GridBagConstraints gbc_fabula = new GridBagConstraints();
		gbc_fabula.fill = GridBagConstraints.HORIZONTAL;
		gbc_fabula.gridx = 1;
		gbc_fabula.gridy = 0;
		panelLab.add(fabula, gbc_fabula);
		fabula.setColumns(10);

		panelPel = new JPanel();
		GridBagConstraints gbc_panelPel = new GridBagConstraints();
		gbc_panelPel.gridwidth = 2;
		gbc_panelPel.insets = new Insets(0, 0, 5, 5);
		gbc_panelPel.fill = GridBagConstraints.BOTH;
		gbc_panelPel.gridx = 1;
		gbc_panelPel.gridy = 6;
		contentPane.add(panelPel, gbc_panelPel);
		GridBagLayout gbl_panelPel = new GridBagLayout();
		gbl_panelPel.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelPel.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelPel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelPel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelPel.setLayout(gbl_panelPel);

		JLabel lblNewLabel_4 = new JLabel("Generoa:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 0;
		panelPel.add(lblNewLabel_4, gbc_lblNewLabel_4);

		generoa = new JTextField();
		GridBagConstraints gbc_generoa = new GridBagConstraints();
		gbc_generoa.insets = new Insets(0, 0, 5, 0);
		gbc_generoa.fill = GridBagConstraints.HORIZONTAL;
		gbc_generoa.gridx = 1;
		gbc_generoa.gridy = 0;
		panelPel.add(generoa, gbc_generoa);
		generoa.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("PEGI:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 1;
		panelPel.add(lblNewLabel_5, gbc_lblNewLabel_5);

		pegiBox = new JComboBox(Pegi.values());
		GridBagConstraints gbc_pegiBox = new GridBagConstraints();
		gbc_pegiBox.anchor = GridBagConstraints.WEST;
		gbc_pegiBox.gridx = 1;
		gbc_pegiBox.gridy = 1;
		panelPel.add(pegiBox, gbc_pegiBox);

		panelDok = new JPanel();
		GridBagConstraints gbc_panelDok = new GridBagConstraints();
		gbc_panelDok.gridwidth = 2;
		gbc_panelDok.insets = new Insets(0, 0, 5, 5);
		gbc_panelDok.fill = GridBagConstraints.BOTH;
		gbc_panelDok.gridx = 1;
		gbc_panelDok.gridy = 7;
		contentPane.add(panelDok, gbc_panelDok);
		GridBagLayout gbl_panelDok = new GridBagLayout();
		gbl_panelDok.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelDok.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelDok.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelDok.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelDok.setLayout(gbl_panelDok);

		JLabel lblNewLabel_6 = new JLabel("Tema:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 0;
		panelDok.add(lblNewLabel_6, gbc_lblNewLabel_6);

		tema = new JTextField();
		GridBagConstraints gbc_tema = new GridBagConstraints();
		gbc_tema.insets = new Insets(0, 0, 5, 0);
		gbc_tema.fill = GridBagConstraints.HORIZONTAL;
		gbc_tema.gridx = 1;
		gbc_tema.gridy = 0;
		panelDok.add(tema, gbc_tema);
		tema.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Produktorea:");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 1;
		panelDok.add(lblNewLabel_13, gbc_lblNewLabel_13);

		produktorea = new JTextField();
		GridBagConstraints gbc_produktorea = new GridBagConstraints();
		gbc_produktorea.fill = GridBagConstraints.HORIZONTAL;
		gbc_produktorea.gridx = 1;
		gbc_produktorea.gridy = 1;
		panelDok.add(produktorea, gbc_produktorea);
		produktorea.setColumns(10);

		horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.gridwidth = 2;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 8;
		contentPane.add(horizontalBox, gbc_horizontalBox);

		aukeLab = new JRadioButton("Laburmetraia");
		botoiak.add(aukeLab);
		aukeLab.addActionListener(a -> aldatuLab());
		horizontalBox.add(aukeLab);

		aukePel = new JRadioButton("Pelikula");
		botoiak.add(aukePel);
		aukePel.addActionListener(a -> aldatuPel());
		horizontalBox.add(aukePel);

		aukeDok = new JRadioButton("Dokumentala");
		botoiak.add(aukeDok);
		aukeDok.addActionListener(a -> aldatuDok());
		horizontalBox.add(aukeDok);

		horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.gridwidth = 2;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 9;
		contentPane.add(horizontalBox_1, gbc_horizontalBox_1);

		glue = Box.createGlue();
		horizontalBox_1.add(glue);

		okBot = new JButton("OK");
		okBot.addActionListener(a -> sortu());
		horizontalBox_1.add(okBot);

		rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea);

		ezBot = new JButton("Kantzelatu");
		ezBot.addActionListener(a -> this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING)));
		horizontalBox_1.add(ezBot);
		panelLab.setVisible(false);
		panelPel.setVisible(false);
		panelDok.setVisible(false);

		fieldList.add(id);
		fieldList.add(titulua);
		fieldList.add(iraupena);
		fieldList.add(produktorea);
		fieldList.add(fabula);
		fieldList.add(generoa);
		fieldList.add(tema);
	}

	private void aldatuLab() {
		panelLab.setVisible(true);
		panelPel.setVisible(false);
		panelDok.setVisible(false);
		produktorea.setText("");
		generoa.setText("");
		tema.setText("");
		zein = "Lab";
	}

	private void aldatuPel() {
		panelLab.setVisible(false);
		panelPel.setVisible(true);
		panelDok.setVisible(false);
		produktorea.setText("");
		fabula.setText("");
		tema.setText("");
		zein = "Pel";
	}

	private void aldatuDok() {
		panelLab.setVisible(false);
		panelPel.setVisible(false);
		panelDok.setVisible(true);
		produktorea.setText("");
		tema.setText("");
		zein = "Dok";
	}

	private void sortu() {
		if(botoiak.getSelection() == null) return;
		switch(zein.toLowerCase()) {
			case "lab":
				if(SunsetCinema.getNireSunsetCinema().gehituLarb(Integer.parseInt(id.getText()), titulua.getText(), Integer.parseInt(iraupena.getText()), fabula.getText())){
					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");

					/*try {
						SunsetCinema.getNireSunsetCinema().meterDatosLangilea();
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				}else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}	
			
				break;
			case "pel":
				if(SunsetCinema.getNireSunsetCinema().gehituPelik(Integer.parseInt(id.getText()), titulua.getText(), Integer.parseInt(iraupena.getText()), generoa.getText(), (Pegi) pegiBox.getSelectedItem())){
					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");

					/*try {
						SunsetCinema.getNireSunsetCinema().meterDatosLangilea();
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				}else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}	
				break;
			case "doc":
				if(SunsetCinema.getNireSunsetCinema().gehituDoku(Integer.parseInt(id.getText()), titulua.getText(), Integer.parseInt(iraupena.getText()), tema.getText(), produktorea.getText())){
					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");
					
					/*try {
						SunsetCinema.getNireSunsetCinema().meterDatosLangilea();
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				}else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}	
				break;
		}
		
	}

	private void ezabatu() {
		for(JTextField field :fieldList) {
			field.setText("");
		}
	}

}
