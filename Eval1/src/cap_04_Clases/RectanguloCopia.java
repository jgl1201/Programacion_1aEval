package cap_04_Clases;

public class RectanguloCopia implements AreaFigura, PerimetroFigura{

	private int ancho;
	private int alto;
	private String nombre;

	public RectanguloCopia(int alto, int ancho, String nombre) {
		this.alto = alto;
		this.ancho = ancho;
		this.nombre = nombre;
	}

	public RectanguloCopia incrementaAncho() {
		this.ancho++;
		return this; // el rectangulo aumenta uno de ancho y vuelves a tener el rectangulo con las
						// nuevas medidas
	}

	public RectanguloCopia incrementaAlto() {
		this.alto++;
		return this; // el rectangulo aumenta uno de alto y vuelves a tener el rectangulo con las
						// nuevas medidas
	}

	public RectanguloCopia(Rectangulo r) {
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre=" + nombre + "]";
	}

	@Override
	public int area() {
		return this.alto * this.ancho;
	}

	@Override
	public double perimetro() {
		return this.alto * 2 + this.ancho * 2;
	}

}
