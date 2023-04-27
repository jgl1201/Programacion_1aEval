package Ejer4B;

public class TestLibro {
	
	public static void main(String[] args) {
		Libro pilares = new Libro();
		System.out.println(pilares.toString());
		Libro soledad = new Libro("100 años de Soledad", "Ken Follet", 200, 50);
		System.out.println(soledad.toString());
		Libro asesinato = new Libro("Asesinato en el Orient Express", "Agatha Christie", 150, 100);
		System.out.println(asesinato.toString());
		
		pilares.setTitulo("Los pilares de la Tierra");
		pilares.setAutor("Ken Follet");
		pilares.setNumEjemplares(50);
		pilares.setNumEPrestados(48);
		System.out.println(pilares.toString());
		
		// devoluciones
		for (int i = 1; i <= 12; i++) {
			pilares.devolucion();
		}
		System.out.println(pilares.toString());
		
		// prestamos
		for (int i = 1; i <= 20; i++) {
			pilares.prestamo();
		}
		System.out.println(pilares.toString());
		
	}

}
