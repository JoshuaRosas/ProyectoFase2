import java.util.Scanner;

public class Usuario {
	private String nombre;
	private String contraseña;
	TDAList <Usuario> aux;
	Scanner entradaDatos = new Scanner(System.in);
	
	public Usuario(String nombre, String contraseña) {
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	
	public Usuario() {
		aux = new ListLinked<Usuario>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void crearCuenta() {
		String n1;
		String c1;
		System.out.println("Ingrese su nombre y contraseña");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contraseña: ");
		c1 = entradaDatos.nextLine();
		Usuario usuario1 = new Usuario(n1, c1);
		if(aux.isEmptyList()) {
			aux.insertFirst(usuario1);
		} else {
			aux.insertLast(usuario1);
		}
	}
	
	public void iniciarSesion() {
		String n1;
		String c1;
		System.out.println("Ingrese su nombre y contraseña");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contraseña: ");
		c1 = entradaDatos.nextLine();
		Usuario usuario1 = new Usuario(n1, c1);
		int comp = aux.search(usuario1);
		if(comp == 1) {
			System.out.println("Usuario encontrado");
		} else {
			System.out.println("Usuario no exitente");
		}
	}
	
}
