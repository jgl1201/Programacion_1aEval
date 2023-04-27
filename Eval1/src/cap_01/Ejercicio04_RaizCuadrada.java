package cap_01;

import java.util.Scanner;

public class Ejercicio04_RaizCuadrada {
	
	public static void main(String[] args) {
		
		double a, b, c, x1, x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame a: ");
		a = sc.nextDouble();
		System.out.println("Dame b: ");
		b = sc.nextDouble();
		System.out.println("Dame c: ");
		c = sc.nextDouble();
		
		x1 = ( (-b + Math.sqrt(Math.pow(b, 2)-4*a*c) )/ 2*a );
		x2 = ( (-b - Math.sqrt(Math.pow(b, 2)-4*a*c) )/ 2*a );
		
		if ((Math.pow(b, 2) - 4*a*c) > 0){
			System.out.println("Soluci�n 1: ");
			System.out.println(x1);
			System.out.println("Soluci�n 2: ");
			System.out.println(x2);
		} else {
			if ((Math.pow(b, 2) - 4*a*c) == 0) {
				System.out.println("Soluci�n 1 = Soluci�n 2: ");
				System.out.println(x1);
				System.out.println(x2);
			} else {
				if ((Math.pow(b, 2) - 4*a*c) < 0) {
					System.out.println("No hay soluciones");
				}
			}
		}
		
		sc.close();
	}

}
