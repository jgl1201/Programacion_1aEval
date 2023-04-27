package cap_04_Peces;

public class TestPez {
	
	public static void main(String[] args) {
		
		Pez uno = new Pez("sardina");
		System.out.println(uno.toString());
		Pez dos = new Pez("nemo");
		System.out.println(dos.toString());
		Pez tres = new Pez(uno);
		System.out.println(tres.toString());
		
		System.out.println("Son iguales? " + uno.equals(dos));
		System.out.println("Son iguales? " + tres.equals(uno));
		System.out.println("Son iguales? " + tres.equals(dos));
		System.out.println("Numero de peces creados: " + Pez.countFish());
		
	}

}
