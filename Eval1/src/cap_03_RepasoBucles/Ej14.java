package cap_03_RepasoBucles;

import java.util.Scanner;

// Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
public class Ej14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sueldo, suma = 0, contador = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sueldo: ");
			sueldo = sc.nextDouble();
			suma += sueldo;
			if (sueldo > 1000) contador++;
		}
		System.out.println("Total de sueldos: " + suma);
		System.out.println("Mayores de 1000: " + contador);
		
		sc.close();
	}
	
}
