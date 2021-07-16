package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	static Ventana1 frame = new Ventana1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("CASA DE CAMBIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Soles a Dolares");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(96, 107, 168, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dolares a Soles");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(371, 93, 168, 66);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2 = new Ventana2();
				v2.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(96, 354, 114, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Click");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana3 v3 = new Ventana3();
				v3.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(343, 354, 114, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elija la operacion que desea realizar");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(128, 45, 370, 66);
		contentPane.add(lblNewLabel_2);
		
		JLabel labelmagen1 = new JLabel("");
		
		labelmagen1.setBounds(106, 183, 86, 135);
		
		ImageIcon ico1 = new ImageIcon("C:\\Users\\LEGION\\Downloads\\monedaSol.png");
		labelmagen1.setIcon(new ImageIcon(ico1.getImage().getScaledInstance(74, 179, Image.SCALE_SMOOTH)));
		contentPane.add(labelmagen1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(343, 183, 138, 135);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		
	}

}
