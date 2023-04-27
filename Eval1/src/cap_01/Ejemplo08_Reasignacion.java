package cap_01;

public class Ejemplo08_Reasignacion {

	public static void main(String[] args) {

		int n1 = 2, n2;
		n2 = n1 * n1;
		System.out.println("n2 vale:" + n2);
		n2 = n2 - n1;
		System.out.println("n2 vale:" + n2);
		n2 = n2 + n1 + 15;
		System.out.println("n2 vale:" + n2);
		n2 = n2 / n1;
		System.out.println("n2 vale:" + n2);
		n2 = n2 % n1;
		System.out.println("n2 vale:" + n2);
	}
}