package com.ipartek.formacion.hola.ejercicios;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaKArguinano {

	public static void main(String[] args) {

		Receta recetaMarmitako = new Receta();
		recetaMarmitako.setTitulo("Marmitako de bonito");
		recetaMarmitako.setTiempo(50);
		recetaMarmitako.setDificultad("Media");
		recetaMarmitako.setComensales(4);
		recetaMarmitako.setDescripcion("El marmitako de bonito es un plato de marmitako que consiste de bonito");

		Ingrediente[] ingredientesLista = { new Ingrediente(4, "Patatas", false), new Ingrediente(500, "Bonito", false),
				new Ingrediente(2, "Cebolletas", false), new Ingrediente(2, "Pimientos Verdes", false),
				new Ingrediente(0.5f, "Pimientos Rojos", false), new Ingrediente(1, "Cabeza de ajo", false),
				new Ingrediente(4, "Pimientos choriceros", false), new Ingrediente(40, "Pan de sopa", true),
				new Ingrediente(150, "Salsa de tomate", false), new Ingrediente(1000, "Agua", false),
				new Ingrediente(100, "Brandy", false), new Ingrediente(100, "Aceite de oliva", false),
				new Ingrediente(10, "Sal", false), new Ingrediente(10, "Pimienta", false),
				new Ingrediente(1000, "Guindillas Cayena", false), new Ingrediente(10, "Perejil", false), };

		recetaMarmitako.setIngredientes(ingredientesLista);

		System.out.println("Título de la receta: " + recetaMarmitako.getTitulo());
		System.out.println("Tiempo de la receta: " + recetaMarmitako.getTiempo() + " minutos");
		System.out.println("Dificultad de la receta: " + recetaMarmitako.getDificultad());
		System.out.println("Número de comensales: " + recetaMarmitako.getComensales());
		System.out.println("Descripción de la receta: " + recetaMarmitako.getDescripcion());
		System.out.println("Ingredientes de la receta: ");
		for (int i = 0; i < ingredientesLista.length; i++) {
			System.out.println(ingredientesLista[i]);
		}

		// recetaMarmitako.isGlutenFree();
		if (recetaMarmitako.isGlutenFree()) {
			System.out.println("Esta receta es apta para celiacos");
		} else {
			System.out.println("Esta receta NO es apta para celiacos");
		}
	}

}
