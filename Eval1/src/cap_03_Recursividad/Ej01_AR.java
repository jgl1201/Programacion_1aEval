package cap_03_Recursividad;

import java.util.Scanner;

public class Ej01_AR {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, razon, corte, cont = 0, suma = 0;
		System.out.println("PROGRESION ARITMETICA");
		System.out.println("Termino inicial: ");
		inicio = sc.nextInt();
		System.out.println("Razon: ");
		razon = sc.nextInt();
		System.out.println("Valor de corte: ");
		corte = sc.nextInt();
		
		while (inicio <= corte) {
			System.out.print(inicio + ", ");
			suma += inicio;
			inicio += razon;
			cont++;
		}
		System.out.println();
		System.out.println("Numeros listados: " + cont);
		System.out.println("Suma total: " + suma);
		
		sc.close();
	}

}
