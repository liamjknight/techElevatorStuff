package com.techelevator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tutorial {
	

    public static void main(String[] args) {

        //Declare a Map
    	Map<String, String> nameToZip = new HashMap<String, String>();
    	
    	//Add items to a Map
    	nameToZip.put("Mary","19003");
    	nameToZip.put("Barry","19004");
    	nameToZip.put("Carey","19004");
    	
    	//Check if Key exists
    			String newKey= "Jerry";
    			String newValue = "19006";
    			
    			if (nameToZip.containsKey(newKey)) {
    				System.out.println(newKey+" already exists.");
    			}else {
    				nameToZip.put(newKey, newValue);
    			}
		System.out.println("\nIterating via Set=KeyValues");
		//Loop through a Map
    	Set<String> nameToZipKeys = nameToZip.keySet();
    	for (String value : nameToZipKeys) {
			System.out.println(value+" lives in: "+nameToZip.get(value));
    	}
    	
    	//Check if Key exists
    			newKey= "Jerry";
    			newValue = "19006";
    			
    			if (nameToZip.containsKey(newKey)) {
    				System.out.println(newKey+" already exists.");
    			}else {
    				nameToZip.put(newKey, newValue);
    			}
    	System.out.println("\nIterating via KVP");		
    	//Iterating via K-V Pairs
    	for(Map.Entry<String, String> nameZipEntry : nameToZip.entrySet()) {
    		System.out.println(nameZipEntry.getKey()+" lives in: "+
    	nameZipEntry.getValue());
    	}
    }

}
