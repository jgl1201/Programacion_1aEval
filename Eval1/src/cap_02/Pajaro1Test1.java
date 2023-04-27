package cap_02;

public class Pajaro1Test1 {

	public static void main(String[] args) {

		int anhos;
		Pajaro1 piolin = new Pajaro1();

		piolin.setEdad(5);
		// piolin.printEdad();
		System.out.println(piolin.toString());

		piolin.setEdad(8);
		anhos = piolin.getEdad();
		System.out.println("El p�jaro tiene " + anhos + " a�os");

		piolin.setColor('a');
		// piolin.printColor();

		System.out.println(piolin.toString());

		// EJEMPLO DE USO DE CONSTRUCTOR CON TODOS LOS ATRIBUTOS
		Pajaro1 dos = new Pajaro1('t', 24);
		System.out.println(dos.toString());

	}

}
