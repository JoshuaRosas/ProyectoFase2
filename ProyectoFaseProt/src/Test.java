import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDatos = new Scanner(System.in);
		CasaCambio a = new CasaCambio();
		a.agregarCasa();
		a.agregarCasa();
		a.mostrarCasas();
		
		System.out.println("Elija su opcion: ");
		System.out.println("1. Agregar casa: ");
		System.out.println("2. Eliminar casa: ");
		System.out.println("3. Mostrar casas de cambio: ");
		
		int op = entradaDatos.nextInt();
		
		if(op == 1) {
			a.agregarCasa();
		} else if(op == 2) {
			a.eliminarCasa();
		} else if(op == 3) {
			a.mostrarCasas();
		}
	}

}
