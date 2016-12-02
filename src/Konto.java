

public class Konto 
{

 public Konto()
 {
 }
 private double kontostand;
 private String kontoinhaber; 
 
 public double getKontostand(double i)
 {
  kontostand = i;
  System.out.println("Ihr derzeitiger Kontostand beträgt " +kontostand);
  return kontostand;
 }
  
 public void setKontostand(double kontostand) {
	this.kontostand = kontostand;
}

public double einzahlen(double money)
 {
  kontostand = kontostand + money;
  
  System.out.println("Der Kontosstand nach der Einzahlung beträgt: " +kontostand);
  return kontostand;
 }
  
  public double abheben (double money)
  {
   if (kontostand - money >0)
   {
	   kontostand = kontostand - money;
	   System.out.println("Ihr Kontostand nach der Abhebung beträgt " +kontostand);
   }
   else
   {
    System.out.println("Das Konto wurde leider überzogen!");
   }
   return kontostand;
  }
 public double monatlich(int n, int anzahlMonate)
 {
	 for(int i=0; i<=anzahlMonate; i++)
	 {
	  kontostand = kontostand + n;
	  System.out.println("Ende des " + i + " Monats: " +kontostand);
	 }
	 return kontostand; 
  }
 
 public double endBetrag(int n, int betrag)
 {
  int anzahl = 0;
  while(kontostand <= betrag)
  {
  anzahl++;
   kontostand = kontostand+n;
  }
  System.out.println("Der Endbetrag ist  ist nach " +anzahl + " Monaten erreicht!");
  return kontostand;
 }
 }
  

