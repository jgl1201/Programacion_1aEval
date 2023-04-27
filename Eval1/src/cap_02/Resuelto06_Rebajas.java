package cap_02;

import java.util.Scanner;

public class Resuelto06_Rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100 / original;
	}

	public static double descubreOriginal(double actual, double porcentaje) {
		return actual / (1 - porcentaje / 100);
	}

	public static double descubreActual(double original, double porcentaje) {
		return original - (original * porcentaje / 100);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double original, actual, porcentaje;
		int opcion = 0;
		boolean sigue = true;

		do {
			System.out.println("Pulsa 1 si tienes el precio original y el actual \n"
					+ "Pulsa 2 si tienes el precio actual y el porcentaje \n"
					+ "Pulsa 3 si tienes el precio original y el porcentaje \n"
					+ "Pulsa cualquier otra tecla para salir");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Precio original:");
				original = sc.nextDouble();
				System.out.println("Precio actual:");
				actual = sc.nextDouble();
				porcentaje = descubrePorcentaje(original, actual);
				System.out.println("El porcentaje de rebaja es: " + porcentaje + "%");
				break;
			case 2:
				System.out.println("Precio actual:");
				actual = sc.nextDouble();
				System.out.println("Porcentaje:");
				porcentaje = sc.nextDouble();
				original = descubreOriginal(actual, porcentaje);
				System.out.println("El precio original es: " + original);
				break;
			case 3:
				System.out.println("Precio original: ");
				original = sc.nextDouble();
				System.out.println("Porcentaje: ");
				porcentaje = sc.nextDouble();
				actual = descubreActual(original, porcentaje);
				System.out.println("El precio actual es: " + actual);
				break;
			default:
				System.out.println("No existe esa opción");
				sigue = false;
			}
		} while (sigue == true);

		sc.close();

	}

}
