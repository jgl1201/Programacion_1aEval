package cap_03_Recursividad;

import java.util.Scanner;

public class Factorial {

	public static int factorialIterativo(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int factorialRecursivo (int numero) {
		if (numero == 1) return 1; // caso final o caso limite
		else return numero * factorialRecursivo(numero - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un entero: ");
		numero = sc.nextInt();

		System.out.println("Factorial: " + factorialIterativo(numero));
		System.out.println("-----------------------------------");
		System.out.println("Factorial recursivo: " + factorialRecursivo(numero));

		sc.close();
	}

}
