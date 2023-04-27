package Ejercicios;

import java.util.Scanner;

public class Ejer2B {
	
	public static int sumaDivisores (int numero) {
		int divisor = 1, suma = 0;
		while (numero > 0 && divisor <= numero) {
			if (numero % divisor == 0) {
				suma += divisor;
				divisor++;
			} else {
				divisor++;
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Numero 1: ");
		num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		num2 = sc.nextInt();
		
		System.out.println("La suma de los divisores de " + num1 + " es " + sumaDivisores(num1));
		System.out.println("La suma de los divisores de " + num2 + " es " + sumaDivisores(num2));
		System.out.println(num1 + " + " + num2 + " + 1 = " + (num1 + num2 + 1));
		
		if (sumaDivisores(num1) == sumaDivisores(num2) && sumaDivisores(num2) == (num1 + num2 + 1)) System.out.println("Son numeros novios");
		else System.out.println("No son numeros novios");
		
		sc.close();
	}
	
}
