package practica4;

public class PlantaGrande extends Planta{
	private static float tiempoRegado=4.5f;
	private static float cantidadAgua=8;

	public PlantaGrande(int id, String nombre, String nombreCientifico, String lugar, String color, float precio,
			float tiempoRegado, float cantidadAgua) {
		super(id, nombre, nombreCientifico, lugar, color, precio);
		PlantaGrande.tiempoRegado = tiempoRegado;
		PlantaGrande.cantidadAgua = cantidadAgua;
	}

	public float getTiempoRegado() {
		return tiempoRegado;
	}
	

	public void setTiempoRegado(float tiempoRegado) {
		PlantaGrande.tiempoRegado = tiempoRegado;
	}

	public float getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(float cantidadAgua) {
		PlantaGrande.cantidadAgua = cantidadAgua;
	}

	
}
