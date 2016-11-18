
public class UEAbend2 {

	public static void main(String[] args) {
		// Array Demo 1
		
		int []numbers={8,0,100,-10,71,6};
		
		
		// Ausgabe welche Nummer verglichen werden soll
		System.out.println(containsNumbers(numbers,4));
		System.out.println(containsNumbers(numbers,0));
		System.out.println(containsNumbers(numbers,71));
		System.out.println(containsNumbers(numbers,-1));
	}
	
	public static boolean containsNumbers(int[] arr //oben numbers namensgleichheit muss nicht gegeben sein Typ muss zusammenpassen und Reihenfolge
			, int num) {
		for(int i = 0; i < arr.length; i++){
			// bei Array länge nie fixen Wert schreiben sondern arr.length! sollten für unterschiedliche Aufrufparameter verwendbar sein!
			if(arr[i] == num){
				return true;	
			}	
		}	
		return false; 
	}
}
