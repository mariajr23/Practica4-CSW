package practica4;

public class PlantaMediana extends Planta{
	private static float tiempoRegado=3;
	private static float cantidadAgua=5.6f;
	
	public PlantaMediana(int id, String nombre, String nombreCientifico, String lugar, String color, float precio,
			float tiempoRegado, float cantidadAgua) {
		super(id, nombre, nombreCientifico, lugar, color, precio);
		PlantaMediana.tiempoRegado = tiempoRegado;
		PlantaMediana.cantidadAgua = cantidadAgua;
	}

	public float getTiempoRegado() {
		return tiempoRegado;
	}

	public void setTiempoRegado(float tiempoRegado) {
		PlantaMediana.tiempoRegado = tiempoRegado;
	}

	public float getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(float cantidadAgua) {
		PlantaMediana.cantidadAgua = cantidadAgua;
	}
	
}
