/*package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaVentana {

	private JFrame frmHola;
	private JFrame frmHola2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaVentana window = new NuevaVentana();
					window.frmHola.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public NuevaVentana() {
		initialize();
	}

	
	private void initialize() {
		frmHola = new JFrame();
		frmHola.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmHola.setTitle("Casa de Cambio");
		frmHola.setBounds(100, 100, 515, 358);
		frmHola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola.getContentPane().setLayout(null);
		
		JLabel VarSolesADolares = new JLabel("Soles a Dolares");
		VarSolesADolares.setBounds(85, 88, 127, 23);
		frmHola.getContentPane().add(VarSolesADolares);
		
		JLabel VarDolaresASoles = new JLabel("Dolares a Soles");
		VarDolaresASoles.setBounds(268, 83, 134, 33);
		frmHola.getContentPane().add(VarDolaresASoles);
		
		JButton BotonDolaresASoles = new JButton("click aqui");
		BotonDolaresASoles.setBounds(257, 151, 85, 21);
		frmHola.getContentPane().add(BotonDolaresASoles);
		
		JButton BotonSolesADolares = new JButton("click aqui");
		BotonSolesADolares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2 = new Ventana2();
				v2.setVisible(true);
				window.frmHola.setVisible(false);
				
			}
		});
		BotonSolesADolares.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				segundaVentana();
			}
		});
		BotonSolesADolares.setBounds(85, 151, 85, 21);
		frmHola.getContentPane().add(BotonSolesADolares);
	}
	
	private void segundaVentana() {
		frmHola2 = new JFrame();
		frmHola2.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmHola2.setTitle("de Soles a Dolares");
		frmHola2.setBounds(100, 100, 515, 358);
		frmHola2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHola2.getContentPane().setLayout(null);
	}
	
}*/
