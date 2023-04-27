package cap_01;

import java.util.Scanner;

public class EjercicioMetodos {
	
	// m�todo que haga la conversi�n de metros a km
	public static double metrosAKilometros(double metros) {
		return metros / 1000;
	}
	
	public static void main(String[] args) {
		
		double metros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca n�mero de metros: ");
		metros = sc.nextDouble();
		
		System.out.println("En km son : " + metrosAKilometros(metros));
		
		sc.close();
		
	}

}