package cap_02;

import java.util.Scanner;

public class Propuesto02_Multiplicar {
	
	public static double porDos(double numero) {
		return numero * 2;
	}
	
	public static double porTres(double numero) {
		return numero * 3;
	}
	
	public static double porCuatro(double numero) {
		return numero * 4;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Mete número:");
		numero = sc.nextDouble();
		
		System.out.println("Doble: " + porDos(numero));
		System.out.println("Triple: " + porTres(numero));
		System.out.println("Cuadruple: " + porCuatro(numero));
		
		sc.close();
	}

}