package cap_01;

import java.util.Scanner;

public class ConvertirDinero {

	public static double dolarAEuro(double dinero) {
		return (dinero * 1.05);
	}

	public static double euroADolar(double dinero) {
		return (dinero * 0.96);
	}

	public static void main(String[] args) {
		double dinero;
		Scanner sc = new Scanner(System.in);

		System.out.println("Mete los d�lares que quieres convertir a euros: ");
		dinero = sc.nextDouble();
		System.out.println(dinero + " $ son " + dolarAEuro(dinero) + " �");

		System.out.println("Mete los euros que quieres convertir a d�lares: ");
		dinero = sc.nextDouble();
		System.out.println(dinero + " � son " + euroADolar(dinero) + " $");

		sc.close();
	}

}
