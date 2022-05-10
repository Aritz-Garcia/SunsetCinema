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

import objektuak.AstekoEguna;
import objektuak.Eduki;
import objektuak.SunsetCinema;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Contenidos {

	private JFrame frame;
	private ArrayList<String> ArrayPelikulak;
	private ArrayList<String> ArrayPelikulak2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(AstekoEguna eguna) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contenidos window = new Contenidos(eguna);
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
	public Contenidos(AstekoEguna eguna) {
		initialize(eguna);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(AstekoEguna eguna) {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 0, 784, 535);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(5, 5, 774, 703);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 226, 0, 104, 0};
		gbl_panel.rowHeights = new int[]{14, 0, 166, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRegistro = new JLabel("EDUKIAK");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.gridwidth = 3;
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistro.gridx = 1;
		gbc_lblRegistro.gridy = 0;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setVisible(false);
		
		String[] izenburuak = {"ID", "Izenburua", "Iraupena"};
		
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
		gbc_lblPelicDisp.insets = new Insets(0, 0, 5, 0);
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
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				SunsetCinema.getNireSunsetCinema().infoEguna(eguna),
			new String[] {
				"Tituloa", "Hasiera Ordua", "Amaiera Ordua"
			}
		) {
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
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			SunsetCinema.getNireSunsetCinema().editEguna(eguna),
			izenburuak
		) {
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
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(41);
		scrollPane.setViewportView(table);
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.anchor = GridBagConstraints.WEST;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 1;
		gbc_verticalBox.gridy = 3;
		panel.add(verticalBox, gbc_verticalBox);
		
		JButton btnEditar = new JButton("Editatu");
		verticalBox.add(btnEditar);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_2);
		
		JButton btnBorrar = new JButton("Ezabatu");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
				}
		});
		verticalBox.add(btnBorrar);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_3);
		
		JButton btnNuevo = new JButton("Berria");
		verticalBox.add(btnNuevo);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setVisible(false);
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.anchor = GridBagConstraints.WEST;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 1;
		gbc_horizontalBox_2.gridy = 4;
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
		gbc_verticalBox_2.gridy = 5;
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
		
		JButton btnBueltatu = new JButton("Bueltatu Egun Aukeraketara");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 6;
		panel.add(btnBueltatu, gbc_btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setIcon(new ImageIcon(Contenidos.class.getResource("/imagenes/logoa/logo_gris_grande.png")));
		lblNewLabel.setBounds(156, 5, 472, 524);
		contentPane.add(lblNewLabel);
		
		btnBueltatu.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
            	EgunaAukeratu.main(null);
            }
		});
		
		
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
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (verticalBox.isVisible() || horizontalBox_2.isVisible()) {
					ArrayPelikulak2=ArrayPelikulak;
					verticalBox.setVisible(false);
					horizontalBox_2.setVisible(false);
					
					verticalBox_2.setVisible(true);
				}
			}
		});

		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayPelikulak=ArrayPelikulak2;
				verticalBox.setVisible(false);
					horizontalBox_2.setVisible(false);
					
					verticalBox_2.setVisible(true);
			}
		});
		
	}
}