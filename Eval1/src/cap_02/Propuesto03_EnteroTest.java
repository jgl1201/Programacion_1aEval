package cap_02;

import java.util.Scanner;

public class Propuesto03_EnteroTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// constructor por defecto
		Propuesto03_Entero vacio = new Propuesto03_Entero();
		System.out.println(vacio.toString());
		vacio.suma(7);
		System.out.println(vacio.toString());
		vacio.resta(3);
		System.out.println(vacio.toString());
		System.out.println("Doble: " + vacio.getDoble());
		System.out.println("Triple: " + vacio.getTriple());
		
		// constructor pasándole un valor
		int valor;
		System.out.println("Introduce un valor de inicio: ");
		valor = sc.nextInt();
		Propuesto03_Entero lleno = new Propuesto03_Entero(valor);
		System.out.println(lleno.toString());
		lleno.suma(58);
		System.out.println(lleno.toString());
		lleno.resta(19);
		System.out.println(lleno.toString());
		System.out.println("Doble: " + lleno.getDoble());
		System.out.println("Triple: " + lleno.getTriple());
		
		sc.close();
	}

}
