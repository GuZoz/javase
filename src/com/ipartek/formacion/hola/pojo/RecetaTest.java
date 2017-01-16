
package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaTest {

	// variables globales, se inicializan en "setUp"
	public Receta tortillaPatatas;
	public Ingrediente huevos = new Ingrediente(12, "huevos", true);
	public Ingrediente cebolla = new Ingrediente(1, "cebolla", true);
	public Ingrediente patatas = new Ingrediente(4, "patatas", true);
	public Receta rSinIngredientes;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tortillaPatatas = new Receta("tortilla de patatas", null);
		tortillaPatatas.addIngrediente(huevos);
		tortillaPatatas.addIngrediente(cebolla);
		tortillaPatatas.addIngrediente(patatas);

		rSinIngredientes = new Receta("receta sin ingredientes", null);
	}

	@After
	public void tearDown() throws Exception {
		tortillaPatatas = null;
	}

	@Test
	public void testIsGlutenFree() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente(4, "Patatas", true));
		ingredientes.add(new Ingrediente(500, "Bonito", true));

		// caso 1 todos los ingredientes con gluten
		Receta r = new Receta("", ingredientes);
		assertFalse("caso 1 todos los ingredientes con gluten", r.isGlutenFree());

		// caso 2 todos los ingredientes sin gluten
		ingredientes.set(0, new Ingrediente(0, "", false));
		ingredientes.set(1, new Ingrediente(0, "", false));

		r = new Receta("", ingredientes);
		assertTrue("caso 2 todos los ingredientes SIN gluten", r.isGlutenFree());

		// caso 3 todos los ingredientes con o sin gluten
		ingredientes.set(0, new Ingrediente(0, "", true));
		ingredientes.set(1, new Ingrediente(0, "", false));

		r = new Receta("", ingredientes);
		assertFalse("caso 3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso 4 null
		r = new Receta("", null);
		assertTrue("caso 4 sin ingredientes", r.isGlutenFree());

	}

	@Test
	public void testConstructor() {
		Receta r = new Receta("Tortilla de patatas", null);
		assertNotNull("El arraylist debería estar inicializado a new", r.getIngredientes());
	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta("Tortilla de patatas", null);
		int numero = r.getIngredientes().size();
		assertEquals("no deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getIngredientes().size();
		assertEquals("no deben existir ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0, "", true));
		numero = r.getIngredientes().size();
		assertEquals("debe existir 1 ingrediente", 1, numero);
	}

	@Test
	public void testRemoveIngrediente() {

		Receta r = new Receta("Tortilla de patatas", null);
		assertFalse(r.removeIngrediente(null));

		tortillaPatatas.addIngrediente(huevos);

		huevos.setNombre("HueVos");
		tortillaPatatas.removeIngrediente(huevos);

		ArrayList<Ingrediente> ingredientes = tortillaPatatas.getIngredientes();
		assertEquals(3, tortillaPatatas.getIngredientes().size());

		// comprobar que sean huevo, cebolla y patatas
		assertFalse(tortillaPatatas.contiene(null));
		assertFalse(tortillaPatatas.contiene(new Ingrediente(2, "Salmonella", true)));
		assertTrue(tortillaPatatas.contiene(huevos));
		assertTrue(tortillaPatatas.contiene(cebolla));
		assertTrue(tortillaPatatas.contiene(patatas));
	}

}
