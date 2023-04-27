package cap_03_RepasoBucles;

import java.util.Scanner;

// Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
public class Ej16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Numero: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero * i);
		}
		sc.close();
	}

}
