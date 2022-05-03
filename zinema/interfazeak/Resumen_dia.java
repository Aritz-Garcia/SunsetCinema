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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Resumen_dia {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

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
		frame.getContentPane().setMinimumSize(new Dimension(1, 1000));
		frame.setBounds(100, 100, 796, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 434, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 45, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		String tituloak[]= {"Tituloa", "Iraupena", "Hasiera Ordua", "Amaiera Ordua"};
		String info[][]= proba();
		
		JLabel lblResumenDia = new JLabel("RESUMEN DE D\u00CDA");
		lblResumenDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResumenDia.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblResumenDia = new GridBagConstraints();
		gbc_lblResumenDia.insets = new Insets(0, 0, 5, 5);
		gbc_lblResumenDia.gridx = 1;
		gbc_lblResumenDia.gridy = 1;
		frame.getContentPane().add(lblResumenDia, gbc_lblResumenDia);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);
		table = new JTable(info, tituloak);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 2;
		frame.getContentPane().add(scrollPane_1, gbc_scrollPane_1);
		
		String tituloEguna[]= {"Tituloa"};
		String infoEguna[][]= proba();
		table_1 = new JTable(infoEguna, tituloEguna);
		scrollPane_1.setViewportView(table_1);
		
		JButton btnConfirmar = new JButton("Confirmar");
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 1;
		gbc_btnConfirmar.gridy = 4;
		frame.getContentPane().add(btnConfirmar, gbc_btnConfirmar);
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
