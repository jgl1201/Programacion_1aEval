package cap_03;

import java.util.Scanner;

public class Resuelto00_1_TablaMult {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que tabla quieres");
		num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
		sc.close();
	}

}
