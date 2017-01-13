package com.ipartek.formacion.hola.pojo;

public class CincoLibrosMasVendidos {

	public static void main(String[] args) {

		Libro libro1 = new Libro("AMOR Y ASCO", "@SRTABEBI", 232);
		Libro libro2 = new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS", "J. K. ROWLING", 256);
		Libro libro3 = new Libro("EL LABERINTO DE LOS ESPIRITUS", "Carlos Ruiz Zafon", 928);
		Libro libro4 = new Libro("CUANDO ABRAS EL PARACAIDAS", "Defreds", 216);
		Libro libro5 = new Libro("TODO ESTO TE DARE", "Dolores Redondo", 624);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		System.out.println(libro4.toString());
		System.out.println(libro5.toString());
	}
}
