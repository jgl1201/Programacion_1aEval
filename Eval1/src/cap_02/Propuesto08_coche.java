package cap_02;

import java.util.Scanner;

// el this hace referencia a los atributos del constrctor
public class Propuesto08_coche {

	private String marca;
	private String modelo;

	public Propuesto08_coche() { 
		this.marca = "";
		this.modelo = "";
	}

	public Propuesto08_coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Propuesto08_coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public void setmarca(String m) {
		this.marca = m;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public static void main(String[] args) {
		
		String marca, modelo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Marca: ");
		marca = sc.nextLine();
		System.out.println("Modelo: ");
		modelo = sc.nextLine();
		
		Propuesto08_coche vacio = new Propuesto08_coche();
		Propuesto08_coche lleno = new Propuesto08_coche(marca, modelo);
		
		System.out.println(vacio.toString());
		System.out.println(lleno.toString());
		
		String info;
		info =lleno.getMarca().concat(lleno.getModelo());
		System.out.println(info);
		
		sc.close();
		
	}
	
}
