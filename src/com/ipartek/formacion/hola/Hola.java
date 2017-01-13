package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.LibroNoEncapsulado;

/**
 * 
 * @author curso
 * 
 *         Comentario de javadoc, en diferente color. Hay que documentar todo:
 *         Clase para realizar un Helloworld
 */

public class Hola {
	public static void main(String[] args) {
		/**
		 * Método main para ejecutar la clase
		 */
		// Prints "Hello, World" in the terminal window.
		/*
		 * Block comment
		 */
		System.out.println("Hello, World");

		// instanciar un objeto de la clase libro, sin olvidar importar la clase
		// o package

		LibroNoEncapsulado libroJava = new LibroNoEncapsulado();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		System.out.println(libroJava.describete());

		LibroNoEncapsulado libroMySQL = new LibroNoEncapsulado();
		libroMySQL.numeroPaginas = 725;
		libroMySQL.nombre = "MySQL";
		libroMySQL.autor = "Anonimo";
		System.out.println(libroMySQL.describete());

		libroMySQL.escribir(1);
		System.out.println(libroMySQL.describete());

		// escribir 10 páginas nuevas
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

		System.out.println(libroJava.describete());

		// declarar variables
		int iEntera;
		boolean bbooleana = true;
		float fdineroCuenta = 10.23f; // 10.23 euros
		float fdineroCuenta2 = (float) 10.23; // 10.23 euros
		if (!bbooleana) {
			System.out.println("Es falso");
		} else {
			System.out.println("Es verdadero");
		}

		// operador ternario (if/else para asignar una variable) Es el ifelse
		// más rapido para asignar un valor
		// = (condition)? true: false;
		int edad = (3 > 100) ? 18 : 34; // en este caso falso, por lo tanto 34

		// comprobar for (i=0; i<10; i++) vs for (i=0; i<10; ++i)
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
		}

	}
}
