package cap_03_Recursividad;

public class Ejem02_GEO {

	public static void main(String[] args) {
		int cont = 0, suma = 0;
		for (int i = 1; i <= 100; i *= 2) {
			System.out.print(i + ", ");
			cont++;
			suma += i;
		}
		System.out.println();
		System.out.println("Numeros listados: " + cont);
		System.out.println("Suma total: " + suma);
	}
	
}
