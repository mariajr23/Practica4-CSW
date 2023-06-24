package practica4;

public class Cliente {
	//Atributos
	private static String nombre;
	private static String apellido;
	private static Double telefono;
	private static int cuenta;
	//Constructor 1 
	public Cliente(String nombre, String apellido, int telefono, int cuenta) {
		Cliente.nombre = nombre;
		Cliente.apellido = apellido;
		
	}
	//Constructor 2
	public Cliente(	int telefono, int cuenta) {
		Cliente.telefono = (double) telefono;
		Cliente.cuenta = cuenta;
	}
	
	//Constructor sobrecargado 
	public Cliente(	Double telefono, int cuenta) {
		Cliente.telefono = telefono;
		Cliente.cuenta = cuenta;
	}
	
	//Metodos Getters y Setters
	public static String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		Cliente.nombre = nombre;
	}
	public static String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		Cliente.apellido = apellido;
	}
	public static Double getTelefono() {
		return telefono;
	}
	public void setTelefono(Double telefono) {
		Cliente.telefono = telefono;
	}
	public static int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		Cliente.cuenta = cuenta;
	}
	

	
	
}
