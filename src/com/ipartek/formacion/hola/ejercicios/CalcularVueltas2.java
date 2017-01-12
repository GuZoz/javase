package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas2 {

	public static void main(String[] args) {

		float compra = (float) 1326.24;
		float pago = (float) (4 * 500);

		final float[] aBIL_MON = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
		final int[] aContadorBilMon = new int[aBIL_MON.length];
		double resto = pago - compra;

		for (int i = 0; i < aBIL_MON.length; i++) {
			aContadorBilMon[i] = (int) (resto / aBIL_MON[i]);
			resto = resto % aBIL_MON[i];
			System.out.println("Total contador: " + aContadorBilMon[i] + " en moneda/billete de " + aBIL_MON[i]);
		}

		// String[] literales = {"Billete(s) de 50 Euros",
		// "Billete 20",
		// }

		// System.out.println("--------------------");
		// System.out.println("-------TICKET-------");
		// System.out.println("--------------------");
		// System.out.println("PAGO: " + compra + " €");
		// System.out.println("RETORNO: " + (pago - compra) + " €");
		// System.out.println("--------------------");
		// System.out.println("Las vueltas:");
		// System.out.println("");
		// System.out.println("En " + contadorBil50 + " billetes de 50 Euros");
		// System.out.println("En " + contadorBil20 + " billetes de 20 Euros");
		// System.out.println("En " + contadorBil10 + " billetes de 10 Euros");
		// System.out.println("En " + contadorBil5 + " billetes de 5 Euros");
		// System.out.println("En " + contadorMon2 + " monedas de 2 Euros");
		// System.out.println("En " + contadorMon1 + " monedas de 1 Euro");
		// System.out.println("En " + contadorMon050 + " monedas de 50
		// Céntimos");
		// System.out.println("En " + contadorMon020 + " monedas de 20
		// Céntimos");
		// System.out.println("En " + contadorMon010 + " monedas de 10
		// Céntimos");
		// System.out.println("En " + contadorMon005 + " monedas de 5
		// Céntimos");
		// System.out.println("En " + contadorMon002 + " monedas de 2
		// Céntimos");
		// System.out.println("En " + contadorMon001 + " monedas de 1 Céntimo");
		// System.out.println("");
		// System.out.println("--------------------");
		// System.out.println("-Gracias por su visita -");
		// System.out.println("--------------------");
	}

}
