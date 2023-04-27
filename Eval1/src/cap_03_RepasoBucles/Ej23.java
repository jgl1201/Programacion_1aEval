package cap_03_RepasoBucles;

import java.util.Scanner;

// Pedir 5 números e indicar si alguno es múltiplo de 3.
public class Ej23 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		boolean multiplo = false;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Numero: ");
			num = sc.nextInt();
			if (num % 3 == 0)
				multiplo = true;
		}
		if (multiplo = true)
			System.out.println("Hay multiplo(s) de 3");
		else
			System.out.println("No hay multilos de 3");

		sc.close();
	}
	
}
