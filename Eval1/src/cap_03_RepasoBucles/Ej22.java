package cap_03_RepasoBucles;

import java.util.Scanner;

/* Pedir 5 calificaciones de alumnos y decir al final si hay
algún suspenso. */
public class Ej22 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nota;
		boolean suspenso = false;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Nota: ");
			nota = sc.nextInt();
			if (nota < 5)
				suspenso = true;
		}
		if (suspenso = true)
			System.out.println("Hay suspenso(s)");
		else
			System.out.println("No hay suspensos");

		sc.close();
	}

}
