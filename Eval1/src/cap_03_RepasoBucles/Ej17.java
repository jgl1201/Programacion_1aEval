package cap_03_RepasoBucles;

import java.util.Scanner;
/* Una empresa que se dedica a la venta de desinfectantes
necesita un programa para gestionar las facturas. En cada
factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro. 
Se pide de 5 facturas introducidas: Facturación total, cantidad
en litros vendidos del artículo 1 y cuantas facturas se
emitieron de más de 600 €. */
public class Ej17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double fact, litros, factTotal = 0, litrosTotal = 0, cont = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Factura " + i);
			System.out.println("Facturado: " );
			fact = sc.nextDouble();
			factTotal += fact;
			System.out.println("Litros: ");
			litros = sc.nextDouble();
			litrosTotal += litros;
			if (fact > 600) cont++;
		}
		System.out.println("Facturacion total: " + factTotal);
		System.out.println("Litros totales: " + litrosTotal);
		System.out.println("Facturas > 600: " + cont);
		
		sc.close();
	}
	
}
