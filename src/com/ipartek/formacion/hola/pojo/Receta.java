package com.ipartek.formacion.hola.pojo;

import java.util.Arrays;

public class Receta {

	// atributos y constantes
	String titulo;
	Ingrediente[] ingredientes;
	int tiempo;
	String dificultad;
	int comensales;
	String descripcion;

	// constructores

	public Receta() {
		super();
		this.titulo = "desconocido";
		this.ingredientes = null;
		this.tiempo = 0;
		this.dificultad = "desconocida";
		this.comensales = 0;
		this.descripcion = "desconocida";
	}

	public Receta(String titulo, Ingrediente[] ingredientes) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.tiempo = 0;
		this.dificultad = "desconocida";
		this.comensales = 0;
		this.descripcion = "desconocida";
	}

	// getter setter

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// otros métodos

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingredientes=" + Arrays.toString(ingredientes) + ", tiempo=" + tiempo
				+ ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

	public boolean isGlutenFree() {
		boolean glutenFree = true;
		if (this.ingredientes == null) {
			glutenFree = false;
			System.out.println("Esta receta no tiene ingredientes!. No es posible comprobar el contenido de gluten");
		} else {
			for (int i = 0; i < this.ingredientes.length; i++) { // for(ingrediente
																	// i :
																	// this.ingredientes)
				if (this.ingredientes[i].isGluten()) {
					glutenFree = false;
					System.out.println("El ingrediente (" + this.ingredientes[i].getNombre() + ") contiene gluten");
				}
			}
		}
		return glutenFree;
	}

	public void addIngrediente(Ingrediente ingrediente) {

	}

	/**
	 * Eliminar el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsensitive
	 * 
	 * @param ingrediente
	 *            a eliminar @ return
	 */
	public void removeIngrediente(Ingrediente ingrediente) {

	}
}
