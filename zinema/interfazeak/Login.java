package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextField;

import objektuak.SunsetCinema;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField textFieldErabiltzailea;
	private JTextField textFieldPasahitza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setContentPane(new JLabel(new
		// ImageIcon("C:\\Users\\in1dam\\eclipse-workspace\\Interface\\src\\logoGris.png")));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 1;
		gbc_lblLogin.gridy = 1;
		frame.getContentPane().add(lblLogin, gbc_lblLogin);

		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 3;
		frame.getContentPane().add(horizontalBox, gbc_horizontalBox);

		JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
		horizontalBox.add(lblErabiltzailea);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox.add(rigidArea);

		textFieldErabiltzailea = new JTextField();
		horizontalBox.add(textFieldErabiltzailea);
		textFieldErabiltzailea.setColumns(10);

		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 4;
		frame.getContentPane().add(horizontalBox_1, gbc_horizontalBox_1);

		JLabel lblPasahitza = new JLabel("Pasahitza:");
		horizontalBox_1.add(lblPasahitza);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_1);

		textFieldPasahitza = new JPasswordField();
		textFieldPasahitza.setColumns(10);
		horizontalBox_1.add(textFieldPasahitza);

		Box horizontalBox_1_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1_1 = new GridBagConstraints();
		gbc_horizontalBox_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1_1.gridx = 1;
		gbc_horizontalBox_1_1.gridy = 5;
		frame.getContentPane().add(horizontalBox_1_1, gbc_horizontalBox_1_1);

		JButton btnAtzera = new JButton("Atzera");
		horizontalBox_1_1.add(btnAtzera);

		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_1.add(rigidArea_1_1);

		JButton btnLogeatu = new JButton("Logeatu");
		btnLogeatu.addActionListener(a -> logeatu());
		horizontalBox_1_1.add(btnLogeatu);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1_1.add(rigidArea_2);

		JButton btnErregistratu = new JButton("Erregistratu");
		horizontalBox_1_1.add(btnErregistratu);

		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Ongietorria.main(null);
			}
		});

		btnErregistratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Registro.main(null);
			}
		});

	}

	public void logeatu() {
		if (SunsetCinema.getNireSunsetCinema().logeatu(
				textFieldErabiltzailea.getText(),
				textFieldPasahitza.getText())) {
			frame.setVisible(false);
			EdukiAukeraketa.main(null);
		}
	}

}
