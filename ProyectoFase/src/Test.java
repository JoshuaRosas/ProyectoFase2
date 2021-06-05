import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner entradaDato = new Scanner(System.in);
		System.out.println("BIENVENIDO");
		Usuario login = new Usuario();
		
		System.out.println("Elija su ingreso");
		System.out.println("1. Crear cuenta" + "\n" + "2. Iniciar sesion");
		int eleccion = entradaDato.nextInt();
		
		if(eleccion == 1) {
			login.crearCuenta();
		} else if(eleccion == 2) {
			login.iniciarSesion();
		}
		*/
		
		boolean Afirm = true;
		DatosRegistro person = null;
		ListLinked <UsuariosRegistrados> aux2 = new ListLinked<UsuariosRegistrados>();
		ListLinked<Integer> l9 = new ListLinked<Integer>();
		l9.insertFirst(15);
		System.out.println(l9.toString());
		while (Afirm) {
		String Opt = JOptionPane.showInputDialog(null, "Bienvenido a ... \n\n"
				+ "1. Registrarse\n"
				+ "2. Iniciar Sesion\n"
				+ "3. Ver Casas de Cambio\n"
				+ "4. Salir\n");
		int Op = Integer.parseInt(Opt);
		
		if (Op == 1 || Op == 2 || Op == 3 || Op == 4) {
			if (Op == 1) {
				person = new DatosRegistro(); 
				if (person.getConfir() == "P") {
					System.out.println(person.getNombre());
					aux2.insertLast(new UsuariosRegistrados(person.getNombre()));
					System.out.println(aux2.toString());
				}
			}else if (Op == 2)
				/*search.node*/;
			else if (Op == 3)
				;
			else if (Op == 4)
				Afirm = false;
			}
		}
		
		/*
		System.out.println("TIENE CUENTA?");
		String veri = entradaDato.nextLine();
		String n = "no";
		String s = "si";
		if(veri == n) {
			login.crearCuenta();
			System.out.println("QUE DESEA REALIZAR?" + "\n" + 
					"1. VER LAS CASAS DE CAMBIO DISPONIBLES" + "\n" + 
					"2. ACTUALIZAR PRECIOS DEL CAMBIO DE MONEDA" + "\n");
		} else if(veri == s) {
			login.iniciarSesion();
			System.out.println("QUE DESEA REALIZAR?" + "\n" + 
					"1. VER LAS CASAS DE CAMBIO DISPONIBLES" + "\n" + 
					"2. ACTUALIZAR PRECIOS DEL CAMBIO DE MONEDA" + "\n");
		}
		*/

		
	}

}
