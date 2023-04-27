package cap_03;

import java.util.Scanner;

/*dado un numero de 3 cifras averigua si es ARMSTRONG
 * un numero es ARMSTRONG cuando sus numeros elevados al numero de numeros da el propio numero
 * ej:- 153-- 1 al cubo + 5 al cubo + 3 al cubo = 153
 */

/* 1. separar el numero que se introduce en sus digitos
 * 2. elevar cada digito a la potencia que toque
 * 3. sumar los resultados parciales
 */

public class Resuelto04_ARMSTRONGbis {

	static int c = 0, d = 0, u = 0;
	static int n = 0;

	public static void troceaNumero() { // PROBAR CON UN DO WHILE PARA QUE PUEDAN SER NÚMEROS DE MAS DE TRES DIGITOS
		int aux = n;
		while (aux > 0) {
			if (aux > 100) {
				u = aux % 10;
			} else if (aux > 10) {
				d = aux % 10;
			} else {
				c = aux % 10;
			}
			aux = aux / 10;
		}
		System.out.println("unidad: " + u + " decena: " + d + " centena: " + c);
	}

	public static int calculaPotencia() { // MEJORAR EN BASE A TROCEANUMERO
		return (int) (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3));
	}

	public static void muestraSalida() {
		if (calculaPotencia() == n) {
			System.out.println("Es un número Armstrong");
		} else {
			System.out.println("No es un número Armstrong");
		}
	}

	public static void pideNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de SOLO TRES CIFRAS");
		n = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {

		pideNumero();

		troceaNumero();

		calculaPotencia();

		muestraSalida();

	}

}