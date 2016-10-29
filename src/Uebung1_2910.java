
public class Uebung2910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = printRectangleArea("Das Rechteck hat eine Fläche von:", 4, 5);
		System.out.println(result);
	}

	public static String printRectangleArea(String text, int a, int b) {
		int area = a * b;
		return text + " " + area;

	}
}
