package cap_03;

import java.util.Scanner;

public class Resuelto06_Contar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2, suma = 0, cuenta = 0;

		System.out.println("Numero 1: ");
		numero1 = sc.nextInt();
		System.out.println("Numero 2: ");
		numero2 = sc.nextInt();

		for (int i = numero1; i <= numero2; i++) {
			System.out.println(i);
			suma += i;
			cuenta++;
		}

		System.out.println("Suma: " + suma);
		System.out.println("Número de veces: " + cuenta);
		System.out.println("Media: " + (double) suma / cuenta);

		/*
		 * System.out.println("-------------");
		 * 
		 * while (numero1 <= numero2) {
		 * System.out.println(numero1);
		 * numero1++;
		 * }
		 */

		sc.close();
	}

}
