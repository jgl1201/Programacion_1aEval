package cap_03;

import java.util.Scanner;

public class Ejemplo02_IF {

	public static void main(String[] args) {
		int mates, lengua;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nota mates: ");
		mates = sc.nextInt();
		System.out.println("Nota lengua: ");
		lengua = sc.nextInt();

		if (mates >= 5) {
			if (lengua >= 5) {
				System.out.println("APROBASTE MATES Y LENGUA");
			} else {
				System.out.println("Aprobaste mates, suspendiste lengua");
			}
		} else if (lengua >= 5){
			System.out.println("Suspendiste mates y aprobaste lengua");
		} else {
			System.out.println("Suspendiste todo, zoquete");
		}
		
		sc.close();
	}

}
