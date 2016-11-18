
public class UEAbend2_1 {

	public static void main(String[] args) {
		// summe aller erhaltenen Zahlen ausliefern
		
		//methode summa aller Elemente berechnen
		
		int[] numbers = {8,0,100,-10,71,6}; 
		
		System.out.println("sum: " + calculateSum(numbers));
	}
	
	public static int calculateSum(int[] arr) {
		
		int sum = 0; 
		
		for(int i = 0; i <  arr.length; i++) //jedes Feld besuchen
		{
		sum = sum + arr[i];
		
		}
		return sum; 
	}

}
