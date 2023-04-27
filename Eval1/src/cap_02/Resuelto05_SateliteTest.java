package cap_02;

public class Resuelto05_SateliteTest {
	
	public static void main(String[] args) {
		
		// construcción del satélite sin atributos
		Resuelto05_Satelite satelite = new Resuelto05_Satelite();
		// setteo de los atributos
		satelite.setPosicion(42, -7, 2000);
		// salida por pantalla
		System.out.println(satelite.toString());
		
		// construcción de satélite con atributos
		Resuelto05_Satelite luna = new Resuelto05_Satelite(52, 89, 5000);
		// salida por pantalla
		System.out.println(luna.toString());
		
	}

}