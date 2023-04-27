package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir un número N, y mostrar todos los números del 1 al N. */
public class Ej08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Hasta donde quieres llegar: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		sc.close();
	}
	
}
