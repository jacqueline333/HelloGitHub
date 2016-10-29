
public class Uebung2_2910 {

	public static void main(String[] args) {
		
		//  Metropolis 
		
	boolean result = isMetropolis(true,1_000, 100);
	
	if(result){
	System.out.println("Diese Stadt ist eine Metropole: ");	
	} else { System.out.println("Diese Stadt ist uncool");
	}
	}
	
	
		public static boolean isMetropolis(	boolean isCapital, 
											int inhabitans, 
											double taxPerPersonAndMonth)
		{
			
			double taxes = inhabitans * taxPerPersonAndMonth *12;
			
			if(inhabitans >100_000 && isCapital == true
				|| taxes >720_000_000 && inhabitans > 200_000) {
				return true;
				} else {
				return false;}
			}
	}
		

//		boolean resultA = capital && inhabitans > 100_000;
//		boolean resultB = taxes > 720_000_000 && inhabitans > 200_000;
//		return resultA || resultB;	
	
 


