package cap_03;

import java.util.Scanner;

/* Se desea conocer el lucky number (número de la suerte) de cualquier persona.
 * El número de la suerte se consigue reduciendo la fecha de nacimiento a un número de un solo dígito. Por ejemplo,
la fecha de nacimiento de Emma es la siguiente: 16-08-1973 —► 16+8+1973 = 1997 —► 1+9+9+7=26 —► 2+6 =8. El
número de la suerte de Emma será el 8.
 */

public class Propuesto05_LuckyNumber {
	
	public static int calculaLuckyNumber(int numero) {

		int total = 0;
		int aux = numero;
		
		while (aux != 0) {
			total += aux % 10;
			aux = aux / 10;
		//	System.out.println(total);
		}

		return total;
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, suma, ln;
		int resuma = 0;
		
		System.out.println("Dia: ");
		dia = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Año: ");
		ano = sc.nextInt();
		
		suma = dia + mes + ano;
		ln = calculaLuckyNumber(suma);
		
		if(ln >= 10) {
			resuma = calculaLuckyNumber(ln);
			System.out.println("Tu Lucky Number es: " + resuma);
		} else {
			System.out.println("Tu Lucky Number es: " + ln);
		}
		
		sc.close();
	}

}
