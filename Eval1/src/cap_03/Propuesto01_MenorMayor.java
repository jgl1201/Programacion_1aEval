package cap_03;

// mostrar por patalla el menor y el mayor
import java.util.Scanner;

public class Propuesto01_MenorMayor {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor A: ");
		a = sc.nextInt();
		System.out.println("Valor B: ");
		b = sc.nextInt();
		System.out.println("Valor C: ");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) { // a > b && a > c
				if (b > c) { // c < b < a
					System.out.println("Menor: C");
					System.out.println("Mayor: A");
				} else { // a > b < c && a > c
					System.out.println("Menor: B");
					System.out.println("Mayor: A");
				}
			} else { // a > b && a < c
				if (b > c) { // a > b > c && a < c
					// nunca va a pasar
					System.out.println("INCONGRUENTE");
				} else { // a > b < c
					System.out.println("Menor: B");
					System.out.println("Mayor: C");
				}
			}

		} else { // a < b
			if (a > c) { // a < b && a > c
				if (b > c) { // a > c < b && a < b
					System.out.println("Menor: C");
					System.out.println("Mayor: B");
				} else { // a > c > b && a < b
					// nunca va a pasar
					System.out.println("INCONGRUENTE");
				}
			} else { // a < b && a < c ==> A Menor
				if (b > c) { // a menor && b > c
					System.out.println("Menor: A");
					System.out.println("Mayor: B");
				} else { // a menor && c > b
					System.out.println("Menor: A");
					System.out.println("Mayor: C");
				}
			}
		}

		sc.close();
	}

}