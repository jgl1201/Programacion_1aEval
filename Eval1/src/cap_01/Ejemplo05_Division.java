package cap_01;

import java.util.Scanner;

public class Ejemplo05_Division {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dividendo = 0;
		int divisor = 0;
		int cociente;
		int resto;
		
		System.out.println("porfavor introduzca el dividendo");
		dividendo = sc.nextInt();
		System.out.println("Introduzca el divisor");
		divisor = sc.nextInt();
		
		cociente = dividendo / divisor;
		resto = dividendo % divisor;
		
		System.out.println(dividendo + " entre " + divisor + " es " + cociente + " y el resto es " + resto);
		
		sc.close();
	}

}