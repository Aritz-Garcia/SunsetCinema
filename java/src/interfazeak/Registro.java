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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 2;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 2;
		gbc_horizontalBox.gridy = 3;
		panel.add(horizontalBox, gbc_horizontalBox);
		
		JLabel lblIzena = new JLabel("Izena:");
		horizontalBox.add(lblIzena);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox.add(rigidArea);
		
		textField = new JTextField();
		textField.setColumns(10);
		horizontalBox.add(textField);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 2;
		gbc_horizontalBox_1.gridy = 4;
		panel.add(horizontalBox_1, gbc_horizontalBox_1);
		
		JLabel lblAbizena1 = new JLabel("Lehenengo abizena:");
		horizontalBox_1.add(lblAbizena1);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		horizontalBox_1.add(textField_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 2;
		gbc_horizontalBox_2.gridy = 5;
		panel.add(horizontalBox_2, gbc_horizontalBox_2);
		
		JLabel lblAbizena2 = new JLabel("Bigarren abizena:");
		horizontalBox_2.add(lblAbizena2);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		horizontalBox_2.add(textField_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3.gridx = 2;
		gbc_horizontalBox_3.gridy = 6;
		panel.add(horizontalBox_3, gbc_horizontalBox_3);
		
		JLabel lblJaiotzeData = new JLabel("Jaiotze data:");
		horizontalBox_3.add(lblJaiotzeData);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_3);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		horizontalBox_3.add(textField_3);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_4 = new GridBagConstraints();
		gbc_horizontalBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_4.gridx = 2;
		gbc_horizontalBox_4.gridy = 7;
		panel.add(horizontalBox_4, gbc_horizontalBox_4);
		
		JLabel lblEnpresaKargua = new JLabel("Enpresaren kargua:");
		horizontalBox_4.add(lblEnpresaKargua);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_4.add(rigidArea_4);
		
		JComboBox comboBoxEnpresaKargua = new JComboBox();
		horizontalBox_4.add(comboBoxEnpresaKargua);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_5 = new GridBagConstraints();
		gbc_horizontalBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_5.gridx = 2;
		gbc_horizontalBox_5.gridy = 8;
		panel.add(horizontalBox_5, gbc_horizontalBox_5);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
		horizontalBox_5.add(lblErabiltzailea);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_5.add(rigidArea_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		horizontalBox_5.add(textField_4);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_6 = new GridBagConstraints();
		gbc_horizontalBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_6.gridx = 2;
		gbc_horizontalBox_6.gridy = 9;
		panel.add(horizontalBox_6, gbc_horizontalBox_6);
		
		JLabel lblPasahitza1 = new JLabel("Pasahitza:");
		horizontalBox_6.add(lblPasahitza1);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_6.add(rigidArea_6);
		
		passwordField = new JPasswordField();
		horizontalBox_6.add(passwordField);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_7 = new GridBagConstraints();
		gbc_horizontalBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_7.gridx = 2;
		gbc_horizontalBox_7.gridy = 10;
		panel.add(horizontalBox_7, gbc_horizontalBox_7);
		
		JLabel lbllPasahitza2 = new JLabel("Errepikatu pasahitza:");
		horizontalBox_7.add(lbllPasahitza2);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_7.add(rigidArea_7);
		
		passwordField_1 = new JPasswordField();
		horizontalBox_7.add(passwordField_1);
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_8 = new GridBagConstraints();
		gbc_horizontalBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_8.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalBox_8.gridx = 2;
		gbc_horizontalBox_8.gridy = 11;
		panel.add(horizontalBox_8, gbc_horizontalBox_8);
		
		JButton btnRegistrar = new JButton("Registrar usuario");
		horizontalBox_8.add(btnRegistrar);
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_8.add(rigidArea_8);
		
		JButton btnLogin = new JButton("Volver a login");
		horizontalBox_8.add(btnLogin);
	}

}
