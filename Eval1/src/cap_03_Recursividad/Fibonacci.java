package cap_03_Recursividad;

import java.util.Scanner;
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class Fibonacci {

	public static int fibonacci(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicion;

		System.out.println("Cuantos numeros quieres mostrar: ");
		posicion = sc.nextInt();

		while (posicion != 0 && posicion != 1) {
			System.out.print(fibonacci(posicion) + ", ");
			posicion--;
		}
		System.out.print(1);

		sc.close();
	}

}