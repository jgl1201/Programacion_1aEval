package cap_03;

import java.util.Scanner;

// pedir un número entre 1-12 y devolver numDias del mes
public class Ejemplo03_IF {
	
	public static void main(String[] args) {
		int mes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intropduce un número correspondiente al mes que quieres: ");
		mes = sc.nextInt();
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes " + mes + " tiene 31 días");
		} else if (mes == 2) {
			System.out.println("Febrero tiene 28 / 29 días");
		} else {
			System.out.println("El mes " + mes + " tiene 30 días");
		}
		
		sc.close();
	}

}
