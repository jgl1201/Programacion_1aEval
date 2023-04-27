package cap_01;

import java.util.Scanner;

public class ConvertirGrados {

	public static double celsiusAFarenheit(double grad) {

		return (grad - 32) * 5 / 9;
	}

	public static double farenheitACelsius(double grad) {

		return (grad * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double grad;

		System.out.println("Introduce los �Farenheit que quieres convertir: ");
		grad = sc.nextDouble();
		System.out.println(grad + " �Farenheit son " + celsiusAFarenheit(grad) + " �C");

		System.out.println("Introduce los �C que quieres convertir: ");
		grad = sc.nextDouble();
		System.out.println(grad + " �C son " + farenheitACelsius(grad) + " �Farenheit");

		sc.close();
	}

}
