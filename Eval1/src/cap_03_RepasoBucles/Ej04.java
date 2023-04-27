package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir números hasta que se teclee uno negativo, y mostrar
cuántos números se han introducido.*/
public class Ej04 {
	
	public static void main(String[] args) {
		
		int numero = 0, contador = 0;
		Scanner sc = new Scanner(System.in);
		
		while (numero >= 0) {
			System.out.println("Mete numero:");
			numero = sc.nextInt();
			contador++;
		}
		System.out.println("Numeros positivos: " + contador);
		sc.close();
	}

}
