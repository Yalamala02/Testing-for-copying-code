package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		System.out.println("Is HashSet empty? " + hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		System.out.println("Size of the HashSet: " + hs.size());
		System.out.println("Does HashSet contains first element? " + hs.contains("first"));
		
		System.out.println("--------------------");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("------ addeing sub set-------");
		HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println(hs);
        
        // copy  to array
        System.out.println("--------- copy to array");
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:"+hs);
        
        // retain all
        HashSet<String> suSet = new HashSet<String>();
        suSet.add("second");
        suSet.add("s1");
        hs.retainAll(suSet);
        System.out.println("HashSet content:"+hs);
        System.out.println(hs);
        
        // clearing hash set
        System.out.println("-----------");
        hs.clear();
        System.out.println("Content After clear:");
        System.out.println(hs);
	}
	
	

}
