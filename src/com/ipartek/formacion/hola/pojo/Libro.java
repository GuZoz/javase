package com.ipartek.formacion.hola.pojo;

public class Libro {

	// atributos y constantes
	private String titulo;
	private String autor;
	private int numeroPaginas;

	/**
	 * Constructores
	 * 
	 * Sirven para instanciar objetos de la misma clase <br>
	 * Tienen el mismo nombre que la clase y no hace falta <br>
	 * especificar el <code> return </code>
	 * 
	 * Sobrecarga: es un método con el mismo nombre y return, <br>
	 * pero diferentes parámetros
	 */

	// constructor por defecto
	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.titulo = "desconocido";
		this.autor = "anonimo";
	}

	// y por parametros
	public Libro(String titulo, int numeroPaginas) {
		super();
		this.setNumeroPaginas(numeroPaginas);
		this.titulo = titulo;
		this.autor = "anonimo";
	}

	public Libro(String titulo, String autor, int numeroPaginas) {
		super();
		this.setNumeroPaginas(numeroPaginas);
		this.titulo = titulo;
		this.autor = autor;
	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;
	}

	// otros métodos

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}

}