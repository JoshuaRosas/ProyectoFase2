
public class Registro {
	private HashC<Usuario> usuarios = new HashC<Usuario>(5);
	private int codigo;
	public Registro(HashC<Usuario> usuarios) {
		this.usuarios = usuarios;
		this.codigo = 1;
	}
	public Registro() {
		this.usuarios = new HashC<Usuario>(5);
	}
	public HashC<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashC<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public void agregarRegistro(Usuario user) {
		this.usuarios.insert(this.codigo, user);
		this.codigo = this.codigo + 1;
	}
	@Override
	public String toString() {
		return  usuarios + "\n";
	}
	
}
