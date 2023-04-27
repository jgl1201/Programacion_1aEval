package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir números hasta que se introduzca uno negativo, y
calcular la media. */
public class Ej07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double suma = 0, contador = 0, numero = 1;
		
		while (numero > 0) {
			System.out.println("Nuevo numero: ");
			numero = sc.nextInt();
			contador++;
			suma += numero;
		}
		System.out.println("Media= " + suma / contador);
		
		sc.close();
	}

}
