package cap_04_Clases;

import java.util.Arrays;

public class EjemploParametros {
	
	public static void increment (int x) {
		x++;
	}
	
	public static void cambiar (int[] par) {
		par[0]++;
	}
	
	
	
	public static void main(String[] args) {
		int x = 3;
		int[] matriz = {1, 2, 3};
		
		increment(x); // no toca la original
		System.out.println(x);
		
		cambiar(matriz);
		System.out.println(Arrays.toString(matriz));
	
	}

}
