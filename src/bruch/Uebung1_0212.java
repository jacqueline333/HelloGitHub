package bruch;

public class Uebung1_0212 {

	//Bruchrechnen
	
	private int nenner; 
	private int zaehler; 
	
public double Bruch(int zaehler, int nenner) 
{this.zaehler = zaehler; 
 this.nenner = nenner; 
}

public int getZaehler ()
{
	return zaehler; 
}

public int getNenner() {
	return nenner; 
}

public void print()
{System.out.println(zaehler + " / " + nenner);
}

public double toDecimal(){
	return zaehler *1.0 / nenner; 
}

public Bruch multilicate (Bruch b2)
{
	double zaehler = this.zaehler * b2.getZaehler();
	double nenner = this.nenner * b2.getNenner();

	return new Bruch (this.zaehler * b2.getZaehler(),
	
	this.nenner *b2.getNenner();
	
}


}