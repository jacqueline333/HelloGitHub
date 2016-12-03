package soziales_nw;

public class profil {
	
	private String vorname; 
	private String nachname;
	private String email; 
	private MayBelnt alter; 
	private double passwort; 
	private double bezstatus;
	private MayBelnt gehalt; 
	
	public profil (String vorname, String nachname, String email, double passwort, 
			double bezstatus, MayBelnt alter, MayBelnt gehalt){
		super();
		this.vorname = vorname; 
		this.nachname = nachname; 
		this.email = email; 
		this.alter = alter; 
		this.passwort = passwort;
		this.bezstatus = bezstatus;
		this.gehalt = gehalt;
	}
	
	public void print ()
	{ 
	System.out.println(vorname + " " + nachname); 
	System.out.println("Alter: ");
	alter.print();
	System.out.println("Gehalt: ");
	gehalt.print(); 
	System.out.println("Mail: " +email);

}}
