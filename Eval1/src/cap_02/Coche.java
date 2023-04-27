package cap_02;

public class Coche {

	// ATRIBUTOS
	int numero_ruedas;
	String color;
	String marca;
	String modelo;
	int numero_puertas;
	double consumo;
	int potencia;

	// CONSTRUCTOR sin par�metros
	public Coche() {

	}

	// CONSTRUCTOR con todos los par�metros
	public Coche(int numero_ruedas, String color, String marca, String modelo, int numero_puertas, double consumo,
			int potencia) {
		this.numero_ruedas = numero_ruedas;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.numero_puertas = numero_puertas;
		this.consumo = consumo;
		this.potencia = potencia;
	}

	// M�TODOS
	public void arrancar() {
		System.out.println("Est� arrancando");
	}

	public void frenar() {
		System.out.println("Frenamos");
	}

	public void acelerar() {
		System.out.println("Gas");
	}

	public void acelerar(int c) {
		System.out.println("Has acelerado " + c);
	}

	public void pasarITV() {
		System.out.println("Rezar mucho");
	}

	@Override
	public String toString() {
		return "Coche [numero_ruedas=" + numero_ruedas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", numero_puertas=" + numero_puertas + ", consumo=" + consumo + ", potencia=" + potencia + "]";
	}

}
