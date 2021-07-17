import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Test {
	
	public static void main(String[] args) throws ItemDuplicated {
		///////////////////////////////////////////////////////////////////////////////
		Persona person = new Persona(456,"ApellidosA","NombreQ@Gmail");

		BSTree<MonedasDeCambio> monedas = new BSTree<MonedasDeCambio>();
		MonedasDeCambio moneda = new MonedasDeCambio("Soles",3.0,2.0);
		monedas.insert(moneda);
		//monedas.insert(new MonedasDeCambio("Dolares",3.5,3.6));
		
		CasaCambio casas = new CasaCambio("CasaA","DireccionABC",monedas);
		ListLinked<CasaCambio> casastotales = new ListLinked<CasaCambio>();
		casastotales.insertLast(casas);
		Usuario userna = new Usuario(person,"123",casastotales);
		
		Registro reg = new Registro();
	//	System.out.println("Antes\n"+userna);
		reg.agregarRegistro(userna);
		
		System.out.println(reg);
		//System.out.println(reg.buscarRegistro(userna));
		long a = Long.parseLong("12345678945");
		//////////////////////////////////////////////////////////////////////////////
		Usuario datosDelUsuario = new Usuario(); //Falta casas
		Persona datosDePersona = new Persona(); //Listo
		ListLinked<CasaCambio> ListacasasDelUsuario = new ListLinked<CasaCambio>();
		CasaCambio casasDelUsuaio = new CasaCambio();		
		
		//////////////////////////////////////////////////////////////////////////////
		JFrame frameMenuInicio;
		final JPanel panel = new JPanel();
		
		JFrame frameregistro;
		JTextField NombrePer;
		JTextField Apellidos;
		JTextField CorreoElectronico;
		JTextField Contrasenia;
		
		JFrame frameRegistro2;
		JTextField ingresoDeNombreRegistro2;
		JTextField ingresoDeDireccionRegistro2;
		JTextField intIngresoDeMonedas;
		JTextField PrecioVenta1;
		JTextField PrecioCompra1;
		JTextField PrecioVenta2;
		JTextField PrecioCompra2;
		JTextField PrecioVenta3;
		JTextField PrecioCompra3;
		JTextField PrecioVenta4;
		JTextField PrecioCompra4;
		JTextField PrecioVenta5;
		JTextField PrecioCompra5;
		JTextField PrecioVenta6;
		JTextField PrecioCompra6;
		//int Vnumcasas;
		
		frameMenuInicio = new JFrame();
		frameMenuInicio.setVisible(true);
		
		frameregistro = new JFrame();
		frameRegistro2 = new JFrame();
		/////////////////////////////////////////////////////////////////////////////////
		frameMenuInicio.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frameMenuInicio.setResizable(false);
		frameMenuInicio.getContentPane().setBackground(Color.WHITE);
		frameMenuInicio.getContentPane().setLayout(null);
		
		JLabel IconoDeFrameMenu = new JLabel("");
		IconoDeFrameMenu.setIcon(new ImageIcon("C:\\Users\\gaboc\\Downloads\\morali.png"));
		IconoDeFrameMenu.setBounds(-61, 0, 444, 349);
		frameMenuInicio.getContentPane().add(IconoDeFrameMenu);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 348, 383, 86);
		frameMenuInicio.getContentPane().add(panel);
		
		JButton botonParaIniciarSesion = new JButton("Iniciar Sesion");
		botonParaIniciarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		botonParaIniciarSesion.setForeground(Color.WHITE);
		botonParaIniciarSesion.setBackground(SystemColor.textHighlight);
		botonParaIniciarSesion.setBounds(469, 199, 174, 41);
		frameMenuInicio.getContentPane().add(botonParaIniciarSesion);

		JButton botonParaRegistrarse = new JButton("Registrarse");
		botonParaRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameMenuInicio.setVisible(false);
				frameMenuInicio.dispose();
				frameregistro.setVisible(true);
			}
		});
		botonParaRegistrarse.setForeground(Color.WHITE);
		botonParaRegistrarse.setBackground(SystemColor.textHighlight);
		botonParaRegistrarse.setBounds(469, 98, 174, 41);
		frameMenuInicio.getContentPane().add(botonParaRegistrarse);
		
		JButton botonParaVerCasasDeCambio = new JButton("Ver Casas De Cambio");
		botonParaVerCasasDeCambio.setForeground(Color.WHITE);
		botonParaVerCasasDeCambio.setBackground(SystemColor.textHighlight);
		botonParaVerCasasDeCambio.setBounds(469, 308, 174, 41);
		frameMenuInicio.getContentPane().add(botonParaVerCasasDeCambio);
		
		JPanel panelDeMenuPrincipal = new JPanel();
		panelDeMenuPrincipal.setBounds(425, 270, 270, 10);
		frameMenuInicio.getContentPane().add(panelDeMenuPrincipal);
		frameMenuInicio.setMinimumSize(new Dimension(750, 450));
		frameMenuInicio.setBounds(100, 100, 450, 300);
		frameMenuInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		///////////////////////////////////////////////Frame Registro///////////////////////////////////////
		frameregistro.setResizable(false);
		frameregistro.getContentPane().setBackground(Color.WHITE);
		frameregistro.getContentPane().setLayout(null);
		
		JLabel iconoDeCabeceraDeRegistro1 = new JLabel("");
		iconoDeCabeceraDeRegistro1.setBackground(Color.WHITE);
		iconoDeCabeceraDeRegistro1.setBounds(10, 0, 123, 88);
		frameregistro.getContentPane().add(iconoDeCabeceraDeRegistro1);
		iconoDeCabeceraDeRegistro1.setHorizontalTextPosition(SwingConstants.CENTER);
		iconoDeCabeceraDeRegistro1.setHorizontalAlignment(SwingConstants.CENTER);
		iconoDeCabeceraDeRegistro1.setIcon(new ImageIcon("C:\\Users\\gaboc\\Downloads\\morali (4).png"));
		
		JPanel panelDeCabeceraDeRegistro1 = new JPanel();
		panelDeCabeceraDeRegistro1.setBackground(Color.DARK_GRAY);
		panelDeCabeceraDeRegistro1.setBounds(0, 0, 886, 88);
		frameregistro.getContentPane().add(panelDeCabeceraDeRegistro1);
		
		JLabel lblIngresarNombreRegistro1 = new JLabel("Ingrese Nro RUC");
		lblIngresarNombreRegistro1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresarNombreRegistro1.setBounds(30, 138, 133, 28);
		frameregistro.getContentPane().add(lblIngresarNombreRegistro1);
		
		NombrePer = new JTextField();
		NombrePer.setBounds(30, 166, 268, 28);
		frameregistro.getContentPane().add(NombrePer);
		NombrePer.setColumns(10);
		
		Apellidos = new JTextField();
		Apellidos.setColumns(10);
		Apellidos.setBounds(30, 233, 268, 28);
		frameregistro.getContentPane().add(Apellidos);
		
		JLabel lblIngresoApellidos = new JLabel("Ingrese Nombres Y Apellidos");
		lblIngresoApellidos.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoApellidos.setBounds(30, 205, 200, 28);
		frameregistro.getContentPane().add(lblIngresoApellidos);
		
		CorreoElectronico = new JTextField();
		CorreoElectronico.setColumns(10);
		CorreoElectronico.setBounds(415, 166, 268, 28);
		frameregistro.getContentPane().add(CorreoElectronico);
		
		JLabel lblIngresoCorreoElectronicoRegistro1 = new JLabel("Correo Electronico");
		lblIngresoCorreoElectronicoRegistro1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoCorreoElectronicoRegistro1.setBounds(415, 138, 133, 28);
		frameregistro.getContentPane().add(lblIngresoCorreoElectronicoRegistro1);
		
		JLabel lblIngresoDatosPersonalesRegistro1 = new JLabel("Datos Personales:");
		lblIngresoDatosPersonalesRegistro1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoDatosPersonalesRegistro1.setBounds(30, 99, 133, 28);
		frameregistro.getContentPane().add(lblIngresoDatosPersonalesRegistro1);
		
		JLabel lblIngresoContraseniaRegistro1 = new JLabel("Contrase\u00F1a");
		lblIngresoContraseniaRegistro1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoContraseniaRegistro1.setBounds(415, 205, 133, 28);
		frameregistro.getContentPane().add(lblIngresoContraseniaRegistro1);
		
		Contrasenia = new JTextField();
		Contrasenia.setColumns(10);
		Contrasenia.setBounds(415, 233, 268, 28);
		frameregistro.getContentPane().add(Contrasenia);
		
		JLabel lblIngresoDatosDeUsuario = new JLabel("Datos de Usuario:");
		lblIngresoDatosDeUsuario.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoDatosDeUsuario.setBounds(415, 99, 133, 28);
		frameregistro.getContentPane().add(lblIngresoDatosDeUsuario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(348, 99, 10, 256);
		frameregistro.getContentPane().add(panel_1);
		
		JButton botonSiguienteRegistro1 = new JButton("Siguiente");
		botonSiguienteRegistro1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long Vruc = validarRUC(NombrePer.getText());
				String VnombreApellidos = validarTexto(Apellidos.getText());
				String Vcorreo = isValid(CorreoElectronico.getText());
				String Vcontrasenia = validarTextoNumeros(Contrasenia.getText());
				ListLinked<String> validar = new ListLinked<String>();
				validar.insertFirst(Vcontrasenia);
				validar.insertFirst(Vcorreo);
				validar.insertFirst(VnombreApellidos);
				int i = 0;
				String dowh = null;
				boolean ver = true;
				System.out.println(validar);
				do {
					dowh = validar.searchint(i);
					if(dowh == "Error" || dowh == null) {
						if(i == 0) {
							JOptionPane.showMessageDialog(null, "Nombres Invalidos");
							ver = false;
						}
						if(i == 1) {
							JOptionPane.showMessageDialog(null, "Correo Invalido");
							ver = false;
						}
						if(i == 2) {
							JOptionPane.showMessageDialog(null, "Contraseña Invalida");
							ver = false;
						}
					}
					i++;
				}while(i<validar.length() && ver == true);
				if (Vruc == -1 && ver == true) {
					JOptionPane.showMessageDialog(null, "RUC Invalido");
				}
				if(ver == true && Vruc != -1) {
					datosDePersona.setRUC(Vruc);
					datosDePersona.setNombreapellidos(VnombreApellidos);
					datosDePersona.setCorreoElectronico(Vcorreo);
					datosDelUsuario.setContraseña(Vcontrasenia);
					System.out.println(datosDePersona.toString());
					frameregistro.setVisible(false);
					frameRegistro2.setVisible(true);
					frameregistro.dispose();
				}
			}
		});
		botonSiguienteRegistro1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonSiguienteRegistro1.setForeground(Color.WHITE);
		botonSiguienteRegistro1.setBackground(SystemColor.textHighlight);
		botonSiguienteRegistro1.setBounds(557, 353, 151, 36);
		frameregistro.getContentPane().add(botonSiguienteRegistro1);
		
		JButton botonCancelarRegistro1 = new JButton("Cancelar");
		botonCancelarRegistro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameMenuInicio.setVisible(true);
				frameregistro.setVisible(false);
			}
		});
		botonCancelarRegistro1.setForeground(Color.WHITE);
		botonCancelarRegistro1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonCancelarRegistro1.setBackground(SystemColor.textHighlight);
		botonCancelarRegistro1.setBounds(30, 353, 103, 36);
		frameregistro.getContentPane().add(botonCancelarRegistro1);
		frameregistro.setMinimumSize(new Dimension(750, 450));
		frameregistro.setBounds(100, 100, 450, 300);
		frameregistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		frameRegistro2.getContentPane().setBackground(Color.WHITE);
		frameRegistro2.setMinimumSize(new Dimension(750, 450));
		frameRegistro2.setBounds(100, 100, 450, 300);
		frameRegistro2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistro2.getContentPane().setLayout(null);
		
		JLabel iconoRegistro2 = new JLabel("");
		iconoRegistro2.setIcon(new ImageIcon("C:\\Users\\gaboc\\Downloads\\morali (4).png"));
		iconoRegistro2.setHorizontalTextPosition(SwingConstants.CENTER);
		iconoRegistro2.setHorizontalAlignment(SwingConstants.CENTER);
		iconoRegistro2.setBackground(Color.WHITE);
		iconoRegistro2.setBounds(10, 0, 123, 88);
		frameRegistro2.getContentPane().add(iconoRegistro2);
		
		JPanel panelDeRegistro2 = new JPanel();
		panelDeRegistro2.setBackground(Color.DARK_GRAY);
		panelDeRegistro2.setBounds(0, 0, 886, 88);
		frameRegistro2.getContentPane().add(panelDeRegistro2);
		
		JLabel lblIngresoNombreRegistro2 = new JLabel("Ingrese Nombre");
		lblIngresoNombreRegistro2.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoNombreRegistro2.setBounds(20, 127, 133, 28);
		frameRegistro2.getContentPane().add(lblIngresoNombreRegistro2);
		
		JLabel lblIngresoDeCasasDeCambioRegistro2 = new JLabel("Ingreso de Casas De Cambio:");
		lblIngresoDeCasasDeCambioRegistro2.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoDeCasasDeCambioRegistro2.setBounds(20, 99, 214, 28);
		frameRegistro2.getContentPane().add(lblIngresoDeCasasDeCambioRegistro2);
		
		ingresoDeNombreRegistro2 = new JTextField();
		ingresoDeNombreRegistro2.setColumns(10);
		ingresoDeNombreRegistro2.setBounds(20, 155, 268, 28);
		frameRegistro2.getContentPane().add(ingresoDeNombreRegistro2);
		
		JLabel lblIngresoDireccionRegistro2 = new JLabel("Ingrese Direccion");
		lblIngresoDireccionRegistro2.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoDireccionRegistro2.setBounds(20, 194, 133, 28);
		frameRegistro2.getContentPane().add(lblIngresoDireccionRegistro2);
		
		ingresoDeDireccionRegistro2 = new JTextField();
		ingresoDeDireccionRegistro2.setColumns(10);
		ingresoDeDireccionRegistro2.setBounds(20, 222, 268, 28);
		frameRegistro2.getContentPane().add(ingresoDeDireccionRegistro2);
		
		JLabel lblIngresoCantidadDeMonedas = new JLabel("Ingrese Cantidad de Monedas");
		lblIngresoCantidadDeMonedas.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblIngresoCantidadDeMonedas.setBounds(20, 262, 214, 28);
		frameRegistro2.getContentPane().add(lblIngresoCantidadDeMonedas);
		
		intIngresoDeMonedas = new JTextField();
		intIngresoDeMonedas.setColumns(10);
		intIngresoDeMonedas.setBounds(20, 290, 50, 28);
		frameRegistro2.getContentPane().add(intIngresoDeMonedas);
		
		JButton botonAceptarCantidadCasas = new JButton("Cancelar");
		botonAceptarCantidadCasas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null,"¿Esta Seguro de Cancelar El Registro?","Mensaje De Canfirmacion", JOptionPane.OK_OPTION);
				frameRegistro2.setVisible(false);
				frameMenuInicio.setVisible(true);
			}
		});
		botonAceptarCantidadCasas.setForeground(Color.WHITE);
		botonAceptarCantidadCasas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonAceptarCantidadCasas.setBackground(SystemColor.textHighlight);
		botonAceptarCantidadCasas.setBounds(474, 364, 103, 36);
		frameRegistro2.getContentPane().add(botonAceptarCantidadCasas);
		
		JComboBox<String> MonedaSeleccion1 = new JComboBox<String>();
		MonedaSeleccion1.setForeground(SystemColor.textHighlight);
		MonedaSeleccion1.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion1.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion1.setVisible(false);
		MonedaSeleccion1.setBounds(333, 133, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion1);
		
		JLabel lblMonedas = new JLabel("Monedas:");
		lblMonedas.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		lblMonedas.setBounds(333, 99, 83, 28);
		frameRegistro2.getContentPane().add(lblMonedas);
		
		JPanel panelDeRegistro2_2 = new JPanel();
		panelDeRegistro2_2.setBackground(Color.DARK_GRAY);
		panelDeRegistro2_2.setBounds(313, 99, 10, 256);
		frameRegistro2.getContentPane().add(panelDeRegistro2_2);
		
		JLabel TextoVenta1 = new JLabel("Venta:");
		TextoVenta1.setVisible(false);
		TextoVenta1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta1.setBounds(498, 127, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta1);
		
		PrecioVenta1 = new JTextField();
		PrecioVenta1.setVisible(false);
		PrecioVenta1.setColumns(10);
		PrecioVenta1.setBounds(545, 130, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta1);
		
		JLabel TextoCompra1 = new JLabel("Compra:");
		TextoCompra1.setVisible(false);
		TextoCompra1.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra1.setBounds(605, 127, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra1);
		
		PrecioCompra1 = new JTextField();
		PrecioCompra1.setVisible(false);
		PrecioCompra1.setColumns(10);
		PrecioCompra1.setBounds(670, 130, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra1);
		
		JComboBox<String> MonedaSeleccion2 = new JComboBox<String>();
		MonedaSeleccion2.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion2.setForeground(SystemColor.textHighlight);
		MonedaSeleccion2.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion2.setVisible(false);
		MonedaSeleccion2.setBounds(333, 172, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion2);
		
		JLabel TextoVenta2 = new JLabel("Venta:");
		TextoVenta2.setVisible(false);
		TextoVenta2.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta2.setBounds(498, 166, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta2);
		
		PrecioVenta2 = new JTextField();
		PrecioVenta2.setVisible(false);
		PrecioVenta2.setColumns(10);
		PrecioVenta2.setBounds(545, 169, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta2);
		
		JLabel TextoCompra2 = new JLabel("Compra:");
		TextoCompra2.setVisible(false);
		TextoCompra2.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra2.setBounds(605, 166, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra2);
		
		PrecioCompra2 = new JTextField();
		PrecioCompra2.setVisible(false);
		PrecioCompra2.setColumns(10);
		PrecioCompra2.setBounds(670, 169, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra2);
		
		JComboBox<String> MonedaSeleccion3 = new JComboBox<String>();
		MonedaSeleccion3.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion3.setForeground(SystemColor.textHighlight);
		MonedaSeleccion3.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion3.setVisible(false);
		MonedaSeleccion3.setBounds(333, 211, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion3);
		
		JLabel TextoVenta3 = new JLabel("Venta:");
		TextoVenta3.setVisible(false);
		TextoVenta3.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta3.setBounds(498, 205, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta3);
		
		PrecioVenta3 = new JTextField();
		PrecioVenta3.setVisible(false);
		PrecioVenta3.setColumns(10);
		PrecioVenta3.setBounds(545, 208, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta3);
		
		JLabel TextoCompra3 = new JLabel("Compra:");
		TextoCompra3.setVisible(false);
		TextoCompra3.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra3.setBounds(605, 205, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra3);
		
		PrecioCompra3 = new JTextField();
		PrecioCompra3.setVisible(false);
		PrecioCompra3.setColumns(10);
		PrecioCompra3.setBounds(670, 208, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra3);
		
		JComboBox<String> MonedaSeleccion4 = new JComboBox<String>();
		MonedaSeleccion4.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion4.setForeground(SystemColor.textHighlight);
		MonedaSeleccion4.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion4.setVisible(false);
		MonedaSeleccion4.setBounds(333, 250, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion4);
		
		JLabel TextoVenta4 = new JLabel("Venta:");
		TextoVenta4.setVisible(false);
		TextoVenta4.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta4.setBounds(498, 244, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta4);
		
		PrecioVenta4 = new JTextField();
		PrecioVenta4.setVisible(false);
		PrecioVenta4.setColumns(10);
		PrecioVenta4.setBounds(545, 247, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta4);
		
		JLabel TextoCompra4 = new JLabel("Compra:");
		TextoCompra4.setVisible(false);
		TextoCompra4.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra4.setBounds(605, 244, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra4);
		
		PrecioCompra4 = new JTextField();
		PrecioCompra4.setVisible(false);
		PrecioCompra4.setColumns(10);
		PrecioCompra4.setBounds(670, 247, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra4);
		
		JComboBox<String> MonedaSeleccion5 = new JComboBox<String>();
		MonedaSeleccion5.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion5.setForeground(SystemColor.textHighlight);
		MonedaSeleccion5.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion5.setVisible(false);
		MonedaSeleccion5.setBounds(333, 289, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion5);
		
		JLabel TextoVenta5 = new JLabel("Venta:");
		TextoVenta5.setVisible(false);
		TextoVenta5.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta5.setBounds(498, 283, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta5);
		
		PrecioVenta5 = new JTextField();
		PrecioVenta5.setVisible(false);
		PrecioVenta5.setColumns(10);
		PrecioVenta5.setBounds(545, 286, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta5);
		
		JLabel TextoCompra5 = new JLabel("Compra:");
		TextoCompra5.setVisible(false);
		TextoCompra5.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra5.setBounds(605, 283, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra5);
		
		PrecioCompra5 = new JTextField();
		PrecioCompra5.setVisible(false);
		PrecioCompra5.setColumns(10);
		PrecioCompra5.setBounds(670, 286, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra5);
		
		JComboBox<String> MonedaSeleccion6 = new JComboBox<String>();
		MonedaSeleccion6.setBackground(UIManager.getColor("Button.disabledShadow"));
		MonedaSeleccion6.setForeground(SystemColor.textHighlight);
		MonedaSeleccion6.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccion", "BOB - Boliviano", "AUD - D\u00F3lar australiano", "CAD - D\u00F3lar canadiense", "USD - D\u00F3lar estadounidense", "HKD - D\u00F3lar hongkon\u00E9s", "NZD - D\u00F3lar neozeland\u00E9s", "EUR - Euro", "CHF - Franco suizo", "GBP - Libra esterlina", "ARS - Peso Argentino", "CLP - Peso Chileno", "COP - Peso Colombiano", "MXN - Peso Mexicano", "BRL - Real Brasile\u00F1o", "CNH - Renminbi chino", "JPY - Yen japon\u00E9s"}));
		MonedaSeleccion6.setVisible(false);
		MonedaSeleccion6.setBounds(333, 330, 155, 22);
		frameRegistro2.getContentPane().add(MonedaSeleccion6);
		
		JLabel TextoVenta6 = new JLabel("Venta:");
		TextoVenta6.setVisible(false);
		TextoVenta6.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoVenta6.setBounds(498, 324, 50, 28);
		frameRegistro2.getContentPane().add(TextoVenta6);
		
		PrecioVenta6 = new JTextField();
		PrecioVenta6.setVisible(false);
		PrecioVenta6.setColumns(10);
		PrecioVenta6.setBounds(545, 327, 50, 28);
		frameRegistro2.getContentPane().add(PrecioVenta6);
		
		JLabel TextoCompra6 = new JLabel("Compra:");
		TextoCompra6.setVisible(false);
		TextoCompra6.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		TextoCompra6.setBounds(605, 324, 64, 28);
		frameRegistro2.getContentPane().add(TextoCompra6);
		
		PrecioCompra6 = new JTextField();
		PrecioCompra6.setVisible(false);
		PrecioCompra6.setColumns(10);
		PrecioCompra6.setBounds(670, 327, 50, 28);
		frameRegistro2.getContentPane().add(PrecioCompra6);
		
		JLabel MensajeDeMonedas = new JLabel("(Ingrese Cantidad de Monedas Para Agregar Monedas)");
		MensajeDeMonedas.setFont(new Font("Square721 Cn BT", Font.BOLD, 17));
		MensajeDeMonedas.setBounds(349, 127, 375, 28);
		frameRegistro2.getContentPane().add(MensajeDeMonedas);
		
		JButton btnNewButton_2_1_2 = new JButton("Registrarse");
		btnNewButton_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String VnombreCasa = validarTexto(ingresoDeNombreRegistro2.getText());
				String VdireccionCasa = ingresoDeDireccionRegistro2.getText();
				if(VnombreCasa == "Error") {
					JOptionPane.showMessageDialog(null, "Nombre De La Casa Invalido");
				}
				if (VdireccionCasa.length() < 15) {
					JOptionPane.showMessageDialog(null, "Direccion De Casa Invalido");
				}
				if (VnombreCasa != "Error" && VdireccionCasa.length()> 14) {
	
					ListLinked<String> Vmonedas = new ListLinked<String>();
					Vmonedas.insertFirst("BOB - Boliviano");
					Vmonedas.insertFirst("AUD - Dólar australiano");
					Vmonedas.insertFirst("CAD - Dólar canadiense");
					Vmonedas.insertFirst("USD - Dólar estadounidense");
					Vmonedas.insertFirst("HKD - Dólar hongkonés");
					Vmonedas.insertFirst("NZD - Dólar neozelandés");
					Vmonedas.insertFirst("EUR - Euro");
					Vmonedas.insertFirst("CHF - Franco suizo");
					Vmonedas.insertFirst("GBP - Libra esterlina");
					Vmonedas.insertFirst("ARS - Peso Argentino");
					Vmonedas.insertFirst("CLP - Peso Chileno");
					Vmonedas.insertFirst("COP - Peso Colombiano");
					Vmonedas.insertFirst("MXN - Peso Mexicano");
					Vmonedas.insertFirst("BRL - Real Brasileño");
					Vmonedas.insertFirst("CNH - Renminbi chino");
					Vmonedas.insertFirst("JPY - Yen japonés");
					ListLinked<String> todosLosComboBox = new ListLinked<String>();
					todosLosComboBox.insertFirst(MonedaSeleccion6.getSelectedItem().toString());
					todosLosComboBox.insertFirst(MonedaSeleccion5.getSelectedItem().toString());
					todosLosComboBox.insertFirst(MonedaSeleccion4.getSelectedItem().toString());
					todosLosComboBox.insertFirst(MonedaSeleccion3.getSelectedItem().toString());
					todosLosComboBox.insertFirst(MonedaSeleccion2.getSelectedItem().toString());
					todosLosComboBox.insertFirst(MonedaSeleccion1.getSelectedItem().toString());
					int numCasas;
					numCasas = validarNumeros(intIngresoDeMonedas.getText());
					System.out.println(numCasas);
					boolean seguir = true;
					int indiceParaValidar = 0;
					do {
						if(todosLosComboBox.searchint(indiceParaValidar) == "Seleccion") {
							JOptionPane.showMessageDialog(null, "No selecciono 1 o mas monedas");
							seguir = false;
						}
						if(Vmonedas.searchData(todosLosComboBox.searchint(indiceParaValidar)) == null && seguir == true) {
							JOptionPane.showMessageDialog(null, "Existe Monedas Seleccionadas repetidas");
							seguir = false;
						}
						if(Vmonedas.searchData(todosLosComboBox.searchint(indiceParaValidar)) != null && seguir == true) {
							Vmonedas.remove(Vmonedas.searchData(todosLosComboBox.searchint(indiceParaValidar)));
						}
						indiceParaValidar++;
					}while(numCasas > indiceParaValidar && seguir == true);
					if (seguir == true) {
						indiceParaValidar = 0;
						ListLinked<String> precioscompra = new ListLinked<String>();
						precioscompra.insertFirst(PrecioCompra6.getText());
						precioscompra.insertFirst(PrecioCompra5.getText());
						precioscompra.insertFirst(PrecioCompra4.getText());
						precioscompra.insertFirst(PrecioCompra3.getText());
						precioscompra.insertFirst(PrecioCompra2.getText());
						precioscompra.insertFirst(PrecioCompra1.getText());
						System.out.println(precioscompra);
						boolean validardouble = true;
						do {
							validardouble = isDouble(precioscompra.searchint(indiceParaValidar));
							System.out.println(validardouble);
							if (validardouble == false) {
								JOptionPane.showMessageDialog(null, "Datos De Compra No Validos");
								seguir = false;
							}
							indiceParaValidar++;
						}while(numCasas > indiceParaValidar && seguir == true);
						if (seguir == true) {
							ListLinked<String> preciosventa = new ListLinked<String>();
							preciosventa.insertFirst(PrecioVenta6.getText());
							preciosventa.insertFirst(PrecioVenta5.getText());
							preciosventa.insertFirst(PrecioVenta4.getText());
							preciosventa.insertFirst(PrecioVenta3.getText());
							preciosventa.insertFirst(PrecioVenta2.getText());
							preciosventa.insertFirst(PrecioVenta1.getText());
							
							indiceParaValidar = 0;
							do {
								validardouble = isDouble(preciosventa.searchint(indiceParaValidar));  
								if (validardouble == false) {
									JOptionPane.showMessageDialog(null, "Datos De Venta No Validos");
									seguir = false;
								}
								indiceParaValidar++;
							}while(numCasas > indiceParaValidar && seguir == true);
							if (seguir == true) {
								int respuesta;
								respuesta = JOptionPane.showConfirmDialog(null,"Confirme Su Registro: ","Confirmar Registro", JOptionPane.OK_OPTION);
								if(respuesta == 0) {
									boolean validarNoRepetidos = true;
									BSTree<MonedasDeCambio> monedasDelUsuario = new BSTree<MonedasDeCambio>();
									switch(numCasas) {
									case 1:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;
									case 2:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion2.getSelectedItem().toString(),Double.parseDouble(PrecioVenta2.getText()),Double.parseDouble(PrecioCompra2.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;
									case 3:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion2.getSelectedItem().toString(),Double.parseDouble(PrecioVenta2.getText()),Double.parseDouble(PrecioCompra2.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion3.getSelectedItem().toString(),Double.parseDouble(PrecioVenta3.getText()),Double.parseDouble(PrecioCompra3.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;
									case 4:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion2.getSelectedItem().toString(),Double.parseDouble(PrecioVenta2.getText()),Double.parseDouble(PrecioCompra2.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion3.getSelectedItem().toString(),Double.parseDouble(PrecioVenta3.getText()),Double.parseDouble(PrecioCompra3.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion4.getSelectedItem().toString(),Double.parseDouble(PrecioVenta4.getText()),Double.parseDouble(PrecioCompra4.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;
									case 5:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion2.getSelectedItem().toString(),Double.parseDouble(PrecioVenta2.getText()),Double.parseDouble(PrecioCompra2.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion3.getSelectedItem().toString(),Double.parseDouble(PrecioVenta3.getText()),Double.parseDouble(PrecioCompra3.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion4.getSelectedItem().toString(),Double.parseDouble(PrecioVenta4.getText()),Double.parseDouble(PrecioCompra4.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion5.getSelectedItem().toString(),Double.parseDouble(PrecioVenta5.getText()),Double.parseDouble(PrecioCompra5.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;
									case 6:
										try {
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion1.getSelectedItem().toString(),Double.parseDouble(PrecioVenta1.getText()),Double.parseDouble(PrecioCompra1.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion2.getSelectedItem().toString(),Double.parseDouble(PrecioVenta2.getText()),Double.parseDouble(PrecioCompra2.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion3.getSelectedItem().toString(),Double.parseDouble(PrecioVenta3.getText()),Double.parseDouble(PrecioCompra3.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion4.getSelectedItem().toString(),Double.parseDouble(PrecioVenta4.getText()),Double.parseDouble(PrecioCompra4.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion5.getSelectedItem().toString(),Double.parseDouble(PrecioVenta5.getText()),Double.parseDouble(PrecioCompra5.getText())));
											monedasDelUsuario.insert(new MonedasDeCambio(MonedaSeleccion6.getSelectedItem().toString(),Double.parseDouble(PrecioVenta6.getText()),Double.parseDouble(PrecioCompra6.getText())));
										} catch (ItemDuplicated e1) {
											e1.printStackTrace();
											validarNoRepetidos = false;
										}
										break;	
									}
									reg.agregarRegistro(new Usuario(new Persona(datosDePersona.getRUC(),datosDePersona.getNombreapellidos(),datosDePersona.getCorreoElectronico()), datosDelUsuario.getContraseña(),new ListLinked<CasaCambio>(new CasaCambio(VnombreCasa,VdireccionCasa, monedasDelUsuario))));
									System.out.println(reg);
									
									frameMenuInicio.setVisible(true);
									frameRegistro2.setVisible(false);
									numCasas = 0;
									ListacasasDelUsuario.destroyList();
									casasDelUsuaio.clearCasas();
								}
							}
						}
					}
				}
			}
		});
		
		btnNewButton_2_1_2.setForeground(Color.WHITE);
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1_2.setBounds(587, 364, 133, 36);
		frameRegistro2.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_1 = new JButton("Aceptar");
		btnNewButton_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Vnumcasas;
				Vnumcasas = validarNumeros(intIngresoDeMonedas.getText());
				if(Vnumcasas == -1) {
					JOptionPane.showMessageDialog(null, "Numero De Casas Ingresado Invalido");
				}else if(Vnumcasas == -2) {
					JOptionPane.showMessageDialog(null, "Numero de Casas Maximo: 6");
				}else {
					switch(Vnumcasas) {
					case 1: 
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(false);
						TextoVenta2.setVisible(false);
						PrecioVenta2.setVisible(false);
						TextoCompra2.setVisible(false);
						PrecioCompra2.setVisible(false);
						//
						MonedaSeleccion3.setVisible(false);
						TextoVenta3.setVisible(false);
						PrecioVenta3.setVisible(false);
						TextoCompra3.setVisible(false);
						PrecioCompra3.setVisible(false);
						//
						MonedaSeleccion4.setVisible(false);
						TextoVenta4.setVisible(false);
						PrecioVenta4.setVisible(false);
						TextoCompra4.setVisible(false);
						PrecioCompra4.setVisible(false);
						//
						MonedaSeleccion5.setVisible(false);
						TextoVenta5.setVisible(false);
						PrecioVenta5.setVisible(false);
						TextoCompra5.setVisible(false);
						PrecioCompra5.setVisible(false);
						//
						MonedaSeleccion6.setVisible(false);
						TextoVenta6.setVisible(false);
						PrecioVenta6.setVisible(false);
						TextoCompra6.setVisible(false);
						PrecioCompra6.setVisible(false);
						break;
					case 2:
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(true);
						TextoVenta2.setVisible(true);
						PrecioVenta2.setVisible(true);
						TextoCompra2.setVisible(true);
						PrecioCompra2.setVisible(true);
						//
						MonedaSeleccion3.setVisible(false);
						TextoVenta3.setVisible(false);
						PrecioVenta3.setVisible(false);
						TextoCompra3.setVisible(false);
						PrecioCompra3.setVisible(false);
						//
						MonedaSeleccion4.setVisible(false);
						TextoVenta4.setVisible(false);
						PrecioVenta4.setVisible(false);
						TextoCompra4.setVisible(false);
						PrecioCompra4.setVisible(false);
						//
						MonedaSeleccion5.setVisible(false);
						TextoVenta5.setVisible(false);
						PrecioVenta5.setVisible(false);
						TextoCompra5.setVisible(false);
						PrecioCompra5.setVisible(false);
						//
						MonedaSeleccion6.setVisible(false);
						TextoVenta6.setVisible(false);
						PrecioVenta6.setVisible(false);
						TextoCompra6.setVisible(false);
						PrecioCompra6.setVisible(false);
						break;
					case 3:
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(true);
						TextoVenta2.setVisible(true);
						PrecioVenta2.setVisible(true);
						TextoCompra2.setVisible(true);
						PrecioCompra2.setVisible(true);
						//
						MonedaSeleccion3.setVisible(true);
						TextoVenta3.setVisible(true);
						PrecioVenta3.setVisible(true);
						TextoCompra3.setVisible(true);
						PrecioCompra3.setVisible(true);
						//
						MonedaSeleccion4.setVisible(false);
						TextoVenta4.setVisible(false);
						PrecioVenta4.setVisible(false);
						TextoCompra4.setVisible(false);
						PrecioCompra4.setVisible(false);
						//
						MonedaSeleccion5.setVisible(false);
						TextoVenta5.setVisible(false);
						PrecioVenta5.setVisible(false);
						TextoCompra5.setVisible(false);
						PrecioCompra5.setVisible(false);
						//
						MonedaSeleccion6.setVisible(false);
						TextoVenta6.setVisible(false);
						PrecioVenta6.setVisible(false);
						TextoCompra6.setVisible(false);
						PrecioCompra6.setVisible(false);
						break;
						
					case 4:
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(true);
						TextoVenta2.setVisible(true);
						PrecioVenta2.setVisible(true);
						TextoCompra2.setVisible(true);
						PrecioCompra2.setVisible(true);
						//
						MonedaSeleccion3.setVisible(true);
						TextoVenta3.setVisible(true);
						PrecioVenta3.setVisible(true);
						TextoCompra3.setVisible(true);
						PrecioCompra3.setVisible(true);
						//
						MonedaSeleccion4.setVisible(true);
						TextoVenta4.setVisible(true);
						PrecioVenta4.setVisible(true);
						TextoCompra4.setVisible(true);
						PrecioCompra4.setVisible(true);
						//
						MonedaSeleccion5.setVisible(false);
						TextoVenta5.setVisible(false);
						PrecioVenta5.setVisible(false);
						TextoCompra5.setVisible(false);
						PrecioCompra5.setVisible(false);
						//
						MonedaSeleccion6.setVisible(false);
						TextoVenta6.setVisible(false);
						PrecioVenta6.setVisible(false);
						TextoCompra6.setVisible(false);
						PrecioCompra6.setVisible(false);
						break;
					case 5:
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(true);
						TextoVenta2.setVisible(true);
						PrecioVenta2.setVisible(true);
						TextoCompra2.setVisible(true);
						PrecioCompra2.setVisible(true);
						//
						MonedaSeleccion3.setVisible(true);
						TextoVenta3.setVisible(true);
						PrecioVenta3.setVisible(true);
						TextoCompra3.setVisible(true);
						PrecioCompra3.setVisible(true);
						//
						MonedaSeleccion4.setVisible(true);
						TextoVenta4.setVisible(true);
						PrecioVenta4.setVisible(true);
						TextoCompra4.setVisible(true);
						PrecioCompra4.setVisible(true);
						//
						MonedaSeleccion5.setVisible(true);
						TextoVenta5.setVisible(true);
						PrecioVenta5.setVisible(true);
						TextoCompra5.setVisible(true);
						PrecioCompra5.setVisible(true);
						//
						MonedaSeleccion6.setVisible(false);
						TextoVenta6.setVisible(false);
						PrecioVenta6.setVisible(false);
						TextoCompra6.setVisible(false);
						PrecioCompra6.setVisible(false);
						break;
					case 6:
						MensajeDeMonedas.setVisible(false);
						
						MonedaSeleccion1.setVisible(true);
						TextoVenta1.setVisible(true);
						PrecioVenta1.setVisible(true);
						TextoCompra1.setVisible(true);
						PrecioCompra1.setVisible(true);
						//
						MonedaSeleccion2.setVisible(true);
						TextoVenta2.setVisible(true);
						PrecioVenta2.setVisible(true);
						TextoCompra2.setVisible(true);
						PrecioCompra2.setVisible(true);
						//
						MonedaSeleccion3.setVisible(true);
						TextoVenta3.setVisible(true);
						PrecioVenta3.setVisible(true);
						TextoCompra3.setVisible(true);
						PrecioCompra3.setVisible(true);
						//
						MonedaSeleccion4.setVisible(true);
						TextoVenta4.setVisible(true);
						PrecioVenta4.setVisible(true);
						TextoCompra4.setVisible(true);
						PrecioCompra4.setVisible(true);
						//
						MonedaSeleccion5.setVisible(true);
						TextoVenta5.setVisible(true);
						PrecioVenta5.setVisible(true);
						TextoCompra5.setVisible(true);
						PrecioCompra5.setVisible(true);
						//
						MonedaSeleccion6.setVisible(true);
						TextoVenta6.setVisible(true);
						PrecioVenta6.setVisible(true);
						TextoCompra6.setVisible(true);
						PrecioCompra6.setVisible(true);
						break;
					}
				}
			}
		});
		btnNewButton_2_1_1.setForeground(Color.WHITE);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1_1.setBounds(80, 288, 91, 30);
		frameRegistro2.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_3 = new JButton("Retroceder");
		btnNewButton_2_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameregistro.setVisible(true);
				frameRegistro2.setVisible(false);		
			}
		});
		btnNewButton_2_1_3.setForeground(Color.WHITE);
		btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2_1_3.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1_3.setBounds(20, 364, 133, 36);
		frameRegistro2.getContentPane().add(btnNewButton_2_1_3);
		
		
		System.out.println("aaa"+ datosDePersona);
	}
	public static String validarTexto(String Campo){
		if (Campo.length()<1) {
			return null;
		}
		char[] charArray = Campo.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!((ch2 >= 65 && ch2 <= 94) ||(ch2 >= 97 && ch2 <= 122) ||(ch2 == 32) )) { //Validacion ASCII para solo ingreso de letras min y mayus
				return "Error";
			}
		}
		if(Campo.length() < 1) {
			return "Error";
		}
		return Campo;
	}
	public static String validarTextoNumeros(String Campo){
		char[] charArray = Campo.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!((((ch2 >= 65 && ch2 <= 94) || (ch2 >= 97 && ch2 <= 122))) || (ch2 >= 48 && ch2 <= 57) || (ch2 == 32))) { //Validacion ASCII para no caracteres especiales
				return "Error";
			}
		}
		if(Campo.length() < 2 || Campo == null) {
			return "Error";
		}
		return Campo;
	}
	public static int validarNumeros(String Campo){
		char[] charArray = Campo.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!(ch2 >= 48 && ch2 <= 57)) { //Validacion ASCII para solo numeros entre 0 y 9
				return -1;
			}
		}
		int ret = Integer.parseInt(0+Campo);
		if(charArray.length< 1) {
			return -1;
		}
		return ret;
	}
	public static long validarRUC(String Campo){
		char[] charArray = Campo.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!(ch2 >= 48 && ch2 <= 57)) { //Validacion ASCII para solo numeros entre 0 y 9
				return -1;
			}
		}
		long ret = Long.parseLong(Campo);
		if(charArray.length < 1) {
			return -1;
		}else if(charArray.length <= 10 || charArray.length >= 12) {
			return -1;
		}
		return ret;
	}
	public static String isValid(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		boolean a = email.matches(regex);
		if (a  == true)
			return email;
		return "Error";
	}
	public static boolean isDouble(String str) {
	    try {
	    	double x = Double.parseDouble(str);
	        if (x == (int) x)
	            return false;
	        return true;
	    }
	    catch(NumberFormatException e) {
	        return false;
	    }

	} 
}