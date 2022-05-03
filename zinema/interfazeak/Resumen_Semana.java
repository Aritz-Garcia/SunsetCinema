package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import objektuak.AstekoEguna;
import objektuak.SunsetCinema;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Resumen_Semana {

	private JFrame frame;
	private JTable tableLun;
	private JTable tableMar;
	private JTable tableMier;
	private JTable tableJuev;
	private JTable tableVier;
	private JTable tableSab;
	private JTable tableDom;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resumen_Semana window = new Resumen_Semana();
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
	public Resumen_Semana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SunsetCinema sc = SunsetCinema.getNireSunsetCinema();
		frame = new JFrame();
		frame.setBounds(100, 100, 1500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 20, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		String titulos[] = {"Izenburua", "Hasierako ordua", "Amaierako ordua"};
		String infoLun[][] = sc.infoEguna(AstekoEguna.ASTELEHENA);
		
		JLabel lblResumenDia = new JLabel("RESUMEN DE SEMANA");
		lblResumenDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResumenDia.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblResumenDia = new GridBagConstraints();
		gbc_lblResumenDia.gridwidth = 3;
		gbc_lblResumenDia.insets = new Insets(0, 0, 5, 5);
		gbc_lblResumenDia.gridx = 3;
		gbc_lblResumenDia.gridy = 1;
		panel.add(lblResumenDia, gbc_lblResumenDia);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 20, 5);
		gbc_verticalStrut.gridx = 4;
		gbc_verticalStrut.gridy = 2;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblAstelehena_1 = new JLabel("Astelehena");
		GridBagConstraints gbc_lblAstelehena_1 = new GridBagConstraints();
		gbc_lblAstelehena_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAstelehena_1.gridx = 1;
		gbc_lblAstelehena_1.gridy = 3;
		panel.add(lblAstelehena_1, gbc_lblAstelehena_1);
		lblAstelehena_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblAsteartea = new JLabel("Asteartea");
		GridBagConstraints gbc_lblAsteartea = new GridBagConstraints();
		gbc_lblAsteartea.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsteartea.gridx = 3;
		gbc_lblAsteartea.gridy = 3;
		panel.add(lblAsteartea, gbc_lblAsteartea);
		lblAsteartea.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblAsteazkena = new JLabel("Asteazkena");
		GridBagConstraints gbc_lblAsteazkena = new GridBagConstraints();
		gbc_lblAsteazkena.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsteazkena.gridx = 5;
		gbc_lblAsteazkena.gridy = 3;
		panel.add(lblAsteazkena, gbc_lblAsteazkena);
		lblAsteazkena.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblOsteguna = new JLabel("Osteguna");
		GridBagConstraints gbc_lblOsteguna = new GridBagConstraints();
		gbc_lblOsteguna.insets = new Insets(0, 0, 5, 5);
		gbc_lblOsteguna.gridx = 7;
		gbc_lblOsteguna.gridy = 3;
		panel.add(lblOsteguna, gbc_lblOsteguna);
		lblOsteguna.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		Box verticalBox = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 1;
		gbc_verticalBox.gridy = 4;
		panel.add(verticalBox, gbc_verticalBox);
		
		tableLun = new JTable(infoLun, titulos);
		tableLun.setEnabled(false);
		tableLun.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox.add(tableLun);
		
		Box verticalBox_1 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_1 = new GridBagConstraints();
		gbc_verticalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_1.gridx = 3;
		gbc_verticalBox_1.gridy = 4;
		panel.add(verticalBox_1, gbc_verticalBox_1);
		
		String infoMar[][] = sc.infoEguna(AstekoEguna.ASTEARTEA);
		tableMar = new JTable(infoMar, titulos);
		tableMar.setEnabled(false);
		tableMar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_1.add(tableMar);
		
		Box verticalBox_2 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_2 = new GridBagConstraints();
		gbc_verticalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_2.gridx = 5;
		gbc_verticalBox_2.gridy = 4;
		panel.add(verticalBox_2, gbc_verticalBox_2);
		
		String infoMier[][] = sc.infoEguna(AstekoEguna.ASTEAZKENA);
		tableMier = new JTable(infoMier, titulos);
		tableMier.setEnabled(false);
		tableMier.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_2.add(tableMier);
		
		Box verticalBox_3 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_3 = new GridBagConstraints();
		gbc_verticalBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_3.gridx = 7;
		gbc_verticalBox_3.gridy = 4;
		panel.add(verticalBox_3, gbc_verticalBox_3);
		
		String infoJuev[][] = sc.infoEguna(AstekoEguna.OSTEGUNA);
		tableJuev = new JTable(infoJuev, titulos);
		tableJuev.setEnabled(false);
		tableJuev.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_3.add(tableJuev);
		
		String infoVier[][] = sc.infoEguna(AstekoEguna.OSTIRALA);
		
		JLabel lblOstirala = new JLabel("Ostirala");
		GridBagConstraints gbc_lblOstirala = new GridBagConstraints();
		gbc_lblOstirala.insets = new Insets(0, 0, 5, 5);
		gbc_lblOstirala.gridx = 1;
		gbc_lblOstirala.gridy = 5;
		panel.add(lblOstirala, gbc_lblOstirala);
		lblOstirala.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		JLabel lblLarunbata = new JLabel("Larunbata");
		GridBagConstraints gbc_lblLarunbata = new GridBagConstraints();
		gbc_lblLarunbata.insets = new Insets(0, 0, 5, 5);
		gbc_lblLarunbata.gridx = 3;
		gbc_lblLarunbata.gridy = 5;
		panel.add(lblLarunbata, gbc_lblLarunbata);
		lblLarunbata.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblIgandea = new JLabel("Igandea");
		GridBagConstraints gbc_lblIgandea = new GridBagConstraints();
		gbc_lblIgandea.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgandea.gridx = 5;
		gbc_lblIgandea.gridy = 5;
		panel.add(lblIgandea, gbc_lblIgandea);
		lblIgandea.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIgandea.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgandea.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		Box verticalBox_4 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_4 = new GridBagConstraints();
		gbc_verticalBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_4.gridx = 1;
		gbc_verticalBox_4.gridy = 6;
		panel.add(verticalBox_4, gbc_verticalBox_4);
		tableVier = new JTable(infoVier, titulos);
		tableVier.setEnabled(false);
		tableVier.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_4.add(tableVier);
		
		String infoSab[][] = sc.infoEguna(AstekoEguna.LARUNBATA);
		
		Box verticalBox_5 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_5 = new GridBagConstraints();
		gbc_verticalBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_5.gridx = 3;
		gbc_verticalBox_5.gridy = 6;
		panel.add(verticalBox_5, gbc_verticalBox_5);
		tableSab = new JTable(infoSab, titulos);
		tableSab.setEnabled(false);
		tableSab.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_5.add(tableSab);
		
		String infoDom[][] = sc.infoEguna(AstekoEguna.IGANDEA);
		
		
		Box verticalBox_6 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_6 = new GridBagConstraints();
		gbc_verticalBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_6.gridx = 5;
		gbc_verticalBox_6.gridy = 6;
		panel.add(verticalBox_6, gbc_verticalBox_6);
		tableDom = new JTable(infoDom, titulos);
		tableDom.setEnabled(false);
		tableDom.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		verticalBox_6.add(tableDom);
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 7;
		gbc_horizontalBox.gridy = 6;
		panel.add(horizontalBox, gbc_horizontalBox);
		
		JButton btnSelecDia = new JButton("Itzuli Eguna Aukeratu");
		horizontalBox.add(btnSelecDia);
		
		btnSelecDia.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
            	frame.setVisible(false);
            	EgunaAukeratu.main(null);
            }
		});
	}
}
