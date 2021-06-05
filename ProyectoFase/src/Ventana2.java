//IMPLEMENTADO POR ISMAEL RODRIGUEZ

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static Ventana2 frame = new Ventana2();

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
	public Ventana2() {
		setTitle("De Soles a Dolares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de soles: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(25, 184, 246, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("La cantidad en dolares es:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(25, 339, 245, 33);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(364, 189, 166, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(364, 340, 166, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("convertir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertirButtonClicked();
				
			}
		});
		btnNewButton.setBounds(362, 267, 201, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana1 v1 = new Ventana1();
				v1.setVisible(true);
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_1.setBounds(10, 20, 92, 33);
		contentPane.add(btnNewButton_1);
	}

	protected void ConvertirButtonClicked() {
		double soles=0.0;
		soles=Double.parseDouble(textField.getText());
		double dolares = ConvertirDinero.ConvertirSOLESaDolares(soles);
		textField_1.setText(Double.toString(dolares));
		// TODO Auto-generated method stub
		
	}
}
