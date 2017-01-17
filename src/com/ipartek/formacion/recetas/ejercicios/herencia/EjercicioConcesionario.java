package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */

public class EjercicioConcesionario {

	public static void main(String[] args) {
		// crear vehiculos
		Vehiculo Ibiza = new Vehiculo("Seat Ibiza");
		Vehiculo FordFiesta = new Vehiculo("Forfi");
		VehiculoElectrico Prius = new VehiculoElectrico("Toyota Prius");
		VehiculoElectrico Tesla = new VehiculoElectrico("Tesla S");
		VehiculoDiesel Sara = new VehiculoDiesel("Citroen Sara");
		VehiculoDiesel Astra = new VehiculoDiesel("Opel Astra");

		Ibiza.setPlazas(5);
		Ibiza.setDimensiones(0);
		Ibiza.setPotencia(500);

		FordFiesta.setPlazas(4);
		FordFiesta.setDimensiones(0);
		FordFiesta.setPotencia(100);

		Prius.setPlazas(5);
		Prius.setDimensiones(0);
		Prius.setPotencia(300);
		Prius.setCapacidadBaterias(300);

		Tesla.setPlazas(5);
		Tesla.setDimensiones(0);
		Tesla.setPotencia(150);
		Tesla.setCapacidadBaterias(500);

		Sara.setPlazas(5);
		Sara.setDimensiones(0);
		Sara.setPotencia(100);
		Sara.setTipoCombustible(95);

		Astra.setPlazas(5);
		Astra.setDimensiones(0);
		Astra.setPotencia(120);
		Astra.setTipoCombustible(98);

		// mostrar por pantalla
		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();
		stock.add(Ibiza);
		stock.add(FordFiesta);
		stock.add(Prius);
		stock.add(Tesla);
		stock.add(Sara);
		stock.add(Astra);

		for (Vehiculo vehiculo : stock) {
			System.out.println();
			System.out.println("---  " + vehiculo.getModelo() + "  ---");
			System.out.println("Plazas: " + vehiculo.getPlazas());
			System.out.println("Dimensiones: " + vehiculo.getDimensiones());
			System.out.println("Potencia: " + vehiculo.getPotencia());
			if (vehiculo instanceof VehiculoElectrico) {
				System.out.println("Capacidad bateria: " + ((VehiculoElectrico) vehiculo).getCapacidadBaterias());
				// casteo para convertir a vehiculo en vehiculo electrico y
				// poder acceder a sus metoods
			}
			if (vehiculo instanceof VehiculoDiesel) {
				System.out.println("Tipo de combustible diesel: " + ((VehiculoDiesel) vehiculo).getTipoCombustible());
			}
			System.out.println("-------------------------");
		}

	}

}
