package cap_03;

import java.util.Scanner;

public class MaxComDiv {
	
	public static int maxComunDivisor (int dividendo, int divisor) {
		int resto = 0, mcd = 0;
		do {
			resto = dividendo % divisor;
			mcd = divisor;
			dividendo = divisor;
			divisor = resto;
		} while (resto != 0);
		return mcd;
	}
	
	public static int minComunMultiplo (int dividendo, int divisor) {
		return dividendo * divisor / maxComunDivisor(dividendo, divisor);
	}
	
	public static void main(String[] args) {
		
		int dividendo = 0, divisor = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dividendo: ");
		dividendo = sc.nextInt();
		System.out.println("Divisor: ");
		divisor = sc.nextInt();
		
		System.out.println("MCD: " + maxComunDivisor(dividendo, divisor));
		System.out.println("MCM: " + minComunMultiplo(dividendo, divisor));
		
		sc.close();
	}

}
