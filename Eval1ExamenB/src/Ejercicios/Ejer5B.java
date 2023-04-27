package Ejercicios;

import java.util.Scanner;

public class Ejer5B {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dinero;
		int b10000 = 0, b5000 = 0, b2000 = 0, b1000 = 0, b500 = 0, b200 = 0, b100 = 0;
		System.out.println("Dinero a pagar: ");
		dinero = sc.nextDouble();
		
		while (dinero >= 10000) {
			b10000++;
			dinero -= 10000;
		}
		while (dinero >= 5000) {
			b5000++;
			dinero -= 5000;
		}
		while (dinero >= 2000) {
			b2000++;
			dinero -= 2000;
		}
		while (dinero >= 1000) {
			b1000++;
			dinero -= 1000;
		}
		while (dinero >= 500) {
			b500++;
			dinero -= 500;
		}
		while (dinero >= 200) {
			b200++;
			dinero -= 200;
		}
		while (dinero >= 100) {
			b100++;
			dinero -= 100;
		}
		
		System.out.println(b10000 + " billetes de 10000 \n"
				+ b5000 + " billetes de 5000 \n"
				+ b2000 + " billetes de 2000 \n"
				+ b1000 + " billetes de 1000 \n"
				+ b500 + " billetes de 500 \n"
				+ b200 + " billetes de 200 \n"
				+ b100 + " billetes de 100 \n"
				+ dinero + " en monedas");
		
		sc.close();
	}

}
