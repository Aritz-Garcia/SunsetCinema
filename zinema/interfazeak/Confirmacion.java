package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import objektuak.SunsetCinema;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;

public class Confirmacion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirmacion window = new Confirmacion();
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
	public Confirmacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 115, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 20, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setIcon(new ImageIcon(Confirmacion.class.getResource("../imagenes/logoa/logo_pequeno.png")));
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 1;
		gbc_lblLogo.gridy = 1;
		panel.add(lblLogo, gbc_lblLogo);
		
		JLabel lblConfText = new JLabel("Aldaketak gorde dira.");
		lblConfText.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblConfText = new GridBagConstraints();
		gbc_lblConfText.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfText.gridx = 1;
		gbc_lblConfText.gridy = 4;
		panel.add(lblConfText, gbc_lblConfText);
		
		JButton btnVLogin = new JButton("Loginera bueltatu");
		GridBagConstraints gbc_btnVLogin = new GridBagConstraints();
		gbc_btnVLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnVLogin.gridx = 1;
		gbc_btnVLogin.gridy = 7;
		panel.add(btnVLogin, gbc_btnVLogin);
		btnVLogin.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
				try {
					SunsetCinema.getNireSunsetCinema().edukiakCSV();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
            	frame.setVisible(false);
            	Ongietorria.main(null);
            }
		});

	}

}
