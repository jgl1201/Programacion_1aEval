package cap_03;

import java.util.Scanner;

public class Resuelto05_Mayusculas {
	
	private char letra;
	
	Resuelto05_Mayusculas(char l) {
		letra = l;
		if (l >= 'a') {		// si la posicion ascii es mayor o igual que la de a
			letra -= 'a';	// resta posicion ascii de a
			letra += 'A';	// suma posicion ascii de A
		}					// devuelve posicion ascii de la letra mayuscula
	}
	
	public char getLetra() {
		return letra;
	}

	@Override
	public String toString() {
		return "Resuelto05_Mayusculas [letra=" + letra + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char letra;
		
		System.out.println("Dame una letra: ");
		letra = sc.nextLine().charAt(0); // no existe nextChar, así que se recoge el primer caracter de un String
		
		Resuelto05_Mayusculas una = new Resuelto05_Mayusculas(letra);
		System.out.println(una.toString());
		
		sc.close();
	}

}
