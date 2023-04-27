package cap_03_RepasoBucles;

import java.util.Scanner;

/* Leer un número e indicar si es positivo o negativo. El
proceso se repetirá hasta que se introduzca un 0. */
public class Ej02 {
	
	public static void main(String[] args) {
		
		int numero = 1;
		Scanner sc = new Scanner(System.in);
		
		while (numero != 0) {
			System.out.println("Mete numero:");
			numero = sc.nextInt();
			if (numero < 0) 
				System.out.println(numero + ": NEGATIVO");
			else
				System.out.println(numero + ": POSITIVO");
		}
		sc.close();
	}

}
