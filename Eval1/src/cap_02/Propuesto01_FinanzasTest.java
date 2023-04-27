package cap_02;

import java.util.Scanner;

public class Propuesto01_FinanzasTest {

	public static void main(String[] args) {

		double dinero;
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Pulsa 1 para cambio por defecto \n" + 
		"Pulsa 2 para cambio personalizado");
		opcion = sc.nextInt();

		if (opcion == 1) {
			// CONSTRUCTOR POR DEFECTO
			Propuesto01_Finanzas enero = new Propuesto01_Finanzas();
			System.out.println(enero.toString());

			System.out.println("Mete los dólares que quieres convertir a euros: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " $ son " + enero.dolarAEuro(dinero) + " €");

			System.out.println("Mete los euros que quieres convertir a dólares: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " € son " + enero.euroADolar(dinero) + " $");
		} else if (opcion == 2) {
			// CONSTRUCTOR PASÁNDOLE EL CAMBIO QUE QUERAMOS
			System.out.println("Introduce el cambio:");
			double cambio = sc.nextDouble();
			Propuesto01_Finanzas octubre = new Propuesto01_Finanzas(cambio);
			System.out.println(octubre.toString());

			System.out.println("Mete los dólares que quieres convertir a euros: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " $ son " + octubre.dolarAEuro(dinero) + " €");

			System.out.println("Mete los euros que quieres convertir a dólares: ");
			dinero = sc.nextDouble();
			System.out.println(dinero + " € son " + octubre.euroADolar(dinero) + " $");
		} else {
			System.out.println("El valor introducido no es correcto");
		}

		sc.close();

	}

}
