package cap_04_Clases;

public class Rectangulo implements Cloneable {
	
	private int ancho;
	private int alto;
	private String nombre;
	
	public Rectangulo(int alto, int ancho, String nombre) {
		this.alto = alto;
		this.ancho = ancho;
		this.nombre = nombre;
	}
	
	public Rectangulo incrementaAncho() {
		this.ancho++;
		return this; // el rectangulo aumenta uno de ancho y vuelves a tener el rectangulo con las nuevas medidas
	}
	
	public Rectangulo incrementaAlto() {
		this.alto++;
		return this; // el rectangulo aumenta uno de alto y vuelves a tener el rectangulo con las nuevas medidas
	}

	public Rectangulo(Rectangulo r) {
		this.ancho = r.getAncho();
		this.alto = r.getAlto();
		this.nombre = r.getNombre();
	}

	public int getAncho() {
		return this.ancho;
	}
	
	public int getAlto() {
		return this.alto;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre=" + nombre + "]";
	}
	
	public Object clone() {
		Object objeto = null;
		try {
			objeto = super.clone();
		} catch(CloneNotSupportedException nsex) {
			nsex.printStackTrace();
			System.out.println("La cagaste");
		}
		return objeto;
	}
	
}
