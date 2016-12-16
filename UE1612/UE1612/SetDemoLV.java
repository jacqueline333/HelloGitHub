package UE1612;

import java.util.HashSet;

//import com.sun.xml.internal.ws.model.ReflectAnnotationReader;

public class SetDemoLV {

	public static void main(String[] args) {

		//set A => mit 4 Namen (String)
		//set B => mit 5 Namen (String)
		// zumindest 2 Namen sich überlappenn => in A und B
		//retainAll
		
		//intersection (Schnittmenge) 
		
		//SET A
		HashSet<String> setA = new HashSet<String>();
		setA.add("Harald");
		setA.add("Ina");
		setA.add("Jaci");
		
		//SET B
		HashSet<String> setB = new HashSet<String>(); 
		setB.add("Ina");
		setB.add("Martin");
		setB.add("Sebastian");
		setB.add("Harald");
		setB.add("Gerald");
		
		HashSet<String> tmpInt =new HashSet<>(setA);
		tmpInt.retainAll(setB); 
		System.out.println(tmpInt);

		HashSet<String> tmpDiff =new HashSet<>(setB);
		tmpDiff.removeAll(setA); 
		System.out.println(tmpDiff);
		
		//union => addAll
		
		HashSet<String> tmpUnion= new HashSet<>(setA); 
		tmpUnion.addAll(setB);
		System.out.println(tmpUnion);
		

}
	}
