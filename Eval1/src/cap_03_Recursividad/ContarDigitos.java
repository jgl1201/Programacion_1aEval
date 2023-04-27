package cap_03_Recursividad;

import java.util.Scanner;

public class ContarDigitos {

	public static int contarDigitos(int numero) {
		if (numero < 10)
			return 1;
		else
			return 1 + contarDigitos(numero / 10);
	}

	public static int invertNumber(int numero) {
		int aux = numero;
		int resto = 0;
		if (contarDigitos(numero) <= 1)
			return numero;
		else {
			resto = aux % 10;
			aux = aux / 10;
			return (resto * (int) Math.pow(10, contarDigitos(numero) - 1) + invertNumber(aux));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Numero");
		numero = sc.nextInt();

		System.out.println("Cifras de " + numero + " = " + contarDigitos(numero));
		System.out.println("El numero invertido es: " + invertNumber(numero));

		sc.close();
	}
}
