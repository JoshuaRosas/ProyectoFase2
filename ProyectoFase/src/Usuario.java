public class Usuario implements Comparable<Usuario>{
	private Persona usuario;
	private String contraseña;
	private ListLinked<CasaCambio> puesto;
	public Usuario(Persona usuario, String contraseña, ListLinked<CasaCambio> puesto) {
		super();
		this.usuario =  usuario;
		this.contraseña = contraseña;
		this.puesto = puesto;
	}
	
	public Usuario() {
		super();
	}

	public Persona getUsuario() {
		return usuario;
	}
	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public ListLinked<CasaCambio> getPuesto() {
		return puesto;
	}
	public void setPuesto(ListLinked<CasaCambio> puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return  "Usuario --> Datos personales:" + usuario + " - Contraseña: " + contraseña + "\n\t\tCasasDeCambio:" + puesto ;
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}