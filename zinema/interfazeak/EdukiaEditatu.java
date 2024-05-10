package interfazeak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import objektuak.Eduki;

import java.awt.Font;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

public class EdukiaEditatu {

	private JFrame frame;
	private JTextField izenburua;
	private JTextField iraupena;

	/**
	 * Launch the application.
	 */
	public static void main(Eduki e) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdukiaEditatu window = new EdukiaEditatu(e);
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
	public EdukiaEditatu(Eduki e) {
		initialize(e);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Eduki e) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel_3 = new JLabel("Editatu Edukia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 2;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Izenburua:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		izenburua = new JTextField();
		izenburua.setText(e.getTitulua());
		GridBagConstraints gbc_izenburua = new GridBagConstraints();
		gbc_izenburua.insets = new Insets(0, 0, 5, 5);
		gbc_izenburua.fill = GridBagConstraints.HORIZONTAL;
		gbc_izenburua.gridx = 2;
		gbc_izenburua.gridy = 2;
		frame.getContentPane().add(izenburua, gbc_izenburua);
		izenburua.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Iraupena:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		iraupena = new JTextField();
		iraupena.setText(String.valueOf(e.getIraupena()));
		GridBagConstraints gbc_iraupena = new GridBagConstraints();
		gbc_iraupena.insets = new Insets(0, 0, 5, 5);
		gbc_iraupena.fill = GridBagConstraints.HORIZONTAL;
		gbc_iraupena.gridx = 2;
		gbc_iraupena.gridy = 3;
		frame.getContentPane().add(iraupena, gbc_iraupena);
		iraupena.setColumns(10);
		
		Box horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_horizontalBox.gridwidth = 2;
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 1;
		gbc_horizontalBox.gridy = 4;
		frame.getContentPane().add(horizontalBox, gbc_horizontalBox);
		
		Component glue = Box.createGlue();
		horizontalBox.add(glue);
		
		JButton btnNewButton = new JButton("OK");
		horizontalBox.add(btnNewButton);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox.add(rigidArea);
		
		JButton btnNewButton_1 = new JButton("Kantzelatu");
		horizontalBox.add(btnNewButton_1);
	}

}
