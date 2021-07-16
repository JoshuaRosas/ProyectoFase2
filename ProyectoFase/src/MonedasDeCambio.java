
public class MonedasDeCambio implements Comparable <MonedasDeCambio>{
	private String Moneda;
	private double precioVenta;
	private double precioCompra;
	
	public MonedasDeCambio(String moneda, double precioVenta, double precioCompra) {
		super();
		Moneda = moneda;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
	}
	
	public MonedasDeCambio() {
		super();
	}
	
	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
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
		return "\n\t\t\tMoneda: " + Moneda + ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra+ "\n\t\t\t\t     ";
	}

	@Override
	public int compareTo(MonedasDeCambio o) {
		return this.Moneda.compareTo(o.Moneda);
	}

	
	
}
