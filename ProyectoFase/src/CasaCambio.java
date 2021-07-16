//IMPLEMENTADO POR JOSHUA ROSAS
import java.util.Scanner;

public class CasaCambio implements Comparable<CasaCambio> {
	private String nombre;
	private String direccion;
	private BSTree<MonedasDeCambio> monedas;
	
	public CasaCambio(String nombre, String direccion, BSTree<MonedasDeCambio> monedas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.monedas = monedas;
	}

	public CasaCambio() {
		super();
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

	public BSTree<MonedasDeCambio> getMonedas() {
		return monedas;
	}

	public void setMonedas(BSTree<MonedasDeCambio> monedas) {
		this.monedas = monedas;
	}
	
	@Override
	public String toString() {
		return "Datos De La Casa: Nombre: " + nombre + ", Direccion: " + direccion+ "\n\t\t   Monedas De La Casa:" + monedas+"";
	}

	@Override
	public int compareTo(CasaCambio o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
