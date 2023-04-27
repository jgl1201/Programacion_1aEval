package cap_04_Clases;

public class Cuadrado {
	
	private int lado;
	
	public Cuadrado (int lado) {
		this.lado = lado;
	}
	
	public int getArea() {
		return lado * lado;
	}
	
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(200);
		System.out.println("Area = " + c1.getArea());
	}

}
