package com.capgemini;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckPanagram {

public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		  
	      str=str.toLowerCase();
	      str=str.replaceAll("[^a-z]", "");
	      
	      System.out.println(str);
	      
	      char[] ch=str.toCharArray();
	      Set<Character> st=new HashSet<Character>();
	      
	      for(int i=0;i<ch.length;i++)
	    	  st.add(ch[i]);
	      
	      System.out.println(st.size()==26? "Panagram" : "Not Panagram");
	      
	      

	}
	
}
