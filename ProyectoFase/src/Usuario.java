import java.util.Scanner;

public class Usuario extends Persona implements Comparable<Usuario> {
	private String nombreU;
	private String contraseña;
	Hash<Usuario> aux;
	private Persona usuario;
	private ListLinked<CasaCambio> puesto;
	Scanner entradaDatos = new Scanner(System.in);
	
	public Usuario(String nombreU, String contraseña) {
		this.nombreU = nombreU;
		this.contraseña = contraseña;
	}
	
	public Usuario() {
		aux = new Hash<Usuario>(30);
	}
	
	public Usuario(Persona usuario, String contraseña, ListLinked<CasaCambio> puesto) {
		super();
		this.usuario =  usuario;
		this.contraseña = contraseña;
		this.puesto = puesto;
	}
	
	public String getNombreU() {
		return nombreU;
	}
	
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
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
		int r1;
		System.out.println("Ingrese sus datos");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contraseña: ");
		c1 = entradaDatos.nextLine();
		System.out.print("Primer digito del DNI: ");
		r1 = entradaDatos.nextInt();
		Usuario usuario1 = new Usuario(n1, c1);
		aux.insertC(r1, usuario1);
	}
	
	public void iniciarSesion() {
		String n1;
		String c1;
		int r1;
		System.out.println("Ingrese su nombre y contraseña");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contraseña: ");
		c1 = entradaDatos.nextLine();
		System.out.print("Primer digito del DNI: ");
		r1 = entradaDatos.nextInt();
		Usuario usuario1 = new Usuario(n1, c1);
		aux.search(r1);
	}
	
	public void eliminarCuenta() {
		int r1;
		System.out.print("Primer digito del DNI: ");
		r1 = entradaDatos.nextInt();
		aux.remove(r1);
		
	}
	
	public void mostrarUs() {
		System.out.println(aux);
	}
	@Override
	public String toString() {
		return "Datos de Registro Usuario:\n "+
				"Usuario: "+ this.nombreU + 
				"\nContraseña:" + this.contraseña + "\n\n"+ super.toString();
	}
	
	public int compareTo(Usuario o) {	
		int ord = getNombreU().compareTo(o.getNombreU());
		
		return (ord != 0? ord:getNombreU().compareTo(o.getNombreU()));
	}
	
}
