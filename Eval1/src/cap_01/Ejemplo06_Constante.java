package cap_01;

import java.util.Scanner;

/* Programa que calcula la longitud y �rea de una
 * circunferencia de radio r */

public class Ejemplo06_Constante {
	
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio = 0;
		double longitud,area;
		
		System.out.println("Introduce un radio: ");
		radio = sc.nextDouble();
		
		longitud = 2 * radio * PI;
		System.out.println("La longitud de la circunferencia es: " + longitud);
		
		area = Math.pow(radio, 2)* PI;
		System.out.println("El �rea de la circunferencia es: " + area);
		
		sc.close();
	}

}