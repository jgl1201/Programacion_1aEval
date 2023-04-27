package cap_02;

public class Propuesto12_Chocos {

	private double patatas;
	private double chocos;

	public double getPatatas() {
		return patatas;
	}

	public void setPatatas(double patatas) {
		this.patatas = patatas;
	}

	public double getChocos() {
		return chocos;
	}

	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	public Propuesto12_Chocos() {
		patatas = 0;
		chocos = 0;
	}

	public Propuesto12_Chocos(double patatas, double chocos) {
		this.patatas = patatas;
		this.chocos = chocos;
	}

	public void addPatatas(double patatas) {
		this.patatas += patatas;
	}

	public void addChocos(double chocos) {
		this.chocos += chocos;
	}

	@Override
	public String toString() {
		return "Propuesto12_Chocos [patatas=" + patatas + ", chocos=" + chocos + "]";
	}

	public int numeroClientes() {
		int numClientes = 0;
		while (patatas >= 1 && chocos >= 0.5) {
			numClientes += 3;
			patatas--;
			chocos -= 0.5;
		}
		return numClientes;
	}

}
