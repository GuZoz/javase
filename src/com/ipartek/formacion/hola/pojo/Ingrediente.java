package com.ipartek.formacion.hola.pojo;

public class Ingrediente {
	// atributos y constantes

	float cantidad;
	String nombre;
	boolean gluten;

	// constructores

	public Ingrediente() {
		super();
		cantidad = 0f;
		nombre = "desconocido";
		gluten = false;
	}

	public Ingrediente(float cantidad, String nombre, boolean gluten) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.gluten = gluten;
	}

	public Ingrediente(float cantidad, String nombre) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.gluten = false;
	}

	// getters y setters

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	@Override
	public String toString() {
		return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + ", gluten=" + gluten + "]";
	}

	// otros metodos
}
