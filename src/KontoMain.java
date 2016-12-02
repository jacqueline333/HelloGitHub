
public class KontoMain {

	public static void main(String[] args) 
	{
	 Konto jacqueline = new Konto();
	 
	 jacqueline.getKontostand(10000);
     
	 jacqueline.einzahlen(5);
	 jacqueline.abheben(5);
     
	 jacqueline.monatlich(50,3);
	 jacqueline.endBetrag(8,900);
	}
	
}
