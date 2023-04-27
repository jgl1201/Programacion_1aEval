package cap_02;

import java.util.Scanner;

// millas a metros y millas a kilómetros (1 milla = 1852 metros)

public class Propuesto07_Distancias {
	
	// MÉTODOS STATIC
	public static double millasAMetros(double millas) {
		return millas * 1852;
	}
	
	public static double millasAKilometros (double millas) {
		return millasAMetros(millas) / 1000;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double millas;
		
		System.out.println("Introduce las millas: ");
		millas = sc.nextDouble();
		
		System.out.println("En metros: " + millasAMetros(millas));
		System.out.println("En kilómetros: " + millasAKilometros(millas));
		
		sc.close();		
	}

}
