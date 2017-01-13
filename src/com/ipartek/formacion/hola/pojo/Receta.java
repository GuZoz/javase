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
		if (ingredientes == null) {
			glutenFree = false;
			System.out.println("Esta receta no tiene ingredientes!. No es posible comprobar el contenido de gluten");
		} else {
			for (int i = 0; i < ingredientes.length; i++) {
				if (ingredientes[i].isGluten()) {
					glutenFree = false;
					System.out.println("El ingrediente (" + ingredientes[i].getNombre() + ") contiene gluten");
				}
			}
		}
		return glutenFree;
	}
}
