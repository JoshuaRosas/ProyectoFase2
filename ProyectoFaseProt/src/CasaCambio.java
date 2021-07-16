import java.util.Scanner;

public class CasaCambio implements Comparable<CasaCambio> {
	private String nombre;
	private String direccion;
	private double precioVenta;
	private double precioCompra;
	OrderListLinked <CasaCambio> aux2;
	//Hash<CasaCambio> aux2;
	Scanner entradaDatos = new Scanner(System.in);
	
	public CasaCambio(String nombre, String direccion, double precioVenta, double precioCompra) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
	}
	
	public CasaCambio() {
		aux2 = new OrderListLinked<CasaCambio>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}
	
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public void agregarCasa() {
		String n1;
		String d1;
		int pc1;
		int pv1;
		System.out.println("Ingrese sus datos");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Direccion: ");
		d1 = entradaDatos.nextLine();
		System.out.print("Precio de Compra: ");
		pc1 = entradaDatos.nextInt();
		System.out.print("Precio de Venta: ");
		pv1 = entradaDatos.nextInt();
		CasaCambio casa1 = new CasaCambio(n1, d1, pc1, pv1);
		if(aux2.isEmptyList()) {
			aux2.insert(casa1);
		} else {
			int v = aux2.search(casa1);
			if(v == 1) {
				System.out.println("La casa de cambio ya esta registrada");
			} else if(v == -1) {
				aux2.insert(casa1);
				System.out.println("La casa de cambio ha sido registrada");
			}
		}
	}
	
	public void eliminarCasa() {
		int r1;
		String n1;
		String c1;
		System.out.println("Ingrese su usuario y contraseña");
		System.out.print("Nombre: ");
		n1 = entradaDatos.nextLine();
		System.out.print("Contraseña: ");
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
	
	public void mostrarCasas() {
		System.out.println(aux2);
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "\n" + 
	"Direccion: " + this.direccion + "\n" + 
				"Precio de Compra: " + this.precioCompra + "\n" + 
	"Precio de Venta: " + this.precioVenta + "\n";
	}
	
	public int compareTo(CasaCambio o) {	
		int ord = getNombre().compareTo(o.getNombre());
		
		return (ord != 0? ord:getNombre().compareTo(o.getNombre()));
	}
	
}