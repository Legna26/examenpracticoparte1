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
		
		Carta cartaElegida = rest.seleccionarCarta(carta1 , carta2);
		
		rest.mostrarPrecios(cartaElegida);
		
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
	
	public Carta seleccionarCarta(Carta ... cartas) {
		
		System.out.println("Bienvenido al Restaurante " + nombre + ". Las cartas a elegir son: ");
		System.out.println("=============================================");
		Carta [] cartita = cartas;
		for (int i=0 ; i<cartita.length ; i++) {
			System.out.println((i+1) + ". "+ cartita[i].getNombre());
		}
		
		int numeroCarta = Utilidades.pideDatoNumerico("¿Qué carta desea?");
		
		Carta cartaElegida = cartita [numeroCarta-1];
		return cartaElegida;
	}
	
	public void mostrarPrecios(Carta carta) {
	 
		System.out.println("Los precios de la carta " + carta.getNombre() + " son:");
				
		Plato[] platos = carta.getPlatos();
		Bebida [] bebidas = carta.getBebidas();
		
		double precioTotalPlatos = 0;
		double precioTotalBebidas = 0;
		for (int i=0 ; i<platos.length ; i++) {
			System.out.println(platos[i].getNombre() + " - precio: " + platos[i].getPrecio());
			double precioPlato = platos[i].getPrecio();
			precioTotalPlatos += precioPlato;
		}
		
		
		for (int i=0 ; i<bebidas.length ; i++) {
			System.out.println(bebidas[i].getNombre() + " - precio: " + bebidas[i].getPrecio());
			double precioBebida = bebidas[i].getPrecio();
			precioTotalBebidas += precioBebida;
		}
		
		System.out.println("El precio total del menú es: " + (precioTotalPlatos+precioTotalBebidas));
	}
	
}
