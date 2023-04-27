package cap_03;
/* 			*			bucle 1
 * 		   ***			bucle 1
 * 		  *****			bucle 1
 * 		 *******		bucle 1
 * 		  *****			bucle 2
 * 		   ***			bucle 2
 * 			* 			bucle 2
 */

import java.util.Scanner;

public class Propuesto03_Rombo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// externo 1
		for (int i = 1; i <= 4; i++) {
			// interno espacios
			for (int k = 1; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			// interno estrellitas
			for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // externo 1
		
		// externo 2
		for (int i = 1; i <= 3; i++) {
			// interno espacios
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			// interno estrellitas
			for (int j = 1; j <= 2 * (3 - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} // externo 2
		
		sc.close();
	}


}
