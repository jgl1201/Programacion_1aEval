package cap_01;

import java.util.Scanner;

// dado el radio de una circunferencia, calcular superficie y volumen
// volumen = 4piR(cubo)  // superficie = 4piR(cuadrado)

public class Ejercicio01_Circunferencia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radio = 0;
		
		System.out.println("Introduce un radio:");
		radio = sc.nextDouble();
		
		System.out.println("La superficie es: " + 4 * Math.PI * Math.pow(radio, 2));
		System.out.println("El volumen es: " + (4 * Math.PI * Math.pow(radio, 3)) / 3);
		
		sc.close();
	}

}
