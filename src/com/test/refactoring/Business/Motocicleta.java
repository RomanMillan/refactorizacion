package com.test.refactoring.Business;

/**
 * @version 1.0
 * @author Román Millán Díaz
 *
 */
public class Motocicleta {
	
	private String matricula;
	private String color;
	private String combustible;
	private Integer cilindrada;
	private String nombre_conductor;
	private String dniConductor;
	
	/**
	 * Crea un objeto motocicleta
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param cilindrada
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombre_conductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.nombre_conductor = nombre_conductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * Obtiene la matrícula
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 *  Modifica la matrícula
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
	 * Obtiene la cilindrada
	 * @return cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * Modifica la cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
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
		//TO DO
	}
	
	/**
	 * Detiene el vehículo
	 */
	public void Detener() {
		//TO DO
	}

	@Override
	/**
	 * @return Cadena del objeto motocicleta 
	 */
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + nombre_conductor + ", dniConductor="
				+ dniConductor + "]";
	}	

}
