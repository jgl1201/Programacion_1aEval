package cap_04_Clases;

public class Cohete {
	
	private static int numCohetes = 0;
	
	// cada vez que se construya un cochete se suma uno
	public Cohete() {
		numCohetes++;
	}

	public static int getNumCohetes() {
		return numCohetes;
	}

	public static void setNumCohetes(int numCohetes) {
		// en vez de this, que es una ref a un objeto, usa el nombre de la clase
		Cohete.numCohetes = numCohetes;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cohete c1 = new Cohete();
		Cohete c2 = new Cohete();
		Cohete c3 = new Cohete();
		Cohete c4 = new Cohete();
		
		System.out.println("Numero de cohetes creados: " + Cohete.getNumCohetes());
		
	}

}
