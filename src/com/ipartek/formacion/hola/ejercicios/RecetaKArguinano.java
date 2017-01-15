package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

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

		ArrayList<Ingrediente> ingredientesLista = new ArrayList<Ingrediente>();
		ingredientesLista.add(new Ingrediente(4, "Patatas", false));
		ingredientesLista.add(new Ingrediente(500, "Bonito", false));
		ingredientesLista.add(new Ingrediente(2, "Pimientos Verdes", false));
		ingredientesLista.add(new Ingrediente(0.5f, "Pimientos Rojos", false));
		ingredientesLista.add(new Ingrediente(1, "Cabeza de ajo", false));
		ingredientesLista.add(new Ingrediente(4, "Pimientos choriceros", false));
		ingredientesLista.add(new Ingrediente(40, "Pan de sopa", true));
		ingredientesLista.add(new Ingrediente(150, "Salsa de tomate", false));
		ingredientesLista.add(new Ingrediente(1000, "Agua", false));
		ingredientesLista.add(new Ingrediente(100, "Brandy", false));
		ingredientesLista.add(new Ingrediente(100, "Aceite de oliva", false));
		ingredientesLista.add(new Ingrediente(10, "Sal", false));
		ingredientesLista.add(new Ingrediente(10, "Pimienta", false));
		ingredientesLista.add(new Ingrediente(1000, "Guindillas Cayena", false));
		ingredientesLista.add(new Ingrediente(10, "Perejil", false));
			
	
		recetaMarmitako.setIngredientes(ingredientesLista);

		System.out.println("Título de la receta: " + recetaMarmitako.getTitulo());
		System.out.println("Tiempo de la receta: " + recetaMarmitako.getTiempo() + " minutos");
		System.out.println("Dificultad de la receta: " + recetaMarmitako.getDificultad());
		System.out.println("Número de comensales: " + recetaMarmitako.getComensales());
		System.out.println("Descripción de la receta: " + recetaMarmitako.getDescripcion());
		System.out.println("Ingredientes de la receta: ");
		for (int i = 0; i < ingredientesLista.size(); i++) {
			System.out.println(ingredientesLista.get(i));
		}

		// recetaMarmitako.isGlutenFree();
		if (recetaMarmitako.isGlutenFree()) {
			System.out.println("Esta receta es apta para celiacos");
		} else {
			System.out.println("Esta receta NO es apta para celiacos");
		}
	}

}
