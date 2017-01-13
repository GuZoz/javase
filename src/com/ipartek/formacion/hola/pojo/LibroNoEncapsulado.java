package com.ipartek.formacion.hola.pojo;

/**
 * Clase Libro {@code Object} representa un libro.
 */
public class LibroNoEncapsulado {

	// Atributos
	/**
	 * int numeroPaginas Número de páginas que contiene el {@code libro}
	 */
	public int numeroPaginas;

	/**
	 * String nombre nombre del {@code libro}
	 */
	public String nombre;

	/**
	 * String autor nombre del autor
	 */
	public String autor;

	// Métodos o funciones
	/**
	 * Muestra por pantalla los atributos del {@code libro}
	 */
	public String describete() {
		return "Descripción: " + this.nombre + ", número de páginas: " + this.numeroPaginas + ", autor: " + this.autor;
	}

	/**
	 * Aumentamos el numero de paginas
	 * 
	 * @param numPaginas
	 *            <code>int</code> numero de paginas nuevas escritas
	 */
	public void escribir(int numPaginas) {
		// this.numeroPaginas = this.numeroPaginas + numPaginas
		this.numeroPaginas += numPaginas;
	}
}
