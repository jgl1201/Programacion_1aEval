package cap_01;

import java.util.Scanner;

/* c�digo para calcular per�metro y �rea
 * de un rect�ngulo pidiendo los lados */

public class Propuesto06_Rectangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double base, altura;
		
		System.out.println("Mete base: ");
		base = sc.nextDouble();
		System.out.println("Mete altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Per�metro: " + base*2 + altura*2);
		System.out.println("�rea: " + base * altura);
		
		sc.close();
		
	}

}
