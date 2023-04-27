package cap_02;

public class Pajaro1 {

	// ATRIBUTOS
	private char color;
	private int edad;

	// M�TODOS INVENTADOS
	public void printEdad() {
		System.out.println(edad);
	}

	public void printColor() {
		switch (color) {
		case 'v':
			System.out.println("Verde");
			break;
		case 'a':
			System.out.println("Amarillo");
			break;
		case 'g':
			System.out.println("Gris");
			break;
		case 'n':
			System.out.println("Negro");
			break;
		case 'b':
			System.out.println("Blanco");
			break;
		default:
			System.out.println("El color no est� establecido");
		}
	}

	// CONSTRUCTORES
	Pajaro1() {

	}

	Pajaro1(char color, int edad) {
		this.color = color;
		if (edad >= 0) {
			this.edad = edad;
		} else {
			System.out.println("No se admiten edades negativas");
			edad = 0;
		}

	}

	// M�TODOS DE LA CLASE
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void volar() {
		System.out.println("Me voy volando");
	}

	public void cantar() {
		System.out.println("Pio pio");
	}

	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + "]";
	}

}
