package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testTitulo() {
		Libro libroJava = new Libro();

		libroJava.setTitulo("Java 7");

		assertEquals("Java 7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();

		// numero paginas positivo

		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());

		// numero paginas negativo == 0

		l.setNumeroPaginas(-300);
		assertEquals(0, l.getNumeroPaginas());
	}

	@Test
	public void testConstructorPorDefecto() {

		Libro libroInicio = new Libro();
		assertEquals(0, libroInicio.getNumeroPaginas());
		assertEquals("desconocido", libroInicio.getTitulo());
		assertEquals("anonimo", libroInicio.getAutor());

	}

	@Test
	public void testConstructorConParametros() {

		Libro libroI = new Libro("Java 7", 324);
		assertEquals(324, libroI.getNumeroPaginas());
		assertEquals("Java 7", libroI.getTitulo());
		assertEquals("anonimo", libroI.getAutor());

		libroI = new Libro("Java 7", -324); // reseteo el libroI al no declarar
											// Libro al ppio de la expresion
		assertEquals(0, libroI.getNumeroPaginas());
		assertEquals("Java 7", libroI.getTitulo());
		assertEquals("anonimo", libroI.getAutor());

	}
}
