package cap_02;

public class Pajaro1Test2 {
	
	public static void main(String[] args) {
		
		Pajaro1 loro = new Pajaro1();
		
		loro.setColor('v');
		loro.getColor();
		
		loro.setEdad(2);
		loro.getEdad();
		
		System.out.println(loro.toString());
		loro.volar();
		loro.cantar();
				
	}

}
