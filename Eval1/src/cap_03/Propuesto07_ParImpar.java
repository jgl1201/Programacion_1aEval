package cap_03;

import java.util.*;

public class Propuesto07_ParImpar {

		public static void main(String[] args) {
			
			Random rnd = new Random();
			int mejor = 0;
			
			for (int j = 0; j < 10; j++ ) {
				mejor = (int) (rnd.nextDouble() * 101 + 100); // [100 , 200]
				System.out.println("Generado: " + mejor);
			}
			
			
		}
	
}
