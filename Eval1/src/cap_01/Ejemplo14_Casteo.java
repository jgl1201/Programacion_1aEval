package cap_01;

public class Ejemplo14_Casteo {
	
	public static void main(String[] args) {
		
		int idato = 5;
		byte bdato;
		float chico;
		double grande = 3.154D;
		
		bdato = (byte)idato;
		chico = (float)grande;
		
		System.out.println(bdato);
		System.out.println("Grande: " + grande);
		System.out.println("Chico: " + chico);
		
	}

}