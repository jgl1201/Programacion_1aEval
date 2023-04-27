package cap_02;

import java.util.Scanner;

public class Propuesto06_PesoTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String medida;
		double valor;
		
		System.out.println("Valor en kg:");
		valor = sc.nextDouble();
		
		Propuesto06_Peso uno = new Propuesto06_Peso(valor, "EN KILOS");
		
		System.out.println("A que unidad quieres convertir: ");
		medida = sc.next();
		
		System.out.println("La conversión de " + uno.valor + " kg a " + medida + " es: " + uno.getValor(medida));
		
		sc.close();
	}

}
