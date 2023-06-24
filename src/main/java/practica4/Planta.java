package practica4;
//Para diferenciar el tipo de planta y ahorrar codigo tomamos esta clase como padre
//y heredamos a las clases hijas donde diferenciamos los cuidados segun el tama�o
public class Planta {
	private int id;
	private String nombre;
	private String nombreCientifico;
	private String lugar;
	private String color;
	private float precio;
	
	//Constructor
	public Planta(int id, String nombre, String nombreCientifico, String lugar, String color, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.lugar = lugar;
		this.color = color;
		this.precio = precio;
	}
	
	//Getters y Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
		
	
}
