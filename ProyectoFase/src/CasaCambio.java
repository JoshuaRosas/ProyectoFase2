
public class CasaCambio {
	private String nombre;
	private String direccion;
	private double precioVenta;
	private double precioCompra;
	TDAList <CasaCambio> aux2;
	
	public CasaCambio(String nombre, String direccion, double precioVenta, double precioCompra) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		aux2 = new ListLinked<CasaCambio>();
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
	
	@Override
	public String toString() {
		return "CasaCambio [nombre=" + nombre + ", direccion=" + direccion + ", precioVenta=" + precioVenta
				+ ", precioCompra=" + precioCompra + "]";
	}
	
	
}
