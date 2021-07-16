public class Usuario implements Comparable<Usuario>{
	private Persona usuario;
	private String contrase�a;
	private ListLinked<CasaCambio> puesto;
	public Usuario(Persona usuario, String contrase�a, ListLinked<CasaCambio> puesto) {
		super();
		this.usuario =  usuario;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public ListLinked<CasaCambio> getPuesto() {
		return puesto;
	}
	public void setPuesto(ListLinked<CasaCambio> puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return  "Usuario --> Datos personales:" + usuario + " - Contrase�a: " + contrase�a + "\n\t\tCasasDeCambio:" + puesto ;
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}