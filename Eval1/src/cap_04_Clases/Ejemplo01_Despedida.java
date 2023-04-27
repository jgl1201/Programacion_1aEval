package cap_04_Clases;

public class Ejemplo01_Despedida {
	
private String nombre;
	
	public Ejemplo01_Despedida(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void sayBye() {
		System.out.println("Chao " + getNombre().toUpperCase());
	}
	

}
