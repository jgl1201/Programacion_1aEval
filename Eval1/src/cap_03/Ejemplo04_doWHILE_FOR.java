package cap_03;

public class Ejemplo04_doWHILE_FOR {

	public static void main(String[] args) {

		int numero = 1;

		while (numero <= 10) {
			System.out.println(numero);
			numero++;
		}

		System.out.println("--------------------------");

		numero = 1;
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= 10);
		
		System.out.println("--------------------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");

		for (int i = 10; i >= 0; i--) {
			System.out.println(i
					);
		}

		System.out.println("Fin de programa");
	}

}
