package cap_01;

import java.util.Scanner;

public class Ejemplo02_Scanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		
		System.out.println("Dime tu nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		
		sc.close();
	}

}