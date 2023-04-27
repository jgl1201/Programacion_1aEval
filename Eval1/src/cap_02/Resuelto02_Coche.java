package cap_02;

public class Resuelto02_Coche {

	private int velocidad;

	Resuelto02_Coche() {
		velocidad = 0;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void acelera(int mas) {
		velocidad += mas;
	}

	public void frena(int menos) {
		velocidad -= menos;
	}

	@Override
	public String toString() {
		return "Resuelto02_Coche [velocidad=" + velocidad + "]";
	}

}
