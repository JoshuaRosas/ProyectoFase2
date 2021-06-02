import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDato = new Scanner(System.in);
		System.out.println("BIENVENIDO");
		Usuario login = new Usuario();
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
		
	}

}
