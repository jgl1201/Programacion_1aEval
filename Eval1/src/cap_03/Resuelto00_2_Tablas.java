package cap_03;

public class Resuelto00_2_Tablas {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("TABLA DEL " + i);
			System.out.println("----------------");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}

}
