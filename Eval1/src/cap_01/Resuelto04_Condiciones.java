package cap_01;

import java.util.Scanner;

public class Resuelto04_Condiciones {
	
	// true si: edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp = false;
		
		System.out.println("Introduce edad: ");
		edad = sc.nextInt();
		System.out.println("Introduce nivel de estudios: ");
		nivel_de_estudios = sc.nextInt();
		System.out.println("Introduce ingresos: ");
		ingresos = sc.nextInt();
		
		jasp = ( (edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000) );
		System.out.println("Eres jasp? " + jasp);
		
		sc.close();
	}

}
