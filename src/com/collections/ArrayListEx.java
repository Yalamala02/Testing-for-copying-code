package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ramana");
		al.add("kiran");
		al.add("ashok");
		al.add("bhrath");
		System.out.println(al);
		// get elements by index
		System.out.println("Element at index 1: " + al.get(1));
		System.out.println("Does list contains ashok? " + al.contains("ashok"));
		// add elements at a specific index
		al.add(2, "sujith");
		System.out.println(al);
		System.out.println("Is arraylist empty? " + al.isEmpty());
		System.out.println("Index of PERL is " + al.indexOf("kiran"));
		System.out.println("Size of the arraylist is: " + al.size());
		
		// iterating elements
		System.out.println("------iterating al elements -------");
		Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
         // cloning array list   
         System.out.println("Actual ArrayList:"+al);
         System.out.println("------- cloning array list ------- ");
         ArrayList<String> copy = (ArrayList<String>) al.clone();
         System.out.println("Cloned ArrayList:"+copy);
         
         // adding list to array list 
         List<String> list = new ArrayList<String>();
         list.add("reddy");
         list.add("thirupal");
         al.addAll(list);
         System.out.println("After adding list ro array list: "+al);
         
         // contains all checking
         List<String> listContains = new ArrayList<String>();
         list.add("ramana");
         list.add("ashok");
         System.out.println("Does ArrayList contains all list elements?: "
                     +al.containsAll(listContains));
         list.add("reddy");
         System.out.println("Does ArrayList contains all list elements?: "
                     +al.containsAll(listContains));
         
         // coping to array
         System.out.println("---------copying array list to array---------");
         String[] strArr = new String[al.size()];
         al.toArray(strArr);
         System.out.println("Created Array content:");
         for(String str:strArr){
             System.out.println(str);
         }
         
         // getting sub list
         System.out.println("------Getting Sub list-----");
         List<String> subList = al.subList(2, 4);
         System.out.println("Sub List: "+subList);
         
         // reverse arraylist 
         System.out.println("------ reversing arralist -------");
         Collections.reverse(al);
         System.out.println("Results after reverse operation:" + al);
         
         // swapping two elements
         System.out.println("-------swapping two elements---------");
         Collections.swap(al, 2, 5);
         System.out.println("Results after swap operation:" + al);
         
         // clearing list
         System.out.println("---- clearing arraylist-------");
         al.clear();
         System.out.println("After clear ArrayList:"+al);

	}

}
