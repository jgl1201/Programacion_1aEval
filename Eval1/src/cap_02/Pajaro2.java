package cap_02;

public class Pajaro2 {

	// ATRIBUTOS
	private static int numpajaros = 0; // ATRIBUTO DE LA CLASE
	private char color;
	private int edad;

	// M�TODOS
	static void nuevopajaro() {
		numpajaros++;
	}

	// M�TODO DE LA CLASE, no necesito ning�n objeto para llamarlo
	static void muestrapajaros() {
		System.out.println(numpajaros);
	}

	Pajaro2() {
		color = 'v';
		edad = 0;
		nuevopajaro();
	}

	Pajaro2(char c, int e) {
		color = c;
		edad = e;
		nuevopajaro();
	}

	@Override
	public String toString() {
		return "Pajaro2 [color=" + color + ", edad=" + edad + "]";
	}

}
