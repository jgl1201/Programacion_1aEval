package cap_03_RepasoBucles;

import java.util.Scanner;

/* Realizar un juego para adivinar un número. Para ello pedir un
número N, y luego ir pidiendo números indicando “mayor” o
“menor” según sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta*/
public class Ej05 {
	
	public static final int NUMERO = (int) (Math.random()*1000);
	
	public static void main(String[] args) {
		
		System.out.println("Tienes 10 oportunidades para adivinar un numero aleatorio entre 0 y 1000");
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Opcion: ");
			opcion = sc.nextInt();
			if (opcion == NUMERO) {
				System.out.println("HAS ACERTADO!!!");
			} else if (opcion < NUMERO) {
				System.out.println("Mas!");
			} else if (opcion > NUMERO) {
				System.out.println("Menos!");
			}
		}
		
		sc.close();
		}
	
}
