package com.ipartek.formacion.hola;

public class Dado {

	/**
	 * Array de alumnos
	 */
	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbine", "Egoitz", "Pavel", "Pérez" };

	public static void listar() {
		String alumno = "";
		for (int i = 0; i < aAlumnos.length; i++) {
			alumno = aAlumnos[i];
			System.out.println(i + " - " + alumno);
		}
	}

	public static void listarForEach() {
		for (String alumno : aAlumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {

		int numeroAleatorio = Utilidades.getNumeroAleatorio(aAlumnos.length - 1);
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/ afortunad@ es: " + afortunado);

		listar();
		listarForEach();

	}
}
