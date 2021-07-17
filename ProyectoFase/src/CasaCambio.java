//IMPLEMENTADO POR JOSHUA ROSAS
import java.util.Scanner;

public class CasaCambio implements Comparable<CasaCambio> {
	private String nombre;
	int ruc;
	private String direccion;
	private double precioVenta;
	private double precioCompra;
	Hash<CasaCambio> aux2;
	private BSTree<MonedasDeCambio> monedas;
	Scanner entradaDatos = new Scanner(System.in);
	
	public CasaCambio(int ruc, String nombre, String direccion, double precioVenta, double precioCompra) {
		this.ruc = ruc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
	}
	
	public CasaCambio(String nombre, String direccion, BSTree<MonedasDeCambio> monedas) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.monedas = monedas;
	}
	
	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public CasaCambio() {
		aux2 = new Hash<CasaCambio>(15);
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
	
	public BSTree<MonedasDeCambio> getMonedas() {
		return monedas;
	}

	public void setMonedas(BSTree<MonedasDeCambio> monedas) {
		this.monedas = monedas;
	}
	
	public void agregarCasa() {
		int r1;
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
		System.out.print("Primer digito del RUC: ");
		r1 = entradaDatos.nextInt();
		CasaCambio casa1 = new CasaCambio(r1, n1, d1, pc1, pv1);
		aux2.insert(r1, casa1);
	}
	
	public void eliminarCasa() {
		int r1;
		System.out.print("Primer digito del RUC: ");
		r1 = entradaDatos.nextInt();
		aux2.remove(r1);
	}
	
	public void mostrarCasas() {
		System.out.println(aux2);
	}
	
	public void clearCasas() {
		this.direccion = null;
		this.monedas = null;
		this.nombre = null;
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
