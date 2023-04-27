package cap_02;

public class Pajaro2Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pajaro2 p1, p2;
		p1 = new Pajaro2();
		p2 = new Pajaro2('a', 3);

		Pajaro2.muestrapajaros();

		Pajaro2 p3 = new Pajaro2();
		Pajaro2 p4 = new Pajaro2();
		Pajaro2 p5 = new Pajaro2();
		Pajaro2 p6 = new Pajaro2();
		Pajaro2 p7 = new Pajaro2();

		Pajaro2.muestrapajaros();

		// System.out.println(Pajaro2.toString());
	}

}
