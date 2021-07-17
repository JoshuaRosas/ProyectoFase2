
public class Registro {
	private HashC<Usuario> usuarios;
	private int codigo;
	public Registro(HashC<Usuario> usuarios) {
		this.usuarios = usuarios;
		this.codigo = 1;
	}
	public Registro() {
		this.usuarios = new HashC<Usuario>(10);
		this.codigo = 0;
	}
	public void agregarRegistro(Usuario user) {
		this.usuarios.insert(this.codigo, user);
		this.codigo = this.codigo + 1;
	}
	public void buscarRegistro(long codigo) {
		usuarios.search(codigo);
	}
	@Override
	public String toString() {
		return  usuarios + "\n";
	}
	
}
