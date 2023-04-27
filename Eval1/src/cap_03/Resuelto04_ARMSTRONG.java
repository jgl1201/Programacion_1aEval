package cap_03;

import java.util.Scanner;
// un num es ARMSTRONG cuando la suma de cada uno de sus digitos elevado
// al numero de digitos da el mismo número
public class Resuelto04_ARMSTRONG {
	
	public static void main(String[] args) {
		
		int numero; 
		int millar = 0, centena = 0, decena = 0, unidad = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero DE 4 CIFRAS: ");
		numero = sc.nextInt();
		
		millar = numero / 1000;
		centena = (numero % 1000) / 100;
		decena = ((numero % 1000) % 100) / 10;
		unidad = (numero % 1000) % 10;
		
		System.out.println("Millar: " + millar + " Centena: " + centena + " Decena: " + decena + " Unidad: " + unidad);
		
		if ((Math.pow(millar, 4) + Math.pow(centena, 4) + Math.pow(decena, 4) + Math.pow(unidad, 4)) == numero) {
			System.out.println(numero + " es ARMSTRONG");
		} else {
			System.out.println(numero + " NO es armstrong");
		}
		
		sc.close();
	}

}
