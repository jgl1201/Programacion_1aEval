package cap_03_RepasoBucles;
// Diseñar un programa que muestre el producto de los 10 primeros números impares.
public class Ej11 {

	public static void main(String[] args) {
		int mult = 1;
		for (int i = 1; i <= 10; i++) {
			mult *= (i * 2) -1;
			System.out.println(mult);
		}
	}
	
}
