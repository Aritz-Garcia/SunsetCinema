package interfazeak;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import objektuak.SunsetCinema;

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
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.gridwidth = 2;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 1;
		gbc_lblLogin.gridy = 1;
		frame.getContentPane().add(lblLogin, gbc_lblLogin);

		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.anchor = GridBagConstraints.WEST;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 3;
		frame.getContentPane().add(horizontalBox, gbc_horizontalBox);

		Action action = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				logeatu();
			}
		};
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
		horizontalBox.add(lblErabiltzailea);
		
				textFieldErabiltzailea = new JTextField();
				GridBagConstraints gbc_textFieldErabiltzailea = new GridBagConstraints();
				gbc_textFieldErabiltzailea.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldErabiltzailea.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldErabiltzailea.gridx = 2;
				gbc_textFieldErabiltzailea.gridy = 3;
				frame.getContentPane().add(textFieldErabiltzailea, gbc_textFieldErabiltzailea);
				textFieldErabiltzailea.setColumns(10);
				
					
						textFieldErabiltzailea.addActionListener(action);

		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.anchor = GridBagConstraints.WEST;
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 1;
		gbc_horizontalBox_1.gridy = 4;
		frame.getContentPane().add(horizontalBox_1, gbc_horizontalBox_1);

		JLabel lblPasahitza = new JLabel("Pasahitza:");
		horizontalBox_1.add(lblPasahitza);
		
				textFieldPasahitza = new JPasswordField();
				GridBagConstraints gbc_textFieldPasahitza = new GridBagConstraints();
				gbc_textFieldPasahitza.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldPasahitza.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldPasahitza.gridx = 2;
				gbc_textFieldPasahitza.gridy = 4;
				frame.getContentPane().add(textFieldPasahitza, gbc_textFieldPasahitza);
				textFieldPasahitza.setColumns(10);
				textFieldPasahitza.addActionListener(action);

		Box horizontalBox_1_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1_1 = new GridBagConstraints();
		gbc_horizontalBox_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox_1_1.gridwidth = 2;
		gbc_horizontalBox_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1_1.gridx = 1;
		gbc_horizontalBox_1_1.gridy = 5;
		frame.getContentPane().add(horizontalBox_1_1, gbc_horizontalBox_1_1);

		JButton btnAtzera = new JButton("Atzera");
		horizontalBox_1_1.add(btnAtzera);
		
		Component glue = Box.createGlue();
		horizontalBox_1_1.add(glue);

		JButton btnLogeatu = new JButton("Logeatu");
		
		horizontalBox_1_1.add(btnLogeatu);
		
		Component glue_1 = Box.createGlue();
		horizontalBox_1_1.add(glue_1);

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

		

		btnLogeatu.addActionListener(action);

	}

	/** Logeatzeko errore mezuak agertzeko metodoa */
	public void logeatu() {
		if (textFieldErabiltzailea.getText().isBlank()) {
			setErrorea("Erabiltzailea eremua bete behar da.");
		}
		if (textFieldPasahitza.getText().isBlank()) {
			setErrorea("Pasahitza eremua bete behar da.");
		}
		if (SunsetCinema.getNireSunsetCinema().erabiltzaileaExistitzenDa(textFieldErabiltzailea.getText())) {
			if (SunsetCinema.getNireSunsetCinema().logeatu(
					textFieldErabiltzailea.getText(),
					textFieldPasahitza.getText())) {
				frame.setVisible(false);
				EgunaAukeratu.main(null);
			} else {
				setErrorea("Pasahitza ez da zuzena");
			}
		} else {
			setErrorea("Erabiltzailea ez da existitzen");
		}
	}

	/** Zein mezu agertu behar den agertzeko metodoa */
	private void setErrorea(String errorea) {
		JOptionPane.showMessageDialog(frame, errorea, "Errorea", JOptionPane.ERROR_MESSAGE);

	}

}
