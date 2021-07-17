
public class Registro {
	private Hash<Usuario> usuarios;
	private int codigo;
	public Registro(Hash<Usuario> usuarios) {
		this.usuarios = usuarios;
		this.codigo = 1;
	}
	public Registro() {
		this.usuarios = new Hash<Usuario>(10);
		this.codigo = 0;
	}
	public void agregarRegistro(Usuario user) {
		this.usuarios.insert(this.codigo, user);
		this.codigo = this.codigo + 1;
	}
	public void buscarRegistro(int codigo) {
		usuarios.search(codigo);
	}
	@Override
	public String toString() {
		return  usuarios + "\n";
	}
	
}
