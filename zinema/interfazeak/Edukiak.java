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
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import objektuak.AstekoEguna;
import objektuak.Eduki;
import objektuak.EdukiZerrenda;
import objektuak.Pegi;
import objektuak.SunsetCinema;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Edukiak {

	private JFrame frame;
	private EdukiZerrenda posibleak;
	private JTable tablePosibleak;
	private JTable tableEguna;
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
	private JLabel labelIzenburua;
	private Box horizontalBox_1;
	private JButton okBot;
	private JButton ezBot;
	private Component glue;
	private Component rigidArea;
	private String zein = "";
	private JComboBox pegiBox;
	private JButton btnResDia;
	private JLabel soberanDenb;
	private List<JTextField> fieldList = new ArrayList<JTextField>();

	/**
	 * Launch the application.
	 */
	public static void main(AstekoEguna eguna) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edukiak window = new Edukiak(eguna);
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
	public Edukiak(AstekoEguna eguna) {
		initialize(eguna);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(AstekoEguna eguna) {

		posibleak = SunsetCinema.getNireSunsetCinema().gehituDaitezkeEgunean(eguna);

		frame = new JFrame();
		frame.setBounds(100, 100, 997, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 0, 971, 689);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(5, 5, 899, 703);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 30, 226, 0, 104, 0, 0 };
		gbl_panel.rowHeights = new int[] { 14, 0, 166, 0, 0, 0, 0, 268, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblRegistro = new JLabel("EDUKIAK");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.gridwidth = 3;
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 1;
		gbc_lblRegistro.gridy = 0;
		panel.add(lblRegistro, gbc_lblRegistro);

		String[] izenburuak = { "ID", "Izenburua", "Iraupena" };

		JLabel lblNewLabel_1 = new JLabel("Eguneko Informazioa:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblPelicDisp = new JLabel("Aukeratu pelikula:");
		GridBagConstraints gbc_lblPelicDisp = new GridBagConstraints();
		gbc_lblPelicDisp.anchor = GridBagConstraints.WEST;
		gbc_lblPelicDisp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPelicDisp.gridx = 3;
		gbc_lblPelicDisp.gridy = 1;
		panel.add(lblPelicDisp, gbc_lblPelicDisp);
		lblPelicDisp.setFont(new Font("Tahoma", Font.BOLD, 13));

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 2;
		panel.add(scrollPane_1, gbc_scrollPane_1);

		tableEguna = new JTable();
		tableEguna.setModel(new DefaultTableModel(
				SunsetCinema.getNireSunsetCinema().infoEguna(eguna),
				new String[] {
						"Tituloa", "Hasiera Ordua", "Amaiera Ordua"
				}) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(tableEguna);

		JButton btnAnadirPelic = new JButton("<<");
		GridBagConstraints gbc_btnAnadirPelic = new GridBagConstraints();
		gbc_btnAnadirPelic.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirPelic.gridx = 2;
		gbc_btnAnadirPelic.gridy = 2;
		panel.add(btnAnadirPelic, gbc_btnAnadirPelic);
		btnAnadirPelic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eduki edukia = posibleak.getEdukia(tablePosibleak.getSelectedRow());
				SunsetCinema.getNireSunsetCinema().infoEgunaSartu(edukia, eguna);
				SunsetCinema.getNireSunsetCinema().egunakCSV();
				if (SunsetCinema.getNireSunsetCinema().egunaBetetaDago(eguna)) {
					btnResDia.setEnabled(true);
				}
				refresh(eguna);
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);

		tablePosibleak = new JTable();
		tablePosibleak.setModel(new DefaultTableModel(
			posibleak.getEditLaburpena(),
			new String[] {
				"ID", "Izenburua", "Iraupena"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablePosibleak.getColumnModel().getColumn(0).setPreferredWidth(41);
		scrollPane.setViewportView(tablePosibleak);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3.gridx = 1;
		gbc_horizontalBox_3.gridy = 4;
		panel.add(horizontalBox_3, gbc_horizontalBox_3);
		
		JLabel lblNewLabel_2 = new JLabel("Soberan Dagoen Denbora:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		horizontalBox_3.add(lblNewLabel_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_1);
		
		soberanDenb = new JLabel("");
		int iraup = SunsetCinema.getNireSunsetCinema().getIraupena(eguna);
		int egunDenb = SunsetCinema.getNireSunsetCinema().getOrduMax(eguna)*60;
		soberanDenb.setText((egunDenb-iraup) + "");
		soberanDenb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		horizontalBox_3.add(soberanDenb);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 6;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, Double.MIN_VALUE, 0.0, 1.0 };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		panel_1.setLayout(gbl_panel_1);

		/*-------------*/

		labelIzenburua = new JLabel("Eduki Berria Sortu");
		labelIzenburua.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_labelIzenburua = new GridBagConstraints();
		gbc_labelIzenburua.gridwidth = 2;
		gbc_labelIzenburua.insets = new Insets(0, 0, 5, 5);
		gbc_labelIzenburua.gridx = 1;
		gbc_labelIzenburua.gridy = 0;
		panel_1.add(labelIzenburua, gbc_labelIzenburua);

		JLabel labelID = new JLabel("ID:");
		GridBagConstraints gbc_labelID = new GridBagConstraints();
		gbc_labelID.insets = new Insets(0, 0, 5, 5);
		gbc_labelID.anchor = GridBagConstraints.WEST;
		gbc_labelID.gridx = 1;
		gbc_labelID.gridy = 1;
		panel_1.add(labelID, gbc_labelID);

		id = new JTextField();
		id.setText(SunsetCinema.getNireSunsetCinema().getAzkenId() + 1 + "");
		id.setEditable(false);

		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.insets = new Insets(0, 0, 5, 5);
		gbc_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_id.gridx = 2;
		gbc_id.gridy = 1;
		panel_1.add(id, gbc_id);
		id.setColumns(10);

		JLabel labelTitulua = new JLabel("Titulua:");
		GridBagConstraints gbc_labelTitulua = new GridBagConstraints();
		gbc_labelTitulua.anchor = GridBagConstraints.WEST;
		gbc_labelTitulua.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulua.gridx = 1;
		gbc_labelTitulua.gridy = 2;
		panel_1.add(labelTitulua, gbc_labelTitulua);

		titulua = new JTextField();
		GridBagConstraints gbc_titulua = new GridBagConstraints();
		gbc_titulua.insets = new Insets(0, 0, 5, 5);
		gbc_titulua.fill = GridBagConstraints.HORIZONTAL;
		gbc_titulua.gridx = 2;
		gbc_titulua.gridy = 2;
		panel_1.add(titulua, gbc_titulua);
		titulua.setColumns(10);

		JLabel labelIrau = new JLabel("Iraupena:");
		GridBagConstraints gbc_labelIrau = new GridBagConstraints();
		gbc_labelIrau.anchor = GridBagConstraints.WEST;
		gbc_labelIrau.insets = new Insets(0, 0, 5, 5);
		gbc_labelIrau.gridx = 1;
		gbc_labelIrau.gridy = 3;
		panel_1.add(labelIrau, gbc_labelIrau);

		iraupena = new JTextField();
		GridBagConstraints gbc_iraupena = new GridBagConstraints();
		gbc_iraupena.insets = new Insets(0, 0, 5, 5);
		gbc_iraupena.fill = GridBagConstraints.HORIZONTAL;
		gbc_iraupena.gridx = 2;
		gbc_iraupena.gridy = 3;
		panel_1.add(iraupena, gbc_iraupena);
		iraupena.setColumns(10);

		panelLab = new JPanel();
		GridBagConstraints gbc_panelLab = new GridBagConstraints();
		gbc_panelLab.gridwidth = 2;
		gbc_panelLab.insets = new Insets(0, 0, 5, 5);
		gbc_panelLab.fill = GridBagConstraints.BOTH;
		gbc_panelLab.gridx = 1;
		gbc_panelLab.gridy = 4;
		panel_1.add(panelLab, gbc_panelLab);
		GridBagLayout gbl_panelLab = new GridBagLayout();
		gbl_panelLab.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelLab.rowHeights = new int[] { 0, 0 };
		gbl_panelLab.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelLab.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelLab.setLayout(gbl_panelLab);

		JLabel labelFabula = new JLabel("Fabula:");
		GridBagConstraints gbc_labelFabula = new GridBagConstraints();
		gbc_labelFabula.anchor = GridBagConstraints.WEST;
		gbc_labelFabula.insets = new Insets(0, 0, 0, 5);
		gbc_labelFabula.gridx = 0;
		gbc_labelFabula.gridy = 0;
		panelLab.add(labelFabula, gbc_labelFabula);

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
		gbc_panelPel.gridy = 5;
		panel_1.add(panelPel, gbc_panelPel);
		GridBagLayout gbl_panelPel = new GridBagLayout();
		gbl_panelPel.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelPel.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelPel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelPel.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelPel.setLayout(gbl_panelPel);

		JLabel labelGeneroa = new JLabel("Generoa:");
		GridBagConstraints gbc_labelGeneroa = new GridBagConstraints();
		gbc_labelGeneroa.insets = new Insets(0, 0, 5, 5);
		gbc_labelGeneroa.anchor = GridBagConstraints.WEST;
		gbc_labelGeneroa.gridx = 0;
		gbc_labelGeneroa.gridy = 0;
		panelPel.add(labelGeneroa, gbc_labelGeneroa);

		generoa = new JTextField();
		GridBagConstraints gbc_generoa = new GridBagConstraints();
		gbc_generoa.insets = new Insets(0, 0, 5, 0);
		gbc_generoa.fill = GridBagConstraints.HORIZONTAL;
		gbc_generoa.gridx = 1;
		gbc_generoa.gridy = 0;
		panelPel.add(generoa, gbc_generoa);
		generoa.setColumns(10);

		JLabel labelPEGI = new JLabel("PEGI:");
		GridBagConstraints gbc_labelPEGI = new GridBagConstraints();
		gbc_labelPEGI.anchor = GridBagConstraints.WEST;
		gbc_labelPEGI.insets = new Insets(0, 0, 0, 5);
		gbc_labelPEGI.gridx = 0;
		gbc_labelPEGI.gridy = 1;
		panelPel.add(labelPEGI, gbc_labelPEGI);

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
		gbc_panelDok.gridy = 6;
		panel_1.add(panelDok, gbc_panelDok);
		GridBagLayout gbl_panelDok = new GridBagLayout();
		gbl_panelDok.columnWidths = new int[] { 80, 0, 0 };
		gbl_panelDok.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelDok.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelDok.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelDok.setLayout(gbl_panelDok);

		JLabel labelTema = new JLabel("Tema:");
		GridBagConstraints gbc_labelTema = new GridBagConstraints();
		gbc_labelTema.insets = new Insets(0, 0, 5, 5);
		gbc_labelTema.anchor = GridBagConstraints.WEST;
		gbc_labelTema.gridx = 0;
		gbc_labelTema.gridy = 0;
		panelDok.add(labelTema, gbc_labelTema);

		tema = new JTextField();
		GridBagConstraints gbc_tema = new GridBagConstraints();
		gbc_tema.insets = new Insets(0, 0, 5, 0);
		gbc_tema.fill = GridBagConstraints.HORIZONTAL;
		gbc_tema.gridx = 1;
		gbc_tema.gridy = 0;
		panelDok.add(tema, gbc_tema);
		tema.setColumns(10);

		JLabel labelProduk = new JLabel("Produktorea:");
		GridBagConstraints gbc_labelProduk = new GridBagConstraints();
		gbc_labelProduk.anchor = GridBagConstraints.WEST;
		gbc_labelProduk.insets = new Insets(0, 0, 0, 5);
		gbc_labelProduk.gridx = 0;
		gbc_labelProduk.gridy = 1;
		panelDok.add(labelProduk, gbc_labelProduk);

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
		gbc_horizontalBox.gridy = 7;
		panel_1.add(horizontalBox, gbc_horizontalBox);

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
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.gridwidth = 2;
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 8;
		panel_1.add(horizontalBox_1, gbc_horizontalBox_1);

		glue = Box.createGlue();
		horizontalBox_1.add(glue);

		rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea);

		ezBot = new JButton("Datuak Ezabatu");
		ezBot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
				refresh(eguna);
			}
		});
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

		/*-------------*/

		Box horizontalBox_2 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 3;
		gbc_horizontalBox_2.gridy = 8;
		panel.add(horizontalBox_2, gbc_horizontalBox_2);

		JButton sortu = new JButton("+");
		sortu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balidatu(eguna);
				reset();
			}
		});
		horizontalBox_2.add(sortu);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea);

		JButton kendu = new JButton("-");
		kendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eduki edukia = posibleak.getEdukia(tablePosibleak.getSelectedRow());
				posibleak.ezabatuById(edukia.getId());
				SunsetCinema.getNireSunsetCinema().edukiaKendu(edukia.getId());
				refresh(eguna);
			}
		});
		horizontalBox_2.add(kendu);

		Component glue = Box.createGlue();
		horizontalBox_2.add(glue);

		JButton btnCancelar = new JButton("Kantzelatu");
		horizontalBox_2.add(btnCancelar);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_4);

		JButton btnConfirmar = new JButton("Baieztatu");
		horizontalBox_2.add(btnConfirmar);

		btnResDia = new JButton("Eguneko Laburpena");
		btnResDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				EgunLaburpena.main(eguna);
			}
		});
		GridBagConstraints gbc_btnResDia = new GridBagConstraints();
		gbc_btnResDia.fill = GridBagConstraints.VERTICAL;
		gbc_btnResDia.anchor = GridBagConstraints.WEST;
		gbc_btnResDia.insets = new Insets(0, 0, 5, 5);
		gbc_btnResDia.gridx = 1;
		gbc_btnResDia.gridy = 9;
		panel.add(btnResDia, gbc_btnResDia);
		btnResDia.setEnabled(false);

		JButton btnBueltatu = new JButton("Bueltatu Egun Aukeraketara");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 9;
		panel.add(btnBueltatu, gbc_btnNewButton_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setIcon(new ImageIcon(Edukiak.class.getResource("/imagenes/logoa/logo_gris_grande.png")));
		lblNewLabel.setBounds(156, 5, 472, 524);
		contentPane.add(lblNewLabel);

		btnBueltatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				EgunaAukeratu.main(null);
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SunsetCinema.getNireSunsetCinema().kargatuEdukiak();
				posibleak = SunsetCinema.getNireSunsetCinema().gehituDaitezkeEgunean(eguna);
				refresh(eguna);
				reset();
			}
		});

		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editCheck();
					SunsetCinema.getNireSunsetCinema().edukiakCSV();
					refresh(eguna);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refresh(eguna);
			}

			private void editCheck() {
				for (int i = 0; i < tablePosibleak.getRowCount(); i++) {
					String newTitle = (String) tablePosibleak.getValueAt(i, 1);
					int newDenb = Integer.parseInt( tablePosibleak.getValueAt(i, 2).toString() );
					SunsetCinema.getNireSunsetCinema().edukiaEditatu(posibleak.getEdukia(i), newTitle, newDenb);
				}
			}
		});

	}

	/** Laburmetraietara aldatzeko metodoa */
	private void aldatuLab() {
		panelLab.setVisible(true);
		panelPel.setVisible(false);
		panelDok.setVisible(false);
		produktorea.setText("");
		generoa.setText("");
		tema.setText("");
		zein = "Lab";
	}

	
	/** Pelikuletara aldatzeko metodoa */
	private void aldatuPel() {
		panelLab.setVisible(false);
		panelPel.setVisible(true);
		panelDok.setVisible(false);
		produktorea.setText("");
		fabula.setText("");
		tema.setText("");
		zein = "Pel";
	}

	/** Dokumentaletara aldatzeko metodoa */
	private void aldatuDok() {
		panelLab.setVisible(false);
		panelPel.setVisible(false);
		panelDok.setVisible(true);
		produktorea.setText("");
		tema.setText("");
		zein = "Dok";
	}

	/** Sartutako datuak sortzeko klasea */
	private void sortu(AstekoEguna eguna) {
		if (botoiak.getSelection() == null)
			return;
		switch (zein.toLowerCase()) {
			case "lab":
				if (SunsetCinema.getNireSunsetCinema().gehituLarb(Integer.parseInt(id.getText()), titulua.getText(),
						Integer.parseInt(iraupena.getText()), fabula.getText())) {

					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");
				} else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}

				break;
			case "pel":
				if (SunsetCinema.getNireSunsetCinema().gehituPelik(Integer.parseInt(id.getText()), titulua.getText(),
						Integer.parseInt(iraupena.getText()), generoa.getText(), (Pegi) pegiBox.getSelectedItem())) {
					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");

				} else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}
				break;
			case "dok":
				if (SunsetCinema.getNireSunsetCinema().gehituDoku(Integer.parseInt(id.getText()), titulua.getText(),
						Integer.parseInt(iraupena.getText()), tema.getText(), produktorea.getText())) {
					JOptionPane.showMessageDialog(null, "Edukia ondo sortu da");

				} else {
					JOptionPane.showMessageDialog(null, "Edukia existitzen da");
				}
				break;
		}
		refresh(eguna);
	}

	/** Datuak balidatzeko metodoa */
	private void balidatu(AstekoEguna eguna) {
		if (id.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Id-aren eremua bete behar da");
		} else if (titulua.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Izenburuaren eremua bete behar da");
		} else if (iraupena.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Iraupena-ren eremua bete behar da");
		} else if (zein.equalsIgnoreCase("Lab")) {
			if (fabula.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Fabularen eremua bete behar da");
			} else {
				sortu(eguna);
			}
		} else if (zein.equalsIgnoreCase("Pel")) {
			if (pegiBox.getSelectedIndex() < 0) {
				JOptionPane.showMessageDialog(null, "PEGI-aren eremua aukeratu behar da");
			} else if (generoa.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Generoaren eremua bete behar da");
			} else {
				sortu(eguna);
			}
		} else if (zein.equalsIgnoreCase("Dok")) {
			if (produktorea.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Produktorearen eremua bete behar da");
			} else if (tema.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Temaren eremua bete behar da");
			} else {
				sortu(eguna);
			}
		}
	}

	/** Tablak errefreskatzeko metodoa */
	private void refresh(AstekoEguna eguna) {
		if (SunsetCinema.getNireSunsetCinema().egunaBetetaDago(eguna)) {
			btnResDia.setEnabled(true);
		}

		int iraup = SunsetCinema.getNireSunsetCinema().getIraupena(eguna);
		int egunDenb = SunsetCinema.getNireSunsetCinema().getOrduMax(eguna)*60;
		soberanDenb.setText((egunDenb-iraup) + "");

		posibleak = SunsetCinema.getNireSunsetCinema().gehituDaitezkeEgunean(eguna);
		String[] izenburuak = { "ID", "Izenburua", "Iraupena" };
		tablePosibleak.setModel(new DefaultTableModel(
				posibleak.getEditLaburpena(),
				izenburuak) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, Integer.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, true, true
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		tableEguna.setModel(new DefaultTableModel(
				SunsetCinema.getNireSunsetCinema().infoEguna(eguna),
				new String[] {
						"Tituloa", "Hasiera Ordua", "Amaiera Ordua"
				}) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	}

	private void reset() {
		for (JTextField textF : fieldList) {
			textF.setText("");
		}
		this.id.setText(String.valueOf(SunsetCinema.getNireSunsetCinema().getAzkenId() + 1));
	}
}