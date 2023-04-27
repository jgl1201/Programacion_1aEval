package cap_03_RepasoBucles;

import java.util.Scanner;

/* Dadas las edades y alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años, y
la cantidad de alumnos que miden más de 1.75. */
public class Ej15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, peso, sumaAlt = 0, sumaPes = 0, cont = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Peso (Kg): ");
			peso = sc.nextDouble();
			System.out.println("Altura (cm): ");
			altura = sc.nextDouble();
			sumaAlt += altura;
			sumaPes += peso;
			if (altura > 175) cont++;
		}
		System.out.println("Media peso: " + sumaPes / 5);
		System.out.println("Media altura: " + sumaAlt / 5);
		System.out.println("Numero mas alto dee 1.75: " + cont);
		
		sc.close();
	}

}
