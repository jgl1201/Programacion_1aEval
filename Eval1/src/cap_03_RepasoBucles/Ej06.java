package cap_03_RepasoBucles;

import java.util.Scanner;

/*Pedir números hasta que se teclee un 0, mostrar la suma de
todos los números introducidos. */
public class Ej06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int suma = 0, numero = 1;
		
		while (numero != 0) {
			System.out.println("Nuevo numero: ");
			numero = sc.nextInt();
			suma += numero;
			System.out.println("Suma: " + suma);
		}
		sc.close();
	}

}
