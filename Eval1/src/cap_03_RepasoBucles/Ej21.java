package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir 10 números, y mostrar al final si se ha introducido
alguno negativo. */
public class Ej21 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		boolean negativo = false;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Numero: ");
			num = sc.nextInt();
			if (num < 0) negativo = true;
		}
		if (negativo = true) System.out.println("Hay numero(s) negativo(s)");
		else System.out.println("No hay numeros negativos");
		
		sc.close();
	}

}
