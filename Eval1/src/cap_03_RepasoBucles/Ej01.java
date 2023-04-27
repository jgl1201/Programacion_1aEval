package cap_03_RepasoBucles;

import java.util.Scanner;

/* Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo. */
public class Ej01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		while (numero >= 0) {
			System.out.println("Mete numero");
			numero = sc.nextInt();
			System.out.println("Numero: " + numero);
			System.out.println("Cuadrado: " + Math.pow(numero, 2));
		}
		sc.close();
	}
	
}
