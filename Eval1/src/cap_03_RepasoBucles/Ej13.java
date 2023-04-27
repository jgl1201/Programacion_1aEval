package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros. */
public class Ej13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numero, sumaP = 0, sumaN = 0, cont0 = 0, contP = 0, contN = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Numero: ");
			numero = sc.nextInt();
			if (numero < 0) {
				sumaN += numero;
				contN++;
			} else if (numero > 0) {
				sumaP += numero;
				contP++;
			} else if (numero == 0) {
				cont0++;
			}
		}
	
		System.out.println("Media positivos: " + sumaP / contP);
		System.out.println("Media positivos: " + sumaN / contN);
		System.out.println("0: " + cont0);
		
		sc.close();
	}

}
