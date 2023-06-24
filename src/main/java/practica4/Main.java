package practica4;

public class Main {

	public static void main(String[] args) {
		
		PlantaPequena p1= new PlantaPequena(0, "Planta peque�a 1", "Planta peque�a 1 cientif", "Italia", "amarilla", 5.5f, 2.5f, 4.8f);
		PlantaPequena p2= new PlantaPequena(1, "Planta peque�a 2", "Planta peque�a 2 cientif", "Espa�a", "roja", 4.8f, 2.5f, 4.8f);
		
		PlantaMediana m1= new PlantaMediana (2, "Planta mediana 1", "Planta mediana 1 cientif", "Brasil", "verde", 3,3, 5.6f);
		PlantaMediana m2= new PlantaMediana (3, "Planta mediana 2", "Planta mediana 2 cientif", "EE.UU", "azul", 8.3f, 3, 5.6f);
		
		PlantaGrande g1= new PlantaGrande (4, "Planta grande 1", "Planta grande 1 cientif", "Portugal", "naranja", 9.1f, 4.5f, 8);
		PlantaGrande g2= new PlantaGrande (5, "Planta grande 2", "Planta grande 2 cientif", "Francia", "blanca", 4.8f, 4.5f, 8);
		
		System.out.println("Planta peque�a 1:"
				+ "Su nombre cientifico es "+p1.getNombreCientifico()
				+" es de color "+p1.getColor()+" y sus cuidados son "+p1.getTiempoRegado()+" horas de regado y necesita "+p1.getCantidadAgua()+" litros de agua");
		System.out.println("Planta peque�a 2:"
				+ "Su nombre cientifico es "+p2.getNombreCientifico()
				+" es de color "+p2.getColor()+" y sus cuidados son "+p2.getTiempoRegado()+" horas de regado y necesita "+p2.getCantidadAgua()+" litros de agua");

		System.out.println("Planta mediana 1:"
				+ "Su nombre cientifico es "+m1.getNombreCientifico()
				+" es de color "+m1.getColor()+" y sus cuidados son "+m1.getTiempoRegado()+" horas de regado y necesita "+m1.getCantidadAgua()+" litros de agua");
		System.out.println("Planta mediana 2:"
				+ "Su nombre cientifico es "+m2.getNombreCientifico()
				+" es de color "+m2.getColor()+" y sus cuidados son "+m2.getTiempoRegado()+" horas de regado y necesita "+m2.getCantidadAgua()+" litros de agua");

		
		System.out.println("Planta grande 1:"
				+ "Su nombre cientifico es "+g1.getNombreCientifico()
				+" es de color "+g1.getColor()+" y sus cuidados son "+g1.getTiempoRegado()+" horas de regado y necesita "+g1.getCantidadAgua()+" litros de agua");
		System.out.println("Planta grande 2:"
				+ "Su nombre cientifico es "+g2.getNombreCientifico()
				+" es de color "+g2.getColor()+" y sus cuidados son "+g2.getTiempoRegado()+" horas de regado y necesita "+g2.getCantidadAgua()+" litros de agua");

		
		
	}
}
