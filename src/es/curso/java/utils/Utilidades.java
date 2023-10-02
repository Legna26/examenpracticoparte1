package es.curso.java.utils;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String txt3 = scan.nextLine();
				
		return txt3;
	}
	
	public static int pideDatoNumerico(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
			
		return num;
	}
	
	public static double pideDatoNumericoDouble(String texto) {
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		double num = scan.nextInt();
			
		return num;
	}
	
	public static int pintarMenu(String menu) {
		return pintarMenu(menu, "Selecciona una opción:",":");
	}
	
	public static int pintarMenu(String menu , String pregunta , String caracterSeparacion) {
		return pintarMenu(menu.split(caracterSeparacion),pregunta);		
	}
	
	public static int pintarMenu(String [] menu , String pregunta) {
		for (String opcion : menu) {
			System.out.println(opcion);
		}
		
		int opc = pideDatoNumerico(pregunta);
		
		return opc;
				
	}

}
