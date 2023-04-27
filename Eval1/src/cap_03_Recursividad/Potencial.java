package cap_03_Recursividad;

import java.util.Scanner;

public class Potencial {
	
	public static int potIterativa (int base, int exponente) {
		int potencia = 1;
		for (int i = 1; i <= exponente; i++) {
			potencia *= base;
		}
		return potencia;
	}
	
	public static int potRecursiva (int base, int exponente) {
		if (exponente == 0) return 1;
		else if (exponente == 1) return base;
		else return base * potRecursiva(base, exponente - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, exponente;
		System.out.println("Base: ");
		base = sc.nextInt();
		System.out.println("Exponente: ");
		exponente = sc.nextInt();
		
		System.out.println(base + " elevado a " + exponente + " es " + potIterativa(base, exponente));
		System.out.println("---------------------------");
		System.out.println(base + " elevado a " + exponente + " es " + potRecursiva(base, exponente));
		
		sc.close();
	}
	
}
