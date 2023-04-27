package cap_02;

public class CocheTest {

	public static void main(String[] args) {

		Coche npi = new Coche();
		Coche feo = new Coche(4, "verde", "ni_se_sabe", "antiguo", 2, 7.32, 14);
		Coche guay = new Coche(4, "negro mate", "Lamborghini", "Aventador", 3, 2.35, 500);

		feo.arrancar();
		feo.acelerar();
		feo.acelerar(100);
		feo.frenar();
		feo.pasarITV();

		System.out.println(feo.toString());
		System.out.println(guay.toString());
		System.out.println(npi.toString());
	}

}
