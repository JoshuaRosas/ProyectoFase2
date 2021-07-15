import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CasaCambio a = new CasaCambio();
		a.agregarCasa();
		a.agregarCasa();
		a.mostrarCasas();
		
		
		boolean Afirm = true;
		DatosRegistro person = null;
		//ListLinked <UsuariosRegistrados> aux2 = new ListLinked<UsuariosRegistrados>();
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
					System.out.println(person.getNombreU());
					//aux2.insertLast(new UsuariosRegistrados(person.getNombre()));
					//System.out.println(aux2.toString());
				}
			}else if (Op == 2)
				/*search.node*/;
			else if (Op == 3)
				;
			else if (Op == 4)
				Afirm = false;
			}
		}
		
	}

}
