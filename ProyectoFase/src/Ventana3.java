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

public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static Ventana3 frame = new Ventana3();

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
	public Ventana3() {
		setTitle("De Dolares a Soles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el monto en dolares");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(37, 184, 259, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("La cantidad en soles es : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(37, 350, 195, 47);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(359, 191, 161, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 357, 161, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("convertir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConvertirButtonClicked();
				
			}
		});
		btnNewButton.setBounds(359, 266, 195, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana1 v1 = new Ventana1();
				v1.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 10, 91, 40);
		contentPane.add(btnNewButton_1);
	}
	
	protected void ConvertirButtonClicked() {
		double dolares=0.0;
		dolares=Double.parseDouble(textField.getText());
		double soles = ConvertirDinero.ConvertirDolaresASoles(dolares);
		textField_1.setText(Double.toString(soles));
		// TODO Auto-generated method stub
		
	}

}
