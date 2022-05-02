package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTable;

public class Resumen_dia {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resumen_dia window = new Resumen_dia();
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
	public Resumen_dia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 115, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblResumenDia = new JLabel("RESUMEN DE D\u00CDA");
		lblResumenDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResumenDia.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblResumenDia = new GridBagConstraints();
		gbc_lblResumenDia.insets = new Insets(0, 0, 5, 5);
		gbc_lblResumenDia.gridx = 1;
		gbc_lblResumenDia.gridy = 1;
		panel.add(lblResumenDia, gbc_lblResumenDia);
		
		String tituloak[]= {"Tituloa", "Iraupena", "Hasiera Ordua", "Amaiera Ordua"};
		String info[][]= proba();		
		table = new JTable(info, tituloak);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		panel.add(table, gbc_table);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 4;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JButton btnConfirmar = new JButton("Confirmar");
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 1;
		gbc_btnConfirmar.gridy = 5;
		panel.add(btnConfirmar, gbc_btnConfirmar);
	}
	
	private String[][] proba() {
		String info[][] = new String[3][4];
		
		info[0][0]="DHNSFIHBSDF";
		info[0][1]="167";
		info[0][2]="16:30";
		info[0][3]="18:00";
		info[1][0]="JHOGFIUGB";
		info[1][1]="167";
		info[1][2]="18:00";
		info[1][3]="19:00";
		info[2][0]="FDSJGUYF";
		info[2][1]="167";
		info[2][2]="19:00";
		info[2][3]="20:30";
		
		return info;
	}

}
