package cap_03_RepasoBucles;

import java.util.Scanner;

/* Leer números hasta que se introduzca un 0. Para cada uno
indicar si es par o impar.*/
public class Ej03 {
	
	public static void main(String[] args) {
		
		int numero = 1;
		Scanner sc = new Scanner(System.in);
		
		while (numero != 0) {
			System.out.println("Mete numero:");
			numero = sc.nextInt();
			if (numero % 2 == 0) 
				System.out.println(numero + ": PAR");
			else
				System.out.println(numero + ": IMPAR");
		}
		sc.close();
		
	}

}
