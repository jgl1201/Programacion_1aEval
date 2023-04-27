package cap_03_RepasoBucles;

import java.util.Scanner;

//Pedir un número y calcular su factorial.
public class Ej12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, factorial = 1;
		System.out.println("Numero: ");
		numero = sc.nextInt();
		
		for (int i = numero; i > 0 ; i--) {
			factorial *= numero;
			numero--;
		}
		System.out.println("Factorial: " + factorial);
		sc.close();
	}
	
}
