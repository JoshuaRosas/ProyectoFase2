import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class DatosRegistro {/*
	JTextField DNI = new JTextField();
	JTextField apPat= new JTextField();
	JTextField apMat = new JTextField();
	JTextField Nombr = new JTextField();
	JTextField User = new JTextField();
	JTextField Passw = new JTextField();
	String confir;
	
	 public DatosRegistro() {
		 this.confir = "N";
		 this.DNI.setText("");
		 this.apPat.setText("");
		 this.apMat.setText("");
		 this.Nombr.setText("");
		 this.User.setText("");
		 this.Passw.setText("");
		 Registro();
	 }
	 
	 
	 
	 public String getConfir() {
		return confir;
	}
	public void setConfir(String confir) {
		this.confir = confir;
	}
	public void Registro() {
		 int a = JOptionPane.showConfirmDialog(null,"Ingrese A continuacion los Datos Solicitados: ","¡Crea Tu Cuenta!",JOptionPane.OK_CANCEL_OPTION);
		 int count = 0;
		 boolean conf = true;
		 while (a == 0) {
			 conf = true;
			 Object[] datos = {
					 "Ingrese Su DNI: ", DNI,
					 "Ingrese su Nombre: ", Nombr,
					 "Ingrese su Apellido Paterno:", apPat,
					 "Ingrese su Apellido Materno:", apMat };
			 Object[] userd = {
					 "Ingrese Un Nombre De Usuario:", User,
					 "Ingrese Una Contraseña:", Passw};
			 while (conf == true && count == 0) {
				 if (count == 0) {
					 a = JOptionPane.showConfirmDialog(null,datos,"INGRESO DE DATOS",JOptionPane.OK_CANCEL_OPTION);
					 conf = false;
					 if (a == 0) {
					 try {
						 setDNI(validarNumeros(DNI,"DNI"));
						 setNombre(validarTexto(Nombr, "Nombre"));
						 setApePaterno(validarTexto(apPat, "Apellido Paterno"));
						 setApeMaterno(validarTexto(apMat, "Apellido Materno"));
						 } catch (WrongType e) {
							 a = JOptionPane.showConfirmDialog(null,e.getMessage(),"DATA NO VALIDO", JOptionPane.OK_CANCEL_OPTION);
							 conf = true;
						 }
					 }
				 }
			 }
			 System.out.println(count);
			 while (conf == true && count == 1) {
				 if (count == 1) {
					 a = JOptionPane.showConfirmDialog(null,userd,"INGRESO DE DATOS",JOptionPane.OK_CANCEL_OPTION);
					 conf = false;
					 if(a == 0) {
						 try {
							 setNombreU(validarUsuario(User, "Usuario"));
							 setContraseña(validarUsuario(Passw, "Contraseña"));
						 } catch (WrongType e) {
							 a = JOptionPane.showConfirmDialog(null,e.getMessage(),"DATA NO VALIDO", JOptionPane.OK_CANCEL_OPTION);
							 conf = true;
						 }
					 }
				 }
			 }
			 while (conf == true && count == 2) {
				 if(count == 2)
					 a = JOptionPane.showConfirmDialog(null,toString(),"¡Ya Casi Esta Listo!",JOptionPane.OK_CANCEL_OPTION);
				 if (a != 0) {
					 count = 0;
					 conf = false;
					 JOptionPane.showConfirmDialog(null,"Registro Cancelado","Registro",JOptionPane.OK_CANCEL_OPTION);
					 setDNI(0);
					 setNombreU("");
					 setApePaterno("");
					 setApeMaterno("");
					 setNombreU("");
					 setContraseña("");
				 }else {
					 JOptionPane.showConfirmDialog(null,"Gracias Por Registrase En ...","Bienvenido",JOptionPane.OK_CANCEL_OPTION);
					 conf = false;
					 a = -1;
					 setConfir("P");
				 }
			 }
			 count++;
		 }
	 }
	public String validarTexto(JTextComponent obj, String Campo) throws WrongType{
		String valid = obj.getText();
		char[] charArray = valid.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!((ch2 >= 65 && ch2 <= 94) ||(ch2 >= 97 && ch2 <= 122) ||(ch2 == 32) )) { //Validacion ASCII para solo ingreso de letras min y mayus
				throw new WrongType("Dato Invalido: " + valid + " Para "+ Campo);
			}
		}
		return valid;
	}
	public int validarNumeros(JTextComponent obj, String Campo) throws WrongType{
		String valid = obj.getText();
		char[] charArray = valid.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!(ch2 >= 48 && ch2 <= 57)) { //Validacion ASCII para solo numeros entre 0 y 9
				throw new WrongType("Dato Invalido: " + valid + " Para "+ Campo);
			}
		}
		int ret = Integer.parseInt(valid);
		return ret;
	}
	public String validarUsuario(JTextComponent obj, String Campo) throws WrongType{
		String valid = obj.getText();
		char[] charArray = valid.toCharArray();
		char ch2;
		for (int i = 0; i<charArray.length; i++) {
			ch2 = charArray[i];
			if(!((((ch2 >= 65 && ch2 <= 94) || (ch2 >= 97 && ch2 <= 122))) || (ch2 >= 48 && ch2 <= 57) || (ch2 == 32))) { //Validacion ASCII para no caracteres especiales
				throw new WrongType("Dato Invalido " + "Para: "+ Campo + "\nNo Debe Usar Caracteres Especiales");
			}
		}
		return valid;
	}
	public void registro() {
		
	}
	@Override
	public String toString() {
		return super.toString(); 
	}
	 */
}
