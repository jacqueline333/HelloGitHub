package UE1612;

import java.util.HashMap;
import java.util.Map;

public class HasMap {

	public static void main(String[] args) {

		HashMap<String, Integer> myMap = new java.util.HashMap<>();
		
		myMap.put("Wolfsberg", 5000);
		myMap.put("Graz", 273838);
		myMap.put("Voitsberg", 51691);
		myMap.put("Deutschlandsberg", 60410);
		// myMap.put("Wolfsberg", 273838); Duplikate werden überschrieben 
		
		
		Integer ewWolfsberg =myMap.get("Wolfsberg");
		System.out.println("Bezirk Wolfsberg: "+ewWolfsberg);
		
		Integer aktuellVoitsberg = myMap.get("Voitsberg");
		if(aktuellVoitsberg != null) {
			Integer neuVoitsberg =aktuellVoitsberg+500; 
			myMap.put("Voitsberg", neuVoitsberg);
			
			
		}
		
		System.out.println(myMap);
	}

}
