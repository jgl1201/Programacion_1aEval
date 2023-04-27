package cap_04_Clases;

import java.util.Scanner;

public class Cadenas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, apellido;
		System.out.println("Introduce tu nombre: ");
		name = sc.nextLine();
		System.out.println("Introduce tu apellido: ");
		apellido = sc.nextLine();
		
		System.out.println("Tu nombre es: " + name);
		System.out.println("Tu apellido es: " + apellido);
		
		sc.close();
	}

}
