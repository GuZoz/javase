package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {
	ArrayList<String> paises;

	@Test
	public void test() {

		assertNull("Deberia ser null", paises);

		paises = new ArrayList<String>();

		assertNotNull("No deberia ser null", paises);

		assertEquals("0 paises", 0, paises.size());

		paises.add("EH");

		assertEquals("1 paises", 1, paises.size());

		paises.add("Udbekistan");
		paises.add("Portugal");
		paises.add("Barakaldo");
		paises.add("Alemania");

		assertEquals("5 paises", 5, paises.size());

		assertEquals("Barakaldo", paises.remove(3));

		assertEquals("4 paises", 4, paises.size());

		paises.add(1, "Portugalete");
		assertEquals("5 paises", 5, paises.size());
		assertEquals("EH", paises.get(0));
		assertEquals("Portugalete", paises.get(1));
		assertEquals("Udbekistan", paises.get(2));
	}

}
