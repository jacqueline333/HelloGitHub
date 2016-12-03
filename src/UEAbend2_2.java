
public class UEAbend2_2 {

	public static void main(String[] args) {
		// zahlen sollen in umgekerter reihenfolge angedruckt werden!!
		
		int[] numbers = {7,8,12,13,27};
		
		printArray(reverse(numbers));
	}
	
	public static void printArray (int[] arr){
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+", ");	
		}
	}
	
	public static int[] reverse(int orig[]){
		int[] result = new int[orig.length];
		for(int i=0; i < result.length; i++) {
		result[result.length-1-i] = orig[i];	
		}
		return result;
}
}