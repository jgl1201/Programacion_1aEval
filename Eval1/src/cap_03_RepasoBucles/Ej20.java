package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir un número N, introducir N sueldos, y mostrar el sueldo
máximo.*/
public class Ej20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero, sueldo, max = 0;
		System.out.println("Numero de sueldos: ");
		numero = sc.nextDouble();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Sueldo: ");
			sueldo = sc.nextDouble();
			if (sueldo > max) max = sueldo;
		}
		System.out.println("Max: " + max);
		
		sc.close();
	}
	
}
