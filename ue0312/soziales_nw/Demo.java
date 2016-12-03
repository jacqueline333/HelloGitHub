package soziales_nw;

public class Demo {

	public static void main(String[] args) {
		
		profil p = new profil("Jacqueline", "Perl", "test@test", 12.34, 1.0, new MayBelnt(40, 2), new MayBelnt(1234, 2));
		
		p.print();

	}

}
