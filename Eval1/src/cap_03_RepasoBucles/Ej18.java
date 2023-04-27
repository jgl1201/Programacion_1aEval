package cap_03_RepasoBucles;

import java.util.Scanner;

/* Igual que el anterior pero suponiendo que no se introduce el
precio por litro. Solo existen tres productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro. */
public class Ej18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo;
		double litros, factTotal = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Factura " + i);
			System.out.println("Introduce codigo del articulo:");
			codigo = sc.nextInt();
			switch (codigo) {
			case 1:
				System.out.println("Introduce litros: ");
				litros = sc.nextDouble();
				factTotal += litros * 0.6;
				break;
			case 2:
				System.out.println("Introduce litros: ");
				litros = sc.nextDouble();
				factTotal += litros * 3;
				break;
			case 3:
				System.out.println("Introduce litros: ");
				litros = sc.nextDouble();
				factTotal += litros * 1.25;
				break;
			default:
				System.out.println("El codigo no existe");
			}
		}
		System.out.println("Total facturado: " + factTotal);

		sc.close();
	}

}
