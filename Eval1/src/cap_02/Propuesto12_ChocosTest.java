package cap_02;

import java.util.Scanner;

public class Propuesto12_ChocosTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double patatas, chocos;
	
		System.out.println("Cuantos kilos de patatas hay?");
		patatas = sc.nextDouble();
		System.out.println("Cuantos kilos de chocos hay?");
		chocos = sc.nextDouble();
		
		Propuesto12_Chocos almacen = new Propuesto12_Chocos(patatas, chocos);
		System.out.println(almacen.toString());
		
		System.out.println("Número de comensales: " + almacen.numeroClientes());
		System.out.println(almacen.toString());
		
		sc.close();
	}

}
