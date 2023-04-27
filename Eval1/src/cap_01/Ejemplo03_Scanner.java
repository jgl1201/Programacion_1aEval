package cap_01;

import java.util.Scanner;

public class Ejemplo03_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		
		System.out.println("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " a�os");
		
		sc.close();
	}

}