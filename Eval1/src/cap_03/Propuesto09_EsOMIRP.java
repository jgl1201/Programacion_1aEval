package cap_03;

import java.util.Scanner;

/* Realiza una clase minumero con un método esOmirp que diga si un número es Omirp
o no. Un número es Omirp si es un número primo y, además, al invertir sus dígitos da otro número primo. Por
ejemplo: 7951 y 1597.
*/

public class Propuesto09_EsOMIRP {

	public static int contarCifras(int numero) {
		int cifras = 1;
		while (numero >= 10) {
			numero = numero / 10;
			cifras++;
		}
		return cifras;
	}

	/*
	 * public static int darVuelta (int numero) { 
	 * String num = String.valueOf(numero); // pasar el numero recibido a cadena StringBuilder
	 * dev = new StringBuilder(num); // constructos como puede ser Scanner String
	 * reves = dev.reverse().toString(); // invertir la cadena return
	 * Integer.parseInt(reves); // pasar la cadena invertida a numero }
	 */

	public static int invertNumber(int numero) {
		int invert = 0;
		int cifras = contarCifras(numero);
		int aux = numero;
		int resto = 0;

		while (aux != 0) {
			resto = aux % 10;
			aux = aux / 10;
			invert += resto * Math.pow(10, cifras - 1);
			cifras--;
		}

		return invert;
	}

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while (contador <= numero && contador != numero) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	public static String esOmirp(int numero) {
		int vuelta = invertNumber(numero);
		if ((esPrimo(numero)) && (esPrimo(vuelta))) {
			return numero + " y " + vuelta + " son omirp";
		} else
			return numero + " y " + vuelta + " no son omirp";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número: ");
		int numero = sc.nextInt();

		System.out.println("Original: " + numero);
		System.out.println("Invertido: " + invertNumber(numero));

		System.out.println(esOmirp(numero));

		sc.close();
	}
}
