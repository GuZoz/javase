package com.ipartek.formacion.hola;

/**
 * Clase {@code Utilidades} con m�todos est�ticos y comunes.<br>
 * Por ejemplo: generar numeros aleatorios, validaciones, etc
 * 
 * @author Curso
 *
 */
public class Utilidades {

	/**
	 * Generar n�mero {@code int} aleatorio desde 0 hasta <b>maximoValor</b>
	 * 
	 * @param maximoValor
	 *            n�mero aleatorio hasta m�ximo valor que puede generar,
	 *            imcluido
	 * @return n�mero entero aleatorio
	 */
	static public int getNumeroAleatorio(int maximoValor) {
		int numeroAleatorio = (int) (Math.random() * maximoValor + 1);
		return numeroAleatorio;
	}

	/**
	 * Suma muy rara que se invwenta el jefe, no me digas para que
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @return suma de los dos par�metros, pero: <br>
	 *         si cualquiera de los dos negativos return 0 si la suma es
	 *         superior a 100 return 0
	 */
	static public int sumaTonta(int num1, int num2) {
		int resultado = -1;

		if (num1 < 0 || num2 < 0 || (num1 + num2) > 100) {
			resultado = 0;
		} else {
			resultado = num1 + num2;
		}

		return resultado;
	}
}
