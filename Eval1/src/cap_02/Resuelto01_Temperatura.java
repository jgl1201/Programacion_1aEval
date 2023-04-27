package cap_02;

import java.util.Scanner;

public class Resuelto01_Temperatura {

	public static double celsiusToFarenheit(double temp) {
		return (1.8) * temp + 32;
	}

	public static double farenheitToCelsius(double temp) {
		return (temp - 32) / 1.8;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double temperatura;

		do {
			System.out.println("Pulsa 1 para pasar de �C a �F");
			System.out.println("Pulsa 2 para pasar de �F a �C");
			System.out.println("Pulsa 3 para salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce los �C: ");
				temperatura = sc.nextDouble();
				System.out.println(celsiusToFarenheit(temperatura));
				break;
			case 2:
				System.out.println("Introduce los �F: ");
				temperatura = sc.nextDouble();
				System.out.println(farenheitToCelsius(temperatura));
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Esa no es una opci�n");
			}
		} while (opcion == 1 || opcion == 2);

		sc.close();
	}

}
