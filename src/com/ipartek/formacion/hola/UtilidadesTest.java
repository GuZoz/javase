package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 14;
		// crear array con todo false.
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar 1000 numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// recorrer array y comprobar todo true
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);
		}

	}

	@Test
	public void testSumaTonta() {
		// assertTrue(Utilidades.sumaTonta(-1, 50) == 0 &&
		// Utilidades.sumaTonta(50, -1) == 0);
		// assertTrue(Utilidades.sumaTonta(52, 50) == 0);
		// assertTrue(Utilidades.sumaTonta(40, 50) == 40 + 50);

		// for (int num1 = -10; num1 < 150; num1++) {
		// for (int num2 = -10; num2 < 150; num2++) {
		// if (num1 < 0 || num2 < 0) {
		// assertTrue(Utilidades.sumaTonta(num1, num2) == 0);
		// } else if (num1 + num2 > 100) {
		// assertTrue(Utilidades.sumaTonta(num1, num2) == 0);
		// } else {
		// assertTrue(Utilidades.sumaTonta(num1, num2) == (num1 + num2));
		// }
		//
		// }
		// }

		assertEquals("No suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, 3));
		assertEquals(0, Utilidades.sumaTonta(2, -3));
		assertEquals(0, Utilidades.sumaTonta(-2, -3));
		assertEquals("Mayor de 100 retorna 0", 0, Utilidades.sumaTonta(1, 100));

	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(true);
	}
}
