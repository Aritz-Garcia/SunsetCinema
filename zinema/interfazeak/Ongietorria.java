package interfazeak;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objektuak.SunsetCinema;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ongietorria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SunsetCinema.getNireSunsetCinema();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ongietorria window = new Ongietorria();
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
	public Ongietorria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Login.main(null);
			}
		});
		contentPane.setLayout(null);
		JLabel lblEdukiak = new JLabel("Ongi etorria izan Sunset Zinemara, zein pelikulak zein prezioak hoberenak diren lekua!");
		lblEdukiak.setBounds(5, 19, 489, 237);
		lblEdukiak.setBackground(new Color(240, 240, 240));
		contentPane.add(lblEdukiak);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(Ongietorria.class.getResource("/imagenes/logoa/logo_pequeno.png")));
		lblLogo.setBounds(5, 22, 489, 92);
		contentPane.add(lblLogo);
	}

	}
