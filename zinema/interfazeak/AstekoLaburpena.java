package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

import objektuak.AstekoEguna;
import objektuak.SunsetCinema;

public class AstekoLaburpena {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AstekoLaburpena window = new AstekoLaburpena();
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
	public AstekoLaburpena() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SunsetCinema sc = SunsetCinema.getNireSunsetCinema();
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String izenburuak[] = {"Izenburua", "Hasierako ordua", "Amaierako ordua"};
		String infoLun[][] = sc.infoEguna(AstekoEguna.ASTELEHENA);
		
		String infoMar[][] = sc.infoEguna(AstekoEguna.ASTEARTEA);
		
		String infoMier[][] = sc.infoEguna(AstekoEguna.ASTEAZKENA);
		
		String infoJuev[][] = sc.infoEguna(AstekoEguna.OSTEGUNA);
		
		String infoVier[][] = sc.infoEguna(AstekoEguna.OSTIRALA);
		
		String infoSab[][] = sc.infoEguna(AstekoEguna.LARUNBATA);
		
		String infoDom[][] = sc.infoEguna(AstekoEguna.IGANDEA);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		JScrollPane scrollPane_7 = new JScrollPane();
		frame.getContentPane().add(scrollPane_7);
		
		JPanel panel = new JPanel();
		scrollPane_7.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{30, 0, 60, 0, 183, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{4.9E-324, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JLabel izenburua = new JLabel("Asteko Laburpena");
		GridBagConstraints gbc_izenburua = new GridBagConstraints();
		gbc_izenburua.insets = new Insets(0, 0, 5, 5);
		gbc_izenburua.gridx = 1;
		gbc_izenburua.gridy = 0;
		panel.add(izenburua, gbc_izenburua);
		
		JLabel lblNewLabel_1 = new JLabel("Astelehena");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		
		table = new JTable(infoLun, izenburuak);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.ASTELEHENA, table.getSelectedRow());
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Asteartea");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 4;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		table_1 = new JTable(infoMar, izenburuak);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.ASTEARTEA, table_1.getSelectedRow());
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_3 = new JLabel("Asteazkena");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 5;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 6;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		table_2 = new JTable(infoMier, izenburuak);
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.ASTEAZKENA, table_2.getSelectedRow());
			}
		});
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_4 = new JLabel("Osteguna");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 7;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 8;
		panel.add(scrollPane_3, gbc_scrollPane_3);
		
		table_3 = new JTable(infoJuev, izenburuak);
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.OSTEGUNA, table_3.getSelectedRow());
			}
		});
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel = new JLabel("Ostirala");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 9;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_4 = new GridBagConstraints();
		gbc_scrollPane_4.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_4.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_4.gridx = 1;
		gbc_scrollPane_4.gridy = 10;
		panel.add(scrollPane_4, gbc_scrollPane_4);
		
		table_4 = new JTable(infoVier, izenburuak);
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.OSTIRALA, table_4.getSelectedRow());
			}
		});
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblNewLabel_5 = new JLabel("Larunbata");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 11;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_5 = new GridBagConstraints();
		gbc_scrollPane_5.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_5.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_5.gridx = 1;
		gbc_scrollPane_5.gridy = 12;
		panel.add(scrollPane_5, gbc_scrollPane_5);
		
		table_5 = new JTable(infoSab, izenburuak);
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.LARUNBATA, table_5.getSelectedRow());
			}
		});
		scrollPane_5.setViewportView(table_5);
		
		JLabel lblNewLabel_6 = new JLabel("Igandea");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 13;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_6 = new GridBagConstraints();
		gbc_scrollPane_6.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_6.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_6.gridx = 1;
		gbc_scrollPane_6.gridy = 14;
		panel.add(scrollPane_6, gbc_scrollPane_6);
		
		table_6 = new JTable(infoDom, izenburuak);
		table_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				setEdukiInfo(AstekoEguna.IGANDEA, table_6.getSelectedRow());
			}
		});
		scrollPane_6.setViewportView(table_6);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{30, 0, 0, 68, 0, 0};
		gbl_panel_1.rowHeights = new int[]{30, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.anchor = GridBagConstraints.NORTHEAST;
		gbc_verticalBox.gridx = 3;
		gbc_verticalBox.gridy = 1;
		panel_1.add(textPane, gbc_verticalBox);
	
		JButton btnAtzera = new JButton("Atzera");
		GridBagConstraints gbc_btnAtzera = new GridBagConstraints();
		gbc_btnAtzera.insets = new Insets(0, 0, 0, 5);
		gbc_btnAtzera.gridx = 3;
		gbc_btnAtzera.gridy = 3;
		panel_1.add(btnAtzera, gbc_btnAtzera);

		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				EgunaAukeratu.main(null);
			}
		});
		
	}
	/**
	 * Edukien inforamzioa lortzeko metodoa
	 * @param eguna Eguna
	 * @param edukia Edukia
	 */
	private void setEdukiInfo(AstekoEguna eguna, int edukia) {
		textPane.setText(SunsetCinema.getNireSunsetCinema().infoEgunEdukia(edukia, eguna));
	}
}
