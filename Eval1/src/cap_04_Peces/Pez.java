package cap_04_Peces;

public class Pez {
	
	private static int numFishes = 0;
	protected String name; // puede ser heredado por las subclases
	
	public static int countFish() {
		return numFishes;
	}
	
	// CONSTRUCTOR
	public Pez(String name) {
		this.name = name;
		numFishes++;
	}
	
	// CONSTRUCTOR DE COPIA
	public Pez(Pez p) {
		this.name = p.getName();
		numFishes++;
	}
	
	// GETERS & SETTERS
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pez [name=" + name + "]";
	}

/*	@Override
	protected Object clone() {
		Object obj = null;
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	*/
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pez) { 						// si el objeto creado es un Pez
			Pez tempPez = (Pez) obj;
			if (this.name == tempPez.name)return true; 	// si se llaman igual son iguales
			else return false;							// si no se llaman igual no son iguales
		} else return false;							// si el objeto creado no es un Pez
	} // equals	
	
}
