
public class Persona{
	private long RUC;
	private String nombreapellidos;
	private String correoElectronico;
	public Persona(long RUC, String nombreapellidos, String correoElectronico) {
		super();
		this.RUC = RUC;
		this.nombreapellidos = nombreapellidos;
		this.correoElectronico = correoElectronico;
	}
	public Persona() {
		super();
		this.RUC = 0;
		this.nombreapellidos = null;
		this.correoElectronico = null;
	}
	
	public long getRUC() {
		return RUC;
	}
	public void setRUC(long vruc) {
		RUC = vruc;
	}
	public String getNombreapellidos() {
		return nombreapellidos;
	}
	public void setNombreapellidos(String nombreapellidos) {
		this.nombreapellidos = nombreapellidos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public void clear() {
		this.RUC = 0;
		this.nombreapellidos = null;
		this.correoElectronico = null;
	}
	@Override
	public String toString() {
		return " RUC:" + RUC + ", Nombres Y Apellidos:" + nombreapellidos + ", CorreoElectronico:" + correoElectronico;
	}
	public int compareTo(Persona o) {
		return this.correoElectronico.compareTo(o.correoElectronico);
	}
	
	
}
