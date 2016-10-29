
public class Uebung3_2910_TeilerFinden {

	public static void main(String[] args) {
		
		
		int zahl = 54;
		int teiler = 2;
		
		while(teiler < zahl){
			if(zahl % teiler == 0){
				System.out.println("teiler "+teiler + " gefunden");
				}
			//Teiler um 1 erhöhen
			teiler++; 		
			
			// % modulo liefert Rest einer Division ab
		}
	}
}
