package cap_03_RepasoBucles;

import java.util.Scanner;

// Pedir 15 números y escribir la suma total.
public class Ej10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, suma = 0;
		
		for (int i = 1; i <= 15; i++) {
			System.out.println("Numero " + i + ": ");
			numero = sc.nextInt();
			suma += numero;
			System.out.println("Suma = " + suma);
		}
		sc.close();
	}

}
