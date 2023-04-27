package cap_02;
/*getLibras. Devuelve el peso en libras.
getLingotes. Devuelve el peso en lingotes.
getPeso. Devuelve el peso en la medida que se pase como parámetro 

‘Libra’ para libras
‘Lingote’ para lingotes
‘Onza' para onzas
‘Peniques’ para peniques
‘Kilo’ para kilos
‘Gramo’ para gramos 
‘Quintal’ para quintales).

1 Libra = 16 onzas = 453 gramos.
1 Lingote = 32,17 libras = 14,59 kg.
1 Onza = 0,0625 libras = 28,35 gramos.
1 Penique = 0,05 onzas = 1,55 gramos.
1 Quintal =100 libras = 43,3 kg. */
public class Propuesto06_Peso {
	
	double valor; // PESO EN KG
	
	Propuesto06_Peso(double valor, String medida) {
		this.valor = valor;
	}
	
	public double getValor(String medida) {
		double aux = 0d;
		switch(medida) {
		case "Libra" :
			aux = valor * 0.453;
			break;
		case "Lingote" :
			aux = valor / 14.59;
			break;
		case "Onza" :
			aux = valor * (28.35 / 1000);
			break;
		case "Penique" :
			aux = valor * (1.55 / 1000);
			break;
		case "Kilo" :
			aux = valor;
			break;
		case "Gramo" :
			aux = valor * 1000;
			break;
		case "Quintal" :
			aux = valor * 43.3;
			break;
		default : System.out.println("Medida no establecida");
		}
		return aux;
	}

}
