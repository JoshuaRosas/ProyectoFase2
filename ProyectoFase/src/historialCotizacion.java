import java.util.Scanner;

public class historialCotizacion {
	String correo;
	ListLinked<String> historial;
	Scanner entradaDato = new Scanner(System.in);
	
	public historialCotizacion() {
		super();
		this.correo = "";
		historial = new ListLinked<String>();
		// TODO Auto-generated constructor stub
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void ingresoSdato() {
		System.out.print("Ingrese su correo: ");
		correo = entradaDato.nextLine();
		if(historial.isEmptyList()) {
			historial.insertFirst(correo);
		} else {
			historial.insertLast(correo);
			System.out.println("El correo se ingreso correctamente");
		}
	}
	
	public void mostrarHistorial() {
		if(historial.isEmptyList()) {
			System.out.println("No hay historial");
		} else {
			System.out.println("HISTORIAL: ");
			System.out.println(historial);
		}
	}
	
}