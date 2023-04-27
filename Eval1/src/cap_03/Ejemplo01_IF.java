package cap_03;

import java.util.Scanner;

public class Ejemplo01_IF {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Mete número:");
		a = sc.nextInt();

		if (a == 4)
			System.out.println("La variable es igual a 4");

		if (a > 5)
			System.out.println("La variable es mayor que 5");
		else
			System.out.println("La variable es menor que 6");

		if (a > 5)
			System.out.println("La variable es mayor que 5");
		else if (a == 5)
			System.out.println("La variable es 5");
		else
			System.out.println("La variable es menor que 5");

		sc.close();
	}

}
