package cap_02;

import java.util.Scanner;
// 3 clientes = 1kg papas + 0.5kg chocos	
public class Propuesto11_Chocos {

	public static int numeroClientes(double papas, double chocos) {
		int numClientes = 0;
		while (papas >= 1 && chocos >= 0.5) {
			numClientes += 3;
			papas--;
			chocos -= 0.5;
		}
		return numClientes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double chocos, papas;

		System.out.println("Cuantos kilos de patatas hay?");
		papas = sc.nextDouble();
		System.out.println("Cuantos kilos de chocos hay?");
		chocos = sc.nextDouble();

		System.out.println("El numero de comensales es: " + numeroClientes(papas, chocos));

		sc.close();
	}

}
