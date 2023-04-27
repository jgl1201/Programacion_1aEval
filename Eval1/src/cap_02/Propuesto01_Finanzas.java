package cap_02;

public class Propuesto01_Finanzas {

	final static double CAMBIO_POR_DEFECTO = 1.36;
	double cambio;

	public double dolarAEuro(double dinero) {
		return (dinero * cambio);
	}

	public double euroADolar(double dinero) {
		return (dinero / cambio);
	}

	Propuesto01_Finanzas() {
		this.cambio = CAMBIO_POR_DEFECTO;
	}

	Propuesto01_Finanzas(double c) {
		this.cambio = c;
	}

	@Override
	public String toString() {
		return "Propuesto01_Finanzas [cambio=" + cambio + "]";
	}
	
}
