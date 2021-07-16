package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaDeInicio extends JFrame {

	private JPanel contentPane;
	static VentanaDeInicio frame = new VentanaDeInicio();

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
	public VentanaDeInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 105, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(new Color(211, 211, 211));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 636, 438);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEGION\\Downloads\\micro-bbva-tcambio-dolares.png.img.320.1597958348758.png"));
		lblNewLabel.setBounds(0, 140, 320, 298);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CAMBIO DE MONEDA");
		lblNewLabel_1.setFont(new Font("Swis721 Hv BT", Font.BOLD, 27));
		lblNewLabel_1.setBounds(158, 10, 366, 66);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("INICIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana1 v1 = new Ventana1();
				v1.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(419, 99, 138, 56);
		panel.add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogin.setBounds(419, 198, 138, 56);
		panel.add(btnLogin);
		
		JButton btnCreateAcount = new JButton("CREATE ACOUNT");
		btnCreateAcount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCreateAcount.setBounds(419, 300, 175, 56);
		panel.add(btnCreateAcount);
	}

}
