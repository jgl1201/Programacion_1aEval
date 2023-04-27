package cap_03_Recursividad;

import java.util.Scanner;

public class Multiplicacion {

	public static int sumaRecursiva (int numero, int veces) {
		if (veces == 1) return numero;
		else return numero + sumaRecursiva(numero, veces - 1);
	}
	
	public static int sumaIterativa (int numero, int veces) {
		int total = 0;
		for (int i = 1; i <= veces; i++) {
			total += numero;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int numero, veces;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero 1: ");
		numero = sc.nextInt();
		System.out.println("Numero 2: ");
		veces = sc.nextInt();
		
		System.out.println(numero + " por " + veces + " = " + sumaRecursiva(numero, veces));
		System.out.println("-------------------");
		System.out.println(numero + " por " + veces + " = " + sumaIterativa(numero, veces));
		
		sc.close();
	}
	
}
