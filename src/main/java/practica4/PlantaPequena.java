package practica4;

public class PlantaPequena extends Planta {
	private static float tiempoRegado=2.5f;
	private static float cantidadAgua=4.8f;
	
	public PlantaPequena(int id, String nombre, String nombreCientifico, String lugar, String color, float precio, 
			float tiempoRegado, float cantidadAgua) {
		super(id, nombre, nombreCientifico, lugar, color, precio);
		PlantaPequena.cantidadAgua= cantidadAgua;
		PlantaPequena.tiempoRegado= tiempoRegado;
	}

	public float getTiempoRegado() {
		return tiempoRegado;
	}

	public void setTiempoRegado(float tiempoRegado) {
		PlantaPequena.tiempoRegado = tiempoRegado;
	}

	public float getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(float cantidadAgua) {
		PlantaPequena.cantidadAgua = cantidadAgua;
	}

}
