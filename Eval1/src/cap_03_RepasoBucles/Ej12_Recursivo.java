package cap_03_RepasoBucles;

public class Ej12_Recursivo {
		
		public static int factorialIterativo (int n) {
			
			int fac = 1;
			
			for (int i=n ; i>=1 ; i-=1) {
				fac = fac * i;
				//System.out.println("Acumulado: " + fac);
			}
			return fac;
		}

		public static int factRecursivo (int n) {
			
			int fac = 1;
			
			if ( n < 1) {
				return fac; // CASO LÍMITE
			} else {
				return fac = n * factRecursivo(n - 1); // LEY DE RECURSIVIDAD ---> ENTRA EN EXAMEN EJS. DE RECURSIVIDAD
			}

		}
	}
