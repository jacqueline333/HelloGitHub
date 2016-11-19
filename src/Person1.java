
public class Person1 {

	public static void main(String[] args) {
		
		
		Person HansMüller = new Person();
		HansMüller = new Person();
		HansMüller.vorname = "Hans";
		HansMüller.nachname = "Müller";
		HansMüller.alter = 20;
		HansMüller.geburtsdatum = "20.10.1996";
		
		Person JacquelinePerl = new Person();
		JacquelinePerl = new Person();
		JacquelinePerl.vorname = "Jacqueline";
		JacquelinePerl.nachname = "Perl";
		JacquelinePerl.alter = 24;
		JacquelinePerl.geburtsdatum = "19.06.1992";
		
		System.out.println("Vorname: " + HansMüller.vorname);
		System.out.println("Nachname: " +  HansMüller.nachname);
		System.out.println("Alter: " + HansMüller.alter);
		System.out.println("Geburtsdatum: " + HansMüller.geburtsdatum);
		System.out.println();
		System.out.println("Vorname: " + JacquelinePerl.vorname);
		System.out.println("Nachname: " +  JacquelinePerl.nachname);
		System.out.println("Alter: " + JacquelinePerl.alter);
		System.out.println("Geburtsdatum: " + JacquelinePerl.geburtsdatum);
	}

}
