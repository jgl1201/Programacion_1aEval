package cap_01;

public class Ejemplo04_Variables {

	public static void main(String[] args) {
		byte a = 0;
		System.out.println("variable a:" + a);
		short b = 14, c = 3;
		System.out.println("Variables b:" + b);
		System.out.println("Variable c:" + c);
		int d = -30;
		System.out.println("Variable d:" + d);
		int e = 0xC125;
		System.out.println("Variable e:" + e);
		long f = 434123;
		System.out.println("Variable f:" + f);
		long g = 5L;
		System.out.println("Variable g:" + g);
		char car1 = 'c';
		System.out.println("Variable car1:" + car1);
		char car2 = 99;
		System.out.println("Variable car2:" + car2);

		float pi1 = (float) 3.1416;
		float pi2 = 3.1416F;
		float medio = 1 / 2f;
		System.out.println("Variable pi1:" + pi1);
		System.out.println("Variable pi2:" + pi2);
		System.out.println("Variable medio:" + medio);
		double mill = 1e6;
		double med = 1 / 2d;
		System.out.println("Variable mill:" + mill);
		System.out.println("Variable med:" + med);
	}

}
