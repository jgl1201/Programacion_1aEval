package cap_03_Recursividad;

import java.util.Scanner;
//termino inicial 3
// razon 5
/*		int cont = 0;
		for (int i = 3; i <= 100; i += 5) {
			System.out.print(i + ", ");
			cont++;
		}
		System.out.println();
		System.out.println("Has listado " + cont);
*/
public class Ejem01_AR {
	
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
		
		for (int i = inicio; i <= corte; i += razon) {
			System.out.print(i + ", ");
			cont++;
			suma += i;
		}
		System.out.println();
		System.out.println("Numeros listados: " + cont);
		System.out.println("Suma total: " + suma);
		
		sc.close();
	}

}
