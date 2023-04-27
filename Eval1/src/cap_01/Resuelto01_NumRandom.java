package cap_01;

// generar 6 n�mneros ewntre 1 y 49

public class Resuelto01_NumRandom {
	
	public static int getNumero() {
		int numero = 0;
		numero = (int)(1 + Math.random()*(50-1));
		return numero;
	}
	
	public static void main(String[] args) {
		System.out.println(getNumero());
		System.out.println(getNumero());
		System.out.println(getNumero());
		System.out.println(getNumero());
		System.out.println(getNumero());
		System.out.println(getNumero());
	}

}
