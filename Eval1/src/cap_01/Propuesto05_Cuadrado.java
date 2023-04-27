package cap_01;

import java.util.Scanner;

/* codigo para calcular el per�metro y el �rea
 * de un cuadrado, pidiendo primero su lado */

public class Propuesto05_Cuadrado {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		
		System.out.println("Mete el lado: ");
		lado = sc.nextInt();
		;
		System.out.println("Per�metro: " + 4 * lado);
		System.out.println("�rea: " + lado * lado);
		
		sc.close();
		
	}

}
