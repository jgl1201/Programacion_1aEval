package cap_03;

public class Ejemplo05_TRY {

	public static void main(String[] args) {

		int a = 10, b = 0, c = 0;
		try {
			c = a / b; // da infinito
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Resultado: " + c);

	}

}
