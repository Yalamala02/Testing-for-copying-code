package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
    

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// add key-value pair to hash map
		hm.put(1, "Ramana");
		hm.put(2, "Ashok");
		hm.put(3, "Charan");
		hm.put(4, "bharath");
		System.out.println(hm);
		// getting value for the given key from hashmap
		System.out.println("Value of key 2: " + hm.get(2));
		System.out.println("Is HashMap empty? " + hm.isEmpty());
		hm.remove(3);
		System.out.println(hm);
		System.out.println("Size of the HashMap: " + hm.size());
		
		// iterate hash map
		Set<Integer> keys = hm.keySet();
		for(Integer key: keys){
			System.out.println("Value of "+key+" is: "+hm.get(key));
		}
		
		// adding Hash Map
		 HashMap<Integer, String> subMap = new HashMap<Integer, String>();
	        subMap.put(5, "sujith");
	        subMap.put(6, "kiran");
	        hm.putAll(subMap);
	        System.out.println("hash map "+hm);
	        
	        // Searching a key
	        
	        System.out.println("---------Searching key in hash map----------"); 
	        
	        if(hm.containsKey(4)){
	            System.out.println("The hashmap contains key 4");
	        } else {
	            System.out.println("The hashmap does not contains key 4");
	        }
	        
	        if(hm.containsKey(3)){
	            System.out.println("The hashmap contains key 3");
	        } else {
	            System.out.println("The hashmap does not contains key 3");
	        }
	        
	        System.out.println("-------Searching value in hash map--------------"); 
	        
	        
	        // searching Value
	        if(hm.containsValue("ramana")){
	            System.out.println("The hashmap contains value raman");
	        } else {
	            System.out.println("The hashmap does not contains value ramana");
	        }
	        if(hm.containsValue("kiran")){
	            System.out.println("The hashmap contains value kiran");
	        } else {
	            System.out.println("The hashmap does not contains value kiran");
	        }
	        
	        // Getting only keys
	        System.out.println("----------Getting Only keys --------------");
	        Set<Integer> hmkeys = hm.keySet();
	        for(Integer key: hmkeys){
	            System.out.println(key);
	        }
	        
	        // Iterating using entry set
	        System.out.println("-----------Entry set iteration-----------");
	        Set<Entry<Integer, String>> entires = hm.entrySet();
	        for(Entry<Integer,String> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
	        
	        // Clearing hash map
	        System.out.println("-------Clear hash map----------");
	        hm.clear();
	        System.out.println("Content After clear:");
	        System.out.println(hm);

	}

}
