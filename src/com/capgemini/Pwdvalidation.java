package com.capgemini;

import java.util.Scanner;


public class Pwdvalidation {
   
	   public static String PwdPattern ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{8,15})";
	
	  public boolean validate( String password)
	   {
		   return password.matches(PwdPattern);
	   } 
	     
	   
	   public static void main(String[] args) {
		
		   Pwdvalidation pwd=new Pwdvalidation();
		
		   Scanner s=new Scanner(System.in);
		   System.out.println("Enter the password");
		   String str=s.nextLine();
		     
		      boolean b= pwd.validate(str);
		      
		      if(b)
		      System.out.println("Valid Password");
		      else
		    	  System.out.println("Invalid Password"+ "\n"+ "Length of password is greater than or equal to 8"+ "\n"+"password must contain atleast one upper,one lowercase letters, one number and one special character");
	     

	}

}
