package com.test.refactoring.main;

import java.util.Scanner;

import com.test.refactoring.Business.Camion;
import com.test.refactoring.Business.Coche;
import com.test.refactoring.utils.Utils;
/**
 * @version 1.0
 * @author Román Millán Díaz
 *
 */
public class MenuApp {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarPresentacion();
		
		String nombre = leerNombre(sc);
		String primerApellido = leerApellido(sc);
		
		menu(nombre, primerApellido);
		
		int numCoches = leerNumCoches(sc);
		Coche[] listaCoches = new Coche[numCoches];
		
		listaChoches(numCoches, listaCoches);
		
		int numCamiones = leerNumCamiones(sc);
		Camion[] listaCamiones = new Camion[numCamiones];
		listaCamiones(numCamiones, listaCamiones);
		
		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);
		
		sc.close();
		
	}

	/**
	 * Lee el apellido del usuario
	 * @param sc 
	 * @return apellido
	 */
	private static String leerApellido(Scanner sc) {
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		return primerApellido;
	}

	/**
	 * Lee el nombre del usuario
	 * @param sc
	 * @return nombre
	 */
	private static String leerNombre(Scanner sc) {
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		return nombre;
	}

	/**
	 *  Imprime el menú
	 * @param nombre
	 * @param primerApellido
	 */
	private static void menu(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	/**
	 * Lee número de camiones
	 * @param sc
	 * @return número camiones
	 */
	private static int leerNumCamiones(Scanner sc) {
		System.out.println("Introduce el número de camiones : ");
		int numCamiones= sc.nextInt();
		return numCamiones;
	}

	/**
	 * Lee el número de coches
	 * @param sc
	 * @return número de coches
	 */
	private static int leerNumCoches(Scanner sc) {
		System.out.println("Introduce el número de coches : ");
		int numCoches= sc.nextInt();
		return numCoches;
	}

	/**
	 * Acelera el camión de la lista.
	 * @param numCamiones
	 * @param listaCamiones
	 */
	private static void listaCamiones(int numCamiones, Camion[] listaCamiones) {
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].Acelerar(10);
		}
	}

	/**
	 * Acelera el camión de la lista.
	 * @param numCoches
	 * @param listaCoches
	 */
	private static void listaChoches(int numCoches, Coche[] listaCoches) {
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].Acelerar(10);
		}
	}
	
	/**
	 * Imprime la presentación
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Detiene el vehiculo de la lista
	 * @param listaCoches
	 */
	private static void detenerVehiculos(Coche[] listaCoches) {
		detenerListaVehiculo(listaCoches);
	}

	/**
	 * Detiene el vehiculo de la lista
	 * @param listaCoches
	 */
	private static void detenerListaVehiculo(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].Detener();
		}
	}
	
	/**
	 * Detiene le vehículo de la lista
	 * @param listaCamiones
	 */
	private static void detenerVehiculos(Camion[] listaCamiones) {
		detenerListaCamion(listaCamiones);
	}

	/**
	 * Detiene el camion buscado
	 * @param listaCamiones
	 */
	private static void detenerListaCamion(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].Detener();
		}
	}

}
