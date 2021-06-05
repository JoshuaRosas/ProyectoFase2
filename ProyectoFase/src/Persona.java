//IMPLEMENTADO POR GABRIEL LEVANO

public class Persona{
	
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private int DNI;
	
	public Persona(){
		this.nombre = "";
		this.apePaterno = "";
		this.apeMaterno = "";
		this.DNI = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dni) {
		this.DNI = dni;
	}
	@Override
	public String toString() {
		return "Datos Personales Ingresados:\n"
				+ "Nombre: " + this.nombre
				+ "\nApellido Paterno: " + this.apePaterno
				+ "\nApellido Materno: " + this.apeMaterno
				+ "\nDNI: "+ this.DNI + "\n";
	}

}
