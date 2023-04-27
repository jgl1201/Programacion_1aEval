package cap_04_Clases;
/*		1
 * 	   1 1
 *    1 2 1 
 *   1 3 3 1
 *  1 4 6 4 1		*/
public class Resuelto03_Piramide {
	
	public static int elemento (int fila, int columna) {
		if (columna == 1) return 1;
		if (columna < 1 || columna > fila) return 0;
		return elemento (fila - 1, columna) + elemento(fila - 1, columna - 1);
	}
	
	public static void main(String[] args) {
		int numFilas = 5;
		for (int i = 1; i < (numFilas - i); i++) {
			for (int j = 0; j < numFilas - i; j++) {
				
			}
		}
	}

}
