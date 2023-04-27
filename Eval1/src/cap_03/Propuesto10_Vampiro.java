package cap_03;

import java.util.Scanner;

/* Un numero es vampiro cuando se obtiene multiplicando
 * la mitad de sus digitos por la otra mitad, sin importar el orden
 * 2187 = 27 * 81
 * tiene que ser un numero par de digitos
 */

public class Propuesto10_Vampiro {

	static int numero;
	// 4 CIFRAS
	public static boolean esVampiro(int n1, int n2, int n3, int n4) {
		int aux1 = (int) (n1 * Math.pow(10, 1) + n2 * Math.pow(10, 0));
		int aux2 = (int) (n3 * Math.pow(10, 1) + n4 * Math.pow(10, 0));
		return (aux1 * aux2 == numero); // boolean true
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		boolean verdad = false;
		
		System.out.println("Introduce millares: ");
		a = sc.nextInt();
		System.out.println("Introduce centenas: ");
		b = sc.nextInt();
		System.out.println("Introduce decenas: ");
		c = sc.nextInt();
		System.out.println("Introduce unidades: ");
		d = sc.nextInt();
		
		numero = (int) (a * Math.pow(10, 3) + b * Math.pow(10, 2) + c * Math.pow(10, 1) + d * Math.pow(10, 0));

		// a primero
		if (esVampiro(a, b, c, d))
			verdad = true;
		if (esVampiro(a, b, d, c))
			verdad = true;
		if (esVampiro(a, c, b, d))
			verdad = true;
		if (esVampiro(a, c, d, b))
			verdad = true;
		if (esVampiro(a, d, c, b))
			verdad = true;
		if (esVampiro(a, d, b, c))
			verdad = true;
		// b primero
		if (esVampiro(b, a, c, d))
			verdad = true;
		if (esVampiro(b, a, d, c))
			verdad = true;
		if (esVampiro(b, c, a, d))
			verdad = true;
		if (esVampiro(b, c, d, a))
			verdad = true;
		if (esVampiro(b, d, a, c))
			verdad = true;
		if (esVampiro(b, d, c, a))
			verdad = true;
		// c primero
		if (esVampiro(c, a, b, d))
			verdad = true;
		if (esVampiro(c, a, d, b))
			verdad = true;
		if (esVampiro(c, b, a, d))
			verdad = true;
		if (esVampiro(c, b, d, a))
			verdad = true;
		if (esVampiro(c, d, a, b))
			verdad = true;
		if (esVampiro(c, d, b, a))
			verdad = true;
		// d primero
		if (esVampiro(d, a, b, c))
			verdad = true;
		if (esVampiro(d, a, c, b))
			verdad = true;
		if (esVampiro(d, b, a, c))
			verdad = true;
		if (esVampiro(d, b, c, a))
			verdad = true;
		if (esVampiro(d, c, a, b))
			verdad = true;
		if (esVampiro(d, c, b, a))
			verdad = true;
		
		if(verdad)
			System.out.println(numero + " es Vampiro");
		else
			System.out.println(numero + " no es Vampiro");
		
		sc.close();
	}

}
