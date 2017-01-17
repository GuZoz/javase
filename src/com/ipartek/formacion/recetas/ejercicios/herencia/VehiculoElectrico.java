package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {

	public final float MIN_CAPACIDAD_BATERIA = 100;

	private float capacidadBaterias;

	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo); // llamamos al constructor con imput de modelo del padre
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [MIN_CAPACIDAD_BATERIA=" + MIN_CAPACIDAD_BATERIA + ", capacidadBaterias="
				+ capacidadBaterias + "]" + super.toString();
	}

}
