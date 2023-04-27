package cap_04_Clases;

public class Ejemplo01_Saludos {
	
	// private sirve para que no se pueda manipular, solo con un setNombre
	private String nombre;
	
	public Ejemplo01_Saludos(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void mostrarSaludo() {
		System.out.println("Hola " + getNombre().toUpperCase());
	}
	
}
