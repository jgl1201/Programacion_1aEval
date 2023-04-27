package Ejer4B;

public class Libro {
	
	protected static String titulo;
	protected static String autor;
	protected static int numEjemplares;
	protected static int numEPrestados;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int numEjemplares, int numEPrestados) {
		Libro.titulo = titulo;
		Libro.autor = autor;
		Libro.numEjemplares = numEjemplares;
		Libro.numEPrestados = numEPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		Libro.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		Libro.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		Libro.numEjemplares = numEjemplares;
	}

	public int getNumEPrestados() {
		return numEPrestados;
	}

	public void setNumEPrestados(int numEPrestados) {
		Libro.numEPrestados = numEPrestados;
	}
	
	public boolean prestamo () {
		if (Libro.numEjemplares > Libro.numEPrestados) {
			Libro.numEPrestados++;
			return true;
		} else return false;
	}

	public boolean devolucion () {
		if (Libro.numEjemplares < Libro.numEPrestados - 1) return false;
		else {
			numEPrestados--;
			return true;
		}
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + getTitulo() + ", autor=" + getAutor() + ", numEjemplares="
				+ getNumEjemplares() + ", numEPrestados=" + getNumEPrestados() + "]";
	}
	
}
