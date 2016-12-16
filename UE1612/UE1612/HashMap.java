package UE1612;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new java.util.HashMap<>();
		
		myMap.put("Wolfsberg", 5000);
		myMap.put("Graz", 273838);
		myMap.put("Voitsberg", 51691);
		myMap.put("Deutschlandsberg", 60410);
		
		Integer ewWolfsberg =myMap.get("Wolfsberg");
		System.out.println("Bezirk Wolfsberg: "+ewWolfsberg);
	}

}
