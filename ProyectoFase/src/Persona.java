public class Persona{
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	public Persona(String nombre, String apellidos, String correoElectronico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
	}
	public Persona() {
		super();
		this.nombre = null;
		this.apellidos = null;
		this.correoElectronico = null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	@Override
	public String toString() {
		return " Nombre:" + nombre + ", Apellidos:" + apellidos + ", CorreoElectronico:" + correoElectronico;
	}
	
	
}