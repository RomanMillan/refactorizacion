package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @version 1.0
 * @author Román Millán Díaz
 *
 */
public class Utils {
	
	private static final float IVA = 1.21f;

	/**
	 *  Obtiene la hora actual del sistema
	 * @return hora
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Obtiene la fecha acutal del sistema
	 * @return fecha
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Calcula el precio del alquiler
	 * @param dias
	 * @return precio
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * 50 * IVA;
		return result;
	}
	
	/**
	 * Calcula el porecio del reting
	 * @param meses
	 * @return precio
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * 750 * IVA;
	}

}
