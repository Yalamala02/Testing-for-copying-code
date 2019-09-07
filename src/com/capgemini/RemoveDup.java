package com.capgemini;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a string");
		 String str=s.nextLine();
		 
		 String[] str1=str.split("\\s+");
		 
            for(int i=0;i<str1.length;i++)
            {
            	if(str1[i]!=null)
            	  for(int j=i+1;j<str1.length;j++)
            	  {
            		  if(str1[i].equals(str1[j]))
            			  str1[j]=null;
            	  }
            }
            for(int k=0;k<str1.length;k++){
            	
            	if(str1[k]!=null)
            		System.out.print(str1[k]+" ");
            }
	}

}
