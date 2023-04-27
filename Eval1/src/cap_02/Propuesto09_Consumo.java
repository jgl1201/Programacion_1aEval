package cap_02;

import java.util.Scanner;

public class Propuesto09_Consumo {
	
	double km;
	double litros_consum;
	double velocidad;
	double precio_gas;

	Propuesto09_Consumo(double km, double litros, double velocidad, double precio_gas) {
		this.km = km;
		this.litros_consum = litros;
		this.velocidad = velocidad;
		this.precio_gas = precio_gas;
	}

	@Override
	public String toString() {
		return "Propuesto09_Consumo [km=" + km + ", litros=" + litros_consum + ", velocidad=" + velocidad + ", precio_gas="
				+ precio_gas + "]";
	}
	
	public double tiempo() {
		return km / velocidad;
	}
	
	public String consumoMedio() {
		return "Has consumido " + (litros_consum / km) * 100 + " L/100";
	}
	
	public String consumoEuros() {
		return "Has consumido " + (litros_consum * precio_gas / km) * 100 + " euros de gasolina";
	}
	
	public static void main(String[] args) {
		
		double km, litros, velocidad, precio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime km: ");
		km = sc.nextDouble();
		System.out.println("Dime litros: ");
		litros = sc.nextDouble();
		System.out.println("Dime velocidad media: ");
		velocidad = sc.nextDouble();
		System.out.println("Dime precio de la gasolina: ");
		precio = sc.nextDouble();
		
		Propuesto09_Consumo c = new Propuesto09_Consumo(km, litros, velocidad, precio);
		System.out.println(c.toString());
		
		System.out.println("Has tardado: " + c.tiempo());
		System.out.println("Consumo medio: " + c.consumoMedio());
		System.out.println("Consumo euros: " + c.consumoEuros());
		
		sc.close();
	}
	
}