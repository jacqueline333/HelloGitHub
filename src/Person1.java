
public class Person1 {

	public static void main(String[] args) {
		
		
		Person HansM�ller = new Person();
		HansM�ller = new Person();
		HansM�ller.vorname = "Hans";
		HansM�ller.nachname = "M�ller";
		HansM�ller.alter = 20;
		HansM�ller.geburtsdatum = "20.10.1996";
		
		Person JacquelinePerl = new Person();
		JacquelinePerl = new Person();
		JacquelinePerl.vorname = "Jacqueline";
		JacquelinePerl.nachname = "Perl";
		JacquelinePerl.alter = 24;
		JacquelinePerl.geburtsdatum = "19.06.1992";
		
		System.out.println("Vorname: " + HansM�ller.vorname);
		System.out.println("Nachname: " +  HansM�ller.nachname);
		System.out.println("Alter: " + HansM�ller.alter);
		System.out.println("Geburtsdatum: " + HansM�ller.geburtsdatum);
		System.out.println();
		System.out.println("Vorname: " + JacquelinePerl.vorname);
		System.out.println("Nachname: " +  JacquelinePerl.nachname);
		System.out.println("Alter: " + JacquelinePerl.alter);
		System.out.println("Geburtsdatum: " + JacquelinePerl.geburtsdatum);
	}

}
