package cap_01;

import java.util.Scanner;

// dadas unas horas, devolvelo en semanas, d�as y horas

public class Ejercicio03_Horas {

	public static void main(String[] args) {

		int horas = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un n�mero de horas: ");
		horas = sc.nextInt();
		
		System.out.println("Son: " + (horas/168) + " semanas, " + ((horas%168)/24) + " d�as y " + (horas%24) + " horas");

		sc.close();

	}

}
