package practica4;

public class Factura extends Cliente{
	private int id;
	private String fecha="15/1/2020";
	private float precioTotal, precioTotal1;
	private int numeroPlantas=6;
	
	
	//Constructor
	public Factura(String nombre, String apellido,int telefono, int cuenta, int id, String fecha, float precioTotal) {
		super(nombre, apellido, telefono, cuenta);
		this.id = id;
		this.fecha = fecha;
		this.precioTotal = precioTotal;
	}

	//Metodos getter y setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
public float generarFactura (){
	//Id automatico
	for(id=0;id<=100;id++) {
		//Descuento mas de dos pantas
		if (numeroPlantas>=2) {
			precioTotal1=(float) (precioTotal-(0.1*precioTotal));
		}
		else {
			precioTotal1=precioTotal;
		}
	}
	return precioTotal1;
}
public void mostrarFactura() {
	System.out.println("Factura numero"+id);
	System.out.println("Fecha factura:"+fecha);
	System.out.println("El precio total es"+precioTotal1);
	System.out.println("Los datos del cliente son Nombre:"+Cliente.getNombre()+
			"/Apellido:"+Cliente.getApellido()+
			"/Telefono:"+Cliente.getTelefono()+
			"/Numero de cuenta"+Cliente.getCuenta());


}
}