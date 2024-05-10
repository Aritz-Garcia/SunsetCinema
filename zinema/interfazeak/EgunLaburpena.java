package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import objektuak.AstekoEguna;
import objektuak.SunsetCinema;

import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EgunLaburpena {

	private JFrame frame;
	private JTextPane textPane;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(AstekoEguna e) {
		SunsetCinema.getNireSunsetCinema();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EgunLaburpena window = new EgunLaburpena(e);
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
	public EgunLaburpena(AstekoEguna e) {
		initialize(e);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(AstekoEguna e) {
		frame = new JFrame();
		frame.getContentPane().setMinimumSize(new Dimension(1, 1000));
		frame.setBounds(100, 100, 796, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 434, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{30, 45, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		
		JLabel lblResumenDia = new JLabel("Eguneko Laburpena");
		lblResumenDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResumenDia.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblResumenDia = new GridBagConstraints();
		gbc_lblResumenDia.fill = GridBagConstraints.VERTICAL;
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
		
		String tituloak[]= {"Tituloa","Hasiera Ordua", "Amaiera Ordua"};
		String info[][]= SunsetCinema.getNireSunsetCinema().infoEguna(e);
		
		table_1 = new JTable(info, tituloak);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				textPane.setText(SunsetCinema.getNireSunsetCinema().infoEgunEdukia(table_1.getSelectedRow(),e));
			}
		});
		scrollPane.setViewportView(table_1);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 3;
		gbc_textPane.gridy = 2;
		frame.getContentPane().add(textPane, gbc_textPane);
		
		JButton btnConfirmar = new JButton("OK");
		btnConfirmar.addActionListener(l -> {
			frame.setVisible(false);
			EgunaAukeratu.main(null);
		});
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConfirmar.gridx = 1;
		gbc_btnConfirmar.gridy = 4;
		frame.getContentPane().add(btnConfirmar, gbc_btnConfirmar);
	}

}
