package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecetaTest {

	@Test
	public void testIsGlutenFree() {
		Ingrediente[] ingredientes = { new Ingrediente(4, "Patatas", true), new Ingrediente(500, "Bonito", true) };

		// caso 1 todos los ingredientes con gluten
		Receta r = new Receta("", ingredientes);
		assertFalse("caso 1 todos los ingredientes con gluten", r.isGlutenFree());

		// caso 2 todos los ingredientes sin gluten
		ingredientes[0] = new Ingrediente(0, "", false);
		ingredientes[1] = new Ingrediente(0, "", false);

		r = new Receta("", ingredientes);
		assertTrue("caso 2 todos los ingredientes SIN gluten", r.isGlutenFree());

		// caso 3 todos los ingredientes con o sin gluten
		ingredientes[0] = new Ingrediente(0, "", true);
		ingredientes[1] = new Ingrediente(0, "", false);

		r = new Receta("", ingredientes);
		assertFalse("caso 3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso 4 null
		r = new Receta("", null);
		assertTrue("caso 4 sin ingredientes", r.isGlutenFree());

	}

}
