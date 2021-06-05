//IMPLEMENTADO POR JOSHUA ROSAS

import java.util.Scanner;

public class Usuario extends Persona {
	private String nombreU;
	private String contrase�a;
	TDAList <Usuario> aux;
	Scanner entradaDatos = new Scanner(System.in);
	
	public Usuario(String nombreU, String contrase�a) {
		this.nombreU = nombreU;
		this.contrase�a = contrase�a;
	}
	
	public Usuario() {
		aux = new ListLinked<Usuario>();
	}
	
	public String getNombreU() {
		return nombreU;
	}
	
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	/*
	public void crearCuenta() {
		String n1;
		String c1;
		System.out.println("Ingrese sus datos");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contrase�a: ");
		c1 = entradaDatos.nextLine();
		Usuario usuario1 = new Usuario(n1, c1);
		if(aux.isEmptyList()) {
			aux.insertFirst(usuario1);
		} else {
			int v = aux.search(usuario1);
			if(v == 1) {
				System.out.println("La cuenta ya existe");
			} else if(v == -1) {
				aux.insertLast(usuario1);
				System.out.println("La cuenta ha sido creada, Bienvenido");
			}
		}
	}
	*/
	public void iniciarSesion() {
		String n1;
		String c1;
		System.out.println("Ingrese su nombre y contrase�a");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contrase�a: ");
		c1 = entradaDatos.nextLine();
		Usuario usuario1 = new Usuario(n1, c1);
		int comp = aux.search(usuario1);
		if(comp == 1) {
			System.out.println("Bienvenido");
		} else if(comp == -1) {
			System.out.println("Usuario no existente");
		}
	}
	
	public void eliminarCuenta() {
		String n1;
		String c1;
		System.out.println("Ingrese su usuario y contrase�a");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contrase�a: ");
		c1 = entradaDatos.nextLine();
		Usuario usuario1 = new Usuario(n1, c1);
		int comp = aux.search(usuario1);
		if(comp == 1) {
			aux.remove(usuario1);
			System.out.println("Su cuenta a sido eliminada");
		} else if(comp == -1) {
			System.out.println("Usuario no existente");
		}
	}
	
	@Override
	public String toString() {
		return "Datos de Registro Usuario:\n "+
				"Usuario: "+ this.nombreU + 
				"\nContrase�a:" + this.contrase�a + "\n\n"+ super.toString();
	}
	
}
