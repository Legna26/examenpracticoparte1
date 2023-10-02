package emmy.tamayo.examen;

import es.curso.java.utils.Utilidades;

public class Restaurante {
	
	private String nombre = "La Quedada";
		
	public static void main(String[] args) {
		
		
		Plato plato1 = new Plato ("Tortilla de patatas", 3.50 , true );
		Plato plato2 = new Plato ("Paella", 8 , true);
		Plato plato3 = new Plato ("Patatas con ali oli" , 4 , true);
		Plato plato4 = new Plato ("Lechón asado" , 7.50 , true);
		Plato plato5 = new Plato ("Cocido madrileño", 6 , false);
		
		Bebida bebida1 = new Bebida ( "Refresco", 2);
		Bebida bebida2 = new Bebida ("Limonada de sandía y menta", 3);
		
		Plato [] menuPlatosCarta1 = {plato2, plato4, plato5};
		Bebida [] menuBebidasCarta1 = {bebida2};
		Carta carta1 = new Carta ("Menú del día", menuPlatosCarta1, menuBebidasCarta1);
		
		Plato [] menuPlatosCarta2 = {plato1, plato3};
		Bebida [] menuBebidasCarta2 = {bebida1};
		Carta carta2 = new Carta ("Acompañantes", menuPlatosCarta2, menuBebidasCarta2);
		
		Restaurante rest = new Restaurante();
		
		rest.mostrarPlatosDisponibles (carta1 , carta2);
		
		int numeroCarta = rest.seleccionarCarta(carta1 , carta2);
		
	}

	public void mostrarPlatosDisponibles (Carta...cartas) {
		
		for (Carta cartita : cartas) {
			
			System.out.println("Carta: "+ cartita.getNombre());
			
			Plato[] platos = cartita.getPlatos();
						
			System.out.println("Platos disponibles:");
			for (Plato platito : platos) {
				
				if (platito.isDisponible() == true) {
					System.out.println(platito.getNombre());
				}
			}
			
			System.out.println("==========================================");
		}

	}
	
	public int seleccionarCarta(Carta ... cartas) {
		
		System.out.println("Bienvenido al Restaurante " + nombre + ". Las cartas a elegir son: ");
		System.out.println("=============================================");
		for (Carta cartita : cartas) {
			mostrarPlatosDisponibles(cartita);
		}
		int numeroCarta = Utilidades.pideDatoNumerico("¿Qué carta desea?\n1. Menú del día. \n2. Acompañantes");
				
		return numeroCarta;
	}
	
 public void mostrarPrecios(int numCarta, Carta carta) {
	 
	 
 }
	
}
