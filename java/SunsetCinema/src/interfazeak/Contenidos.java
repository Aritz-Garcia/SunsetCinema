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
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Contenidos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contenidos window = new Contenidos();
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
	public Contenidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(contentPane, BorderLayout.NORTH);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 46, 115, 0, 20, 0};
		gbl_panel.rowHeights = new int[]{0, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblRegistro = new JLabel("CONTENIDOS");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setAlignmentX(0.5f);
		GridBagConstraints gbc_lblRegistro = new GridBagConstraints();
		gbc_lblRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistro.gridx = 2;
		gbc_lblRegistro.gridy = 1;
		panel.add(lblRegistro, gbc_lblRegistro);
		
		JLabel lblPelicDisp = new JLabel("Peliculas Disponibles:");
		lblPelicDisp.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblPelicDisp = new GridBagConstraints();
		gbc_lblPelicDisp.insets = new Insets(0, 0, 5, 5);
		gbc_lblPelicDisp.gridx = 2;
		gbc_lblPelicDisp.gridy = 3;
		panel.add(lblPelicDisp, gbc_lblPelicDisp);
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 2;
		gbc_horizontalBox.gridy = 4;
		panel.add(horizontalBox, gbc_horizontalBox);
		
		JLabel lblPeliculak = new JLabel("Aukeratu pelikula:");
		horizontalBox.add(lblPeliculak);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox.add(rigidArea);
		
		JComboBox comboBoxPelikulak = new JComboBox();
		horizontalBox.add(comboBoxPelikulak);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_1 = new GridBagConstraints();
		gbc_horizontalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_1.gridx = 2;
		gbc_horizontalBox_1.gridy = 5;
		panel.add(horizontalBox_1, gbc_horizontalBox_1);
		
		JButton btnEditar = new JButton("Editar");
		horizontalBox_1.add(btnEditar);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(15, 20));
		horizontalBox_1.add(rigidArea_1);
		
		JButton btnBorrar = new JButton("Borrar");
		horizontalBox_1.add(btnBorrar);
		
		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(15, 20));
		horizontalBox_1.add(rigidArea_1_1);
		
		JButton btnNuevo = new JButton("Nuevo");
		horizontalBox_1.add(btnNuevo);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_2 = new GridBagConstraints();
		gbc_horizontalBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_2.gridx = 2;
		gbc_horizontalBox_2.gridy = 6;
		panel.add(horizontalBox_2, gbc_horizontalBox_2);
		
		JButton btnCancelar = new JButton("Cancelar");
		horizontalBox_2.add(btnCancelar);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_2);
		
		JButton btnConfirmar = new JButton("Confirmar");
		horizontalBox_2.add(btnConfirmar);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox_3 = new GridBagConstraints();
		gbc_horizontalBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox_3.gridx = 2;
		gbc_horizontalBox_3.gridy = 8;
		panel.add(horizontalBox_3, gbc_horizontalBox_3);
		
		JButton btnAnadirPelic = new JButton("A\u00F1adir Pelicula");
		horizontalBox_3.add(btnAnadirPelic);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_3);
		
		JButton btnResDia = new JButton("Resumen del D\u00EDa");
		btnResDia.setEnabled(false);
		horizontalBox_3.add(btnResDia);
		
	}

}
