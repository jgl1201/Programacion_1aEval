package cap_02;

public class Propuesto03_Entero {

	// ATRIBUTO
	int valor;

	// DOS CONSTRUCTORES
	Propuesto03_Entero() {
		this.valor = 0;
	}

	Propuesto03_Entero(int v) {
		this.valor = v;
	}

	// VARIOS MÉTODOS
	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void suma(int numero) {
		valor += numero;
	}

	public void resta(int numero) {
		valor -= numero;
	}

	public int getDoble() {
		return this.valor * 2;
	}

	public int getTriple() {
		return this.valor * 3;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Propuesto03_Entero [valor=" + valor + "]";
	}

}