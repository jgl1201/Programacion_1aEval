package cap_01;

import java.util.Scanner;

// dado el peso y la altura devover el IMS (IMS = peso / altura(cuad))

public class Ejercicio02_IMS {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double altura, peso;
		double ims;
		
		System.out.println("Peso (kg): ");
		peso = sc.nextDouble();
		System.out.println("Altura (m): ");
		altura = sc.nextDouble();
		
		ims = peso / (Math.pow(altura, 2));
		System.out.println("Tu IMS es: " + ims);
		
		if (ims < 18 || ims > 25)
			System.out.println("No es saludable");
		else
			System.out.println("Es saludable");
		
		sc.close();
	}

}
