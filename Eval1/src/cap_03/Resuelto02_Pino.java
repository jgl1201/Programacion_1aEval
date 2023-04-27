package cap_03;

import java.util.Scanner;

public class Resuelto02_Pino {
	
	public static void main(String[] args) {
		
		int i, j, k;
		int filas = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas filas quieres: ");
		filas = sc.nextInt();
		
		for (i = 1; i <= filas; i++) {
			for (k = 1; k <= filas - i; k++) { // espacios en blanco
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) { // estrellitas
				System.out.print("*");
			}
			System.out.println("");
		} // for externo
		
		sc.close();
	}

}
