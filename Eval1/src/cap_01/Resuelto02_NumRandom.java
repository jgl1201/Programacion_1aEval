package cap_01;

// mostrar n�meros entre 127 y 318, ambos inclu�dos

public class Resuelto02_NumRandom {

	public static int getNumero() {
		int numero = 0;
		numero = (int) (127 + Math.random() * (319 - 127)); // donde quieres acabar (+1) - donde empiezas
		return numero;
	}

	public static void main(String[] args) {
		// bucle de repetici�n de un n�mero conocido de veces
		for (int i = 0; i < 100; i++) {
			System.out.println(getNumero());
		}
	}

}
