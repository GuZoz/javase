package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	public final int OCTANAJE_DEFECTO = 95;

	private int tipoCombustible;

	public VehiculoDiesel() {
		super();
		this.tipoCombustible = OCTANAJE_DEFECTO;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo); // llamamos al constructor con imput de modelo del padre
		this.tipoCombustible = OCTANAJE_DEFECTO;
	}

	public int getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(int tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [OCTANAJE_DEFECTO=" + OCTANAJE_DEFECTO + ", tipoCombustible=" + tipoCombustible + "]";
	}

}
