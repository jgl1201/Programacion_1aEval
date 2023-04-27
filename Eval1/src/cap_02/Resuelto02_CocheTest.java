package cap_02;

public class Resuelto02_CocheTest {

	public static void main(String[] args) {

		Resuelto02_Coche coche = new Resuelto02_Coche();

		coche.getVelocidad();
		System.out.println(coche.toString());
		coche.acelera(500);
		System.out.println(coche.toString());
		coche.frena(50);
		System.out.println(coche.toString());

	}

}
