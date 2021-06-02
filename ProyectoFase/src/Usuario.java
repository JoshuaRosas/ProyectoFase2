import java.util.Scanner;

public class Usuario {
	private String nombre;
	private String contrase�a;
	TDAList <Usuario> aux;
	Scanner entradaDatos = new Scanner(System.in);
	
	public Usuario(String nombre, String contrase�a) {
		this.nombre = nombre;
		this.contrase�a = contrase�a;
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
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void crearCuenta() {
		String n1;
		String c1;
		System.out.println("Ingrese su nombre y contrase�a");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contrase�a: ");
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
		System.out.println("Ingrese su nombre y contrase�a");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contrase�a: ");
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
