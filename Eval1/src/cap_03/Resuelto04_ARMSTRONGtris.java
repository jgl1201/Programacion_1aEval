package cap_03;

import java.util.Scanner;

public class Resuelto04_ARMSTRONGtris {

	public static int contarCifras(int numero) {

		int cifras = 1;
		while (numero >= 10) {
			numero = numero / 10;
			cifras++;
		}
		
		return cifras;
	}

	public static int calculaPotencias(int numero) {

		int total = 0;
		int cifras = contarCifras(numero);
		int aux = numero;
		
		while (aux != 0) {
			total += (int) Math.pow(aux%10,  cifras);
			aux = aux / 10;
			System.out.println(total);
		}

		return total;
	}
	
	public static boolean esArmstrong(int numero) {
		if (numero == calculaPotencias(numero))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Escribe un numero: ");
		numero = sc.nextInt();

		System.out.println(numero + " tiene " + contarCifras(numero) + " cifras");
		
		System.out.println("Suma de potencias: " + calculaPotencias(numero));
		System.out.println(esArmstrong(numero));

		sc.close();
	}

}
