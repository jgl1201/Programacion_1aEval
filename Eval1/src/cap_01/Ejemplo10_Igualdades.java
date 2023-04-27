package cap_01;

public class Ejemplo10_Igualdades {
	public static void main(String[] args) {

		int m = 2, n = 5;
		boolean res;
		res = m > n && m >= n;// res=false
		System.out.println("res es:" + res);
		res = !(m < n || m != n);// res=false
		System.out.println("res es:" + res);
	}
}
