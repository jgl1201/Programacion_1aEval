package cap_01;

// generar letras aleatorias y decir si son vocales

public class Propuesto08_1_VocalRandom {
	
	public static char getLetras() {
		
		return(char)(Math.random()*26 + 'a');
	}
	
	public static void main(String[] args) {
		
		int contador = 0;
		char c;
		for(int i = 0 ; i < 15 ; i++) {
			c = getLetras();
			System.out.println("Generando: " + c);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contador++;
				System.out.println("Es vocal");
			}
		}
		
		System.out.println("Vocales: " + contador);
		
	}

}
