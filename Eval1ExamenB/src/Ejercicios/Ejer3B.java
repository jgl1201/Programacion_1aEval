package Ejercicios;

import java.util.Scanner;

public class Ejer3B {
	
	public static double kgToStones (double kg) {
		return kg / 6.35;
	}
	
	public static double stonesToKg (double st) {
		return st * 6.35;
	}
	
	public static double kgToPounds (double kg) {
		return kg / 4.53;
	}
	
	public static double poundsToKg (double pd) {
		return pd * 4.53;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso;
		
		System.out.println("Introduce tu peso en kilos: ");
		peso = sc.nextDouble();
		System.out.println(peso + "kg en Stones son " + kgToStones(peso));
		System.out.println(peso + "kg en libras son " + kgToPounds(peso));
		
		System.out.println("Introduce tu peso en Stones: ");
		peso = sc.nextDouble();
		System.out.println(peso + "st en Kg son " + stonesToKg(peso));
		
		System.out.println("Introduce tu peso en libras: ");
		peso = sc.nextDouble();
		System.out.println(peso + "pnd en Kg son " + poundsToKg(peso));
		
		sc.close();
	}

}
