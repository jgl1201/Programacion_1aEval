package cap_03_RepasoBucles;

import java.util.Scanner;

/* Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos. */
public class Ej19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nota;
		int ap = 0, cond = 0, sus = 0;
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Nota: ");
			nota = sc.nextDouble();
			if (nota >= 5) ap++;
			else if (nota < 4) sus++;
			else cond++;
		}
		System.out.println("Aprobados: " + ap);
		System.out.println("Condicionados: " + cond);
		System.out.println("Suspensos: " + sus);
		
		sc.close();
	}

}
