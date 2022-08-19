package Lab_9;
/*
@Author Sankhajit Roy
*/

// Q1. problem statement 2

import java.util.HashSet;
import java.util.Iterator;

public class Country {    // main class
	
	// created a HashSet object
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> storeCountryNames(String CountryName) {    // method
		H1.add(CountryName);
		return H1;
	}
	 
	public String retrieveCountry(String CountryName) {    // method
		
		// traversing
		Iterator<String> it = H1.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
	
	public static void main(String[] args) {    // main method
		Country countries = new Country();     // main class object
		// called methods and adding elements
		countries.storeCountryNames("India");
		countries.storeCountryNames("USA");
		countries.storeCountryNames("China");
		countries.storeCountryNames("Korea");
		countries.storeCountryNames("Africa");

		// get the elements
		System.out.println("China: " + countries.retrieveCountry("China"));
		System.out.println("Japan: " + countries.retrieveCountry("Japan"));		
	}
}
