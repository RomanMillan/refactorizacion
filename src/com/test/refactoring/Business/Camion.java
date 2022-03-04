package com.test.refactoring.Business;
/**
 * @version 1.0
 * @author Román Millán Díaz
 *
 */
public class Camion {

	private String matricula;
	private String color;
	private String combustible;
	private String tipoCarnet;
	private String nombre_conductor;
	private String dniConductor;
	
	/**
	 * Llama a la clase pladre
	 */
	public Camion() {
		super();
	}
	/**
	 *  Crea un objeto camión
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param tipoCarnet
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombre_conductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.tipoCarnet = tipoCarnet;
		this.nombre_conductor = nombre_conductor;
		this.dniConductor = dniConductor;
	}
/**
 *  Obtiene la matrícula
 * @return matricula
 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 *  Modifíca la matrícula
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
/**
 * Obtiene el color
 * @return color
 */
	public String getColor() {
		return color;
	}
/**
 * Modifica el color
 * @param color
 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene el combustible
	 * @return combustible
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * Modifica el combustible
	 * @param combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Obtiene el tipo de carnet
	 * @return tipo carnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}

	/**
	 * Cambia el tipo carnet
	 * @param tipoCarnet
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	/**
	 * Obtiene el nombre conductor
	 * @return nombre conductor
	 */
	public String getNombre_conductor() {
		return nombre_conductor;
	}

	/**
	 *  Modifica el nombre del conductor
	 * @param nombre_conductor
	 */
	public void setNombre_conductor(String nombre_conductor) {
		this.nombre_conductor = nombre_conductor;
	}

	/**
	 * Obtiene el dni conductor
	 * @return dni conductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Modifica el dni conductor
	 * @param dniConductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
	/**
	 * Acelera el vehículo
	 * @param velocidad
	 */
	public void Acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	
	/**
	 * Detiene el vehículo
	 */
	public void Detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	@Override
	/**
	 * @return cadena del objeto camión 
	 */
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}
	
}
