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
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 115, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblResumenDia = new JLabel("RESUMEN DE D\u00CDA");
		lblResumenDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResumenDia.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblResumenDia = new GridBagConstraints();
		gbc_lblResumenDia.insets = new Insets(0, 0, 5, 5);
		gbc_lblResumenDia.gridx = 1;
		gbc_lblResumenDia.gridy = 1;
		panel.add(lblResumenDia, gbc_lblResumenDia);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 3;
		panel.add(table, gbc_table);
		
		Box verticalBox = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 1;
		gbc_verticalBox.gridy = 4;
		panel.add(verticalBox, gbc_verticalBox);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel lblPelikula = new JLabel("PELIKULA");
		horizontalBox.add(lblPelikula);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox.add(rigidArea);
		
		JLabel lblIraupena = new JLabel("IRAUPENA");
		horizontalBox.add(lblIraupena);
		
		Component verticalStrut = Box.createVerticalStrut(5);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JLabel lblHoraInicio = new JLabel("Hora Inicio:");
		lblHoraInicio.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1.add(lblHoraInicio);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_1);
		
		JLabel lblHInicio = new JLabel("Hora");
		horizontalBox_1.add(lblHInicio);
		
		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_1_1);
		
		JLabel lblHoraFin = new JLabel("Hora Fin:");
		lblHoraFin.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1.add(lblHoraFin);
		
		Component rigidArea_1_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_1_2);
		
		JLabel lblHFin_1 = new JLabel("Hora");
		horizontalBox_1.add(lblHFin_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_1 = new GridBagConstraints();
		gbc_verticalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_1.gridx = 1;
		gbc_verticalBox_1.gridy = 5;
		panel.add(verticalBox_1, gbc_verticalBox_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		JLabel lblPelikula_1 = new JLabel("PELIKULA");
		horizontalBox_2.add(lblPelikula_1);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_2);
		
		JLabel lblIraupena_1 = new JLabel("IRAUPENA");
		horizontalBox_2.add(lblIraupena_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(5);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1_1);
		
		JLabel lblHoraInicio_1 = new JLabel("Hora Inicio:");
		lblHoraInicio_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_1.add(lblHoraInicio_1);
		
		Component rigidArea_1_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_1.add(rigidArea_1_3);
		
		JLabel lblHInicio_1 = new JLabel("Hora");
		horizontalBox_1_1.add(lblHInicio_1);
		
		Component rigidArea_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_1.add(rigidArea_1_1_1);
		
		JLabel lblHoraFin_1 = new JLabel("Hora Fin:");
		lblHoraFin_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_1.add(lblHoraFin_1);
		
		Component rigidArea_1_2_1 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_1.add(rigidArea_1_2_1);
		
		JLabel lblHFin_1_1 = new JLabel("Hora");
		horizontalBox_1_1.add(lblHFin_1_1);
		
		Box verticalBox_2 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_2 = new GridBagConstraints();
		gbc_verticalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_2.gridx = 1;
		gbc_verticalBox_2.gridy = 6;
		panel.add(verticalBox_2, gbc_verticalBox_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_3);
		
		JLabel lblPelikula_2 = new JLabel("PELIKULA");
		horizontalBox_3.add(lblPelikula_2);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_3);
		
		JLabel lblIraupena_2 = new JLabel("IRAUPENA");
		horizontalBox_3.add(lblIraupena_2);
		
		Component verticalStrut_2 = Box.createVerticalStrut(5);
		verticalBox_2.add(verticalStrut_2);
		
		Box horizontalBox_1_2 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_1_2);
		
		JLabel lblHoraInicio_2 = new JLabel("Hora Inicio:");
		lblHoraInicio_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_2.add(lblHoraInicio_2);
		
		Component rigidArea_1_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_2.add(rigidArea_1_4);
		
		JLabel lblHInicio_2 = new JLabel("Hora");
		horizontalBox_1_2.add(lblHInicio_2);
		
		Component rigidArea_1_1_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_2.add(rigidArea_1_1_2);
		
		JLabel lblHoraFin_2 = new JLabel("Hora Fin:");
		lblHoraFin_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_2.add(lblHoraFin_2);
		
		Component rigidArea_1_2_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_2.add(rigidArea_1_2_2);
		
		JLabel lblHFin_1_2 = new JLabel("Hora");
		horizontalBox_1_2.add(lblHFin_1_2);
		
		Box verticalBox_3 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_3 = new GridBagConstraints();
		gbc_verticalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_3.gridx = 1;
		gbc_verticalBox_3.gridy = 7;
		panel.add(verticalBox_3, gbc_verticalBox_3);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_4);
		
		JLabel lblPelikula_3 = new JLabel("PELIKULA");
		horizontalBox_4.add(lblPelikula_3);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_4);
		
		JLabel lblIraupena_3 = new JLabel("IRAUPENA");
		horizontalBox_4.add(lblIraupena_3);
		
		Component verticalStrut_3 = Box.createVerticalStrut(5);
		verticalBox_3.add(verticalStrut_3);
		
		Box horizontalBox_1_3 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_1_3);
		
		JLabel lblHoraInicio_3 = new JLabel("Hora Inicio:");
		lblHoraInicio_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_3.add(lblHoraInicio_3);
		
		Component rigidArea_1_5 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_3.add(rigidArea_1_5);
		
		JLabel lblHInicio_3 = new JLabel("Hora");
		horizontalBox_1_3.add(lblHInicio_3);
		
		Component rigidArea_1_1_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_3.add(rigidArea_1_1_3);
		
		JLabel lblHoraFin_3 = new JLabel("Hora Fin:");
		lblHoraFin_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_3.add(lblHoraFin_3);
		
		Component rigidArea_1_2_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_3.add(rigidArea_1_2_3);
		
		JLabel lblHFin_1_3 = new JLabel("Hora");
		horizontalBox_1_3.add(lblHFin_1_3);
		
		Box verticalBox_4 = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox_4 = new GridBagConstraints();
		gbc_verticalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_4.gridx = 1;
		gbc_verticalBox_4.gridy = 8;
		panel.add(verticalBox_4, gbc_verticalBox_4);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_5);
		
		JLabel lblPelikula_4 = new JLabel("PELIKULA");
		horizontalBox_5.add(lblPelikula_4);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_5);
		
		JLabel lblIraupena_4 = new JLabel("IRAUPENA");
		horizontalBox_5.add(lblIraupena_4);
		
		Component verticalStrut_4 = Box.createVerticalStrut(5);
		verticalBox_4.add(verticalStrut_4);
		
		Box horizontalBox_1_4 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_1_4);
		
		JLabel lblHoraInicio_4 = new JLabel("Hora Inicio:");
		lblHoraInicio_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_4.add(lblHoraInicio_4);
		
		Component rigidArea_1_6 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_4.add(rigidArea_1_6);
		
		JLabel lblHInicio_4 = new JLabel("Hora");
		horizontalBox_1_4.add(lblHInicio_4);
		
		Component rigidArea_1_1_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_4.add(rigidArea_1_1_4);
		
		JLabel lblHoraFin_4 = new JLabel("Hora Fin:");
		lblHoraFin_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		horizontalBox_1_4.add(lblHoraFin_4);
		
		Component rigidArea_1_2_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1_4.add(rigidArea_1_2_4);
		
		JLabel lblHFin_1_4 = new JLabel("Hora");
		horizontalBox_1_4.add(lblHFin_1_4);
		
		Component verticalStrut_5 = Box.createVerticalStrut(5);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 1;
		gbc_verticalStrut_5.gridy = 9;
		panel.add(verticalStrut_5, gbc_verticalStrut_5);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_6 = new GridBagConstraints();
		gbc_horizontalBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_6.gridx = 1;
		gbc_horizontalBox_6.gridy = 10;
		panel.add(horizontalBox_6, gbc_horizontalBox_6);
		
		JButton btnContenido = new JButton("Contenido");
		horizontalBox_6.add(btnContenido);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_6);
		
		JButton btnConfirmar = new JButton("Confirmar");
		horizontalBox_6.add(btnConfirmar);
		
	}

}
