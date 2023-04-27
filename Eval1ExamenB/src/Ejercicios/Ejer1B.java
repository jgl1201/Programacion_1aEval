package Ejercicios;

import java.util.Scanner;

public class Ejer1B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double importe = 800;
		double importeFinal = 0;

		System.out.println("Pulsa 1 si eres mayor de 65 \n"
						+ "Pulsa 2 si eres menor de 21 y tus padres no son socios \n"
						+ "Pulsa 3 si eres menor de 21 y tus padres son socios \n"
						+ "Pulsa 4 si no estás en ninguno de estos casos");
		System.out.println("Opcion: ");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Descuento del 40%");
			importeFinal = importe * 0.60;
			System.out.println("Tu importe final son " + importeFinal + "€");
			break;
		case 2:
			System.out.println("Descuento del 25%");
			importeFinal = importe * 0.75;
			System.out.println("Tu importe final son " + importeFinal + "€");
			break;
		case 3:
			System.out.println("Descuento del 45%");
			importeFinal = importe * 0.55;
			System.out.println("Tu importe final son " + importeFinal + "€");
			break;
		case 4:
			System.out.println("No hay descuento aplicable");
			importeFinal = importe;
			System.out.println("Tu importe final son " + importeFinal + "€");
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}

		sc.close();
	}

}
