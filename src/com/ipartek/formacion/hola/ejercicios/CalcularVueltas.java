package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = (float) 1326.24;
		float pago = (float) (4 * 500);

		final float Billete50 = 50f;
		final float Billete20 = 20f;
		final float Billete10 = 10f;
		final float Billete5 = 5f;
		final float Moneda2 = 2f;
		final float Moneda1 = 1f;
		final float Moneda050 = 0.50f;
		final float Moneda020 = 0.20f;
		final float Moneda010 = 0.10f;
		final float Moneda005 = 0.05f;
		final float Moneda002 = 0.02f;
		final float Moneda001 = 0.01f;

		float resto = 88.88f; // pago - compra;
		int contadorBil50 = 0;
		int contadorBil20 = 0;
		int contadorBil10 = 0;
		int contadorBil5 = 0;
		int contadorMon2 = 0;
		int contadorMon1 = 0;
		int contadorMon050 = 0;
		int contadorMon020 = 0;
		int contadorMon010 = 0;
		int contadorMon005 = 0;
		int contadorMon002 = 0;
		int contadorMon001 = 0;

		if (resto >= Billete50) {
			contadorBil50 = (int) (resto / Billete50);
			resto = resto % Billete50;
			System.out.println("resto en bil50" + resto);
		}

		if (resto >= Billete20) {
			contadorBil20 = (int) (resto / Billete20);
			resto = resto % Billete20;
		}

		if (resto >= Billete10) {
			contadorBil10 = (int) (resto / Billete10);
			resto = resto % Billete10;
		}

		if (resto >= Billete5) {
			contadorBil5 = (int) (resto / Billete5);
			resto = resto % Billete5;
		}

		if (resto >= Moneda2) {
			contadorMon2 = (int) (resto / Moneda2);
			resto = resto % Moneda2;
		}

		if (resto >= Moneda1) {
			contadorMon1 = (int) (resto / Moneda1);
			resto = resto % Moneda1;
		}

		if (resto >= Moneda050) {
			contadorMon050 = (int) (resto / Moneda050);
			resto = resto % Moneda050;
		}

		if (resto >= Moneda020) {
			contadorMon020 = (int) (resto / Moneda020);
			resto = resto % Moneda020;
		}

		if (resto >= Moneda010) {
			contadorMon010 = (int) (resto / Moneda010);
			resto = resto % Moneda010;
		}

		if (resto >= Moneda005) {
			contadorMon005 = (int) (resto / Moneda005);
			resto = resto % Moneda005;
		}

		if (resto >= Moneda002) {
			contadorMon002 = (int) (resto / Moneda002);
			resto = resto % Moneda002;
		}

		contadorMon001 = Math.round(resto / Moneda001);

		System.out.println("--------------------");
		System.out.println("-------TICKET-------");
		System.out.println("--------------------");
		System.out.println("PAGO:    " + compra + " €");
		System.out.println("RETORNO: " + (pago - compra) + " €");
		System.out.println("--------------------");
		System.out.println("Las vueltas:");
		System.out.println("");
		System.out.println("En " + contadorBil50 + " billetes de 50 Euros");
		System.out.println("En " + contadorBil20 + " billetes de 20 Euros");
		System.out.println("En " + contadorBil10 + " billetes de 10 Euros");
		System.out.println("En " + contadorBil5 + " billetes de 5 Euros");
		System.out.println("En " + contadorMon2 + " monedas de 2 Euros");
		System.out.println("En " + contadorMon1 + " monedas de 1 Euro");
		System.out.println("En " + contadorMon050 + " monedas de 50 Céntimos");
		System.out.println("En " + contadorMon020 + " monedas de 20 Céntimos");
		System.out.println("En " + contadorMon010 + " monedas de 10 Céntimos");
		System.out.println("En " + contadorMon005 + " monedas de 5 Céntimos");
		System.out.println("En " + contadorMon002 + " monedas de 2 Céntimos");
		System.out.println("En " + contadorMon001 + " monedas de 1 Céntimo");
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("-Gracias por su visita -");
		System.out.println("--------------------");
	}

}
