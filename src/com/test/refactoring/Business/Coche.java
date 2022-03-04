package com.test.refactoring.Business;
/**
 * @version 1.0
 * @author Román Millán Díaz
 *
 */
public class Coche {
	
	private static final int MAXIMO = 120;
	private static final int MINIMO = 0;
	private String matricula;
	private String color;
	private String combustible;
	private Integer numPlazas;
	private String nombre_conductor;
	private String dniConductor;
	
	/**
	 *  Llama a la clase padre Coche
	 */
	public Coche() {
		super();
	}
	
	/**
	 * Crea un objeto coche
	 * @param matricula
	 * @param color
	 * @param combustrible
	 * @param numPlazas
	 * @param nombre_conductor
	 * @param dniConductor
	 */
	public Coche(String matricula, String color, String combustrible, Integer numPlazas, String nombre_conductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustrible;
		this.numPlazas =  numPlazas;
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
	 * Modifíca el color
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
	 *Obtiene el numero de plazas
	 * @return numero de plazas
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}

	/**
	 * Modifica el numero de plazas
	 * @param numPlazas
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
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
	 * Modifíca el dni conductor
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
		if (velocidad > MINIMO && velocidad < MAXIMO) {
			String acelerando = "El coche est� acelerando y llegar� la velocidad de ";
			System.out.println(acelerando + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	/**
	 * Detiene el vehículo
	 */
	public void Detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	/**
	 * @return cadena del objeto coche 
	 */
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombre_conductor + ", dniConductor=" + dniConductor + "]";
	}

}
