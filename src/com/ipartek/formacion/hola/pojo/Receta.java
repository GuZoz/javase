package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	// atributos y constantes
	public String IMG_DEFAULT = "http://apps.enyojs.com/assets/apps/17daydietmealplan_icon.png";

	private String titulo;
	private String imagen;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	// constructores

	public Receta() {
		super();
		this.titulo = "desconocido";
		this.imagen = IMG_DEFAULT;
		setIngredientes(null);
		this.tiempo = 0;
		this.dificultad = "desconocida";
		this.comensales = 0;
		this.descripcion = "desconocida";
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		// this.ingredientes = ingredientes;
		setIngredientes(ingredientes);
		this.tiempo = 0;
		this.dificultad = "desconocida";
		this.comensales = 0;
		this.descripcion = "desconocida";
	}

	public Receta(String titulo) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setIngredientes(null);
		this.tiempo = 0;
		this.dificultad = "facil";
		this.comensales = 0;
		this.descripcion = "Lorem Ipsum";
	}

	// getter setter

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = (ingredientes == null) ? new ArrayList<Ingrediente>() : ingredientes;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	// otros métodos

	public boolean isGlutenFree() {
		boolean resul = true;
		if (this.ingredientes != null) {
			for (Ingrediente i : this.ingredientes) {
				if (i.isGluten()) {
					resul = false;
					break;
				}
			}
		}
		return resul;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", imagen=" + imagen + ", ingredientes=" + ingredientes + ", tiempo="
				+ tiempo + ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion
				+ "]";
	}

	/**
	 * TODO cuando sea null lanzar excepcion personalizadda <br>
	 * 
	 * @param ingrediente
	 */
	public void addIngrediente(Ingrediente ingrediente) {
		if (ingrediente != null) {
			this.ingredientes.add(ingrediente);
		}

	}

	/**
	 * Eliminar el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsensitive
	 * 
	 * @param ingrediente
	 *            a eliminar @ return
	 */
	public boolean removeIngrediente(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * Comprueba si contiene el ingrediente pasado como parametro
	 * 
	 * @param ingrediente
	 * @return
	 */
	public boolean contiene(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);
				if (NOMBRE_INGREDIENTE_BUSCAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					resul = true;
					break;
				}
			}
			// tb se podria con un foreach
			// final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			// Ingrediente iterateIngredient = null;
			// for (ingrediente iterateIngredient : ingredientes) {}

		}
		return resul;
	}
}
