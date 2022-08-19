package Lab_9;
/*
@Author Sankhajit Roy
*/

// Q1. problem statement 3

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {   // main class
	// created a HashMap object
	HashMap<String, String> M1 = new HashMap<>();  
	
	/*
	1. Develop a java class with a instance variable CountryMap HashMap (M1) 
	   add a method storeCountryCapital(String CountryName, String capital) ,
	   the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
	*/ 
	public HashMap<String, String> storeCountryCapital(String CountryName, String capital){    // method
		M1.put(CountryName,capital);
		return M1;
	}
	
	/*
	 2. Develop a method retrieveCapital(String CountryName) which returns the capital for 
	    the country passed from the Map M1 created in step 1.
	*/
	public String retrieveCapital(String CountryName) {     // method 
		return M1.get(CountryName);
	}
	
	/*
	3. Develop a method retrieveCountry(String capitalName) which returns 
	   the country for the capital name passed from the Map M1 created in step 1.
	*/
	public String retrieveCountry(String capitalName) {   // method
		// traversing
		for(Entry<String, String> m : M1.entrySet()) {
			if (m.getValue().equals(capitalName))
				return m.getKey();
		}
		return M1.get(capitalName);
	}
	
	/*
	4. Develop a method which iterates through the map M1 and creates another map M2 with 
	   Capital as the key and value as Country and returns the Map M2.
	*/
	public HashMap<String, String> keyValue() {     // method
		HashMap<String, String> M2 = new HashMap<String, String>();
		// traversing
		for(Map.Entry<String, String> m : M1.entrySet()) {
			M2.put(m.getValue(), m.getKey());
		}
		return M2;
	}
	
	/*
	5. Develop a method which iterates through the map M1 and creates a ArrayList with all 
	   the Country names stored as keys. This method should return the ArrayList.
	*/
	public ArrayList<String> toArrayList() {    // method
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		// traversing through map
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey()+" = "+me.getValue());
		}
		return list;
	}
		
	public static void main(String[] args) {    // main method
		// main class object
		CountryMap cm = new CountryMap();
		// called methods
		cm.storeCountryCapital("India", "Delhi");
		cm.storeCountryCapital("Japan", "Tokyo");
		cm.storeCountryCapital("China", "Beijing");
		System.out.println(cm.retrieveCapital("India"));
		System.out.println(cm.retrieveCountry("Tokyo"));
		
		// invoked a HashMap object
		HashMap<String, String> M2 = cm.keyValue();
		System.out.println(M2);
		// to print all ArrayList elements
		System.out.println(cm.toArrayList());
	}
}
