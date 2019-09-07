package com.capgemini;

import java.util.Scanner;

public class RemoveDupChar {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a string");
		 String str=s.nextLine();
		 
		 char[] ch=str.toCharArray();
		  for(int i=0;i<ch.length;i++)
          {
          	  for(int j=i+1;j<ch.length;j++)
          	  {
          		  if(ch[i]==ch[j])
          			  ch[j]='\0';
          	  }
          }
		  
		  for(int k=0;k<ch.length;k++){
          	
          	if(ch[k]!='\0')
          		System.out.print(ch[k]+" ");
          }

	}

}
