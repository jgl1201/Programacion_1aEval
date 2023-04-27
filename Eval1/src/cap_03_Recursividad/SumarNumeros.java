package cap_03_Recursividad;

import java.util.Scanner;

public class SumarNumeros {
	
	public static int sumarIt(int corte) {
		int i = 1;
		int suma = 0;
		while(i <= corte) {
			suma += i;
			i++;
		}
		return suma;
	}
	
	public static int sumarRec (int numero) {
		if (numero == 1) return 1;
		else return numero + sumarRec(numero - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int corte;
		
		System.out.println("Numero de corte: ");
		corte = sc.nextInt();
		
		System.out.println("Total: " + sumarIt(corte));
		System.out.println("------------------------");
		System.out.println("Total: " + sumarRec(corte));
		
		sc.close();
	}

}
