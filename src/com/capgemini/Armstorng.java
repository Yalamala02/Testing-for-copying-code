package com.capgemini;

import java.util.Scanner;

public class Armstorng {

	public static void main(String[] args) {
		
		//Printing armstrong numbers from 1 to 500
		for(int i=1;i<500;i++)
		{
			int n=i;
			int sum=0;
			while(n!=0)
			{
			  int rem=n%10;
			  sum=sum+rem*rem*rem;
			  n=n/10;
			} 
			
			 if(sum==i)
			 System.out.println(i);
			 
	         // Given number Armstrong or not
	 /*	Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		   int num=s.nextInt();
		
      // Counting no.of digits
         
          int count=0, n1=num;
		    while(n1!=0)
		     {
			n1=n1/10;
			count++;
		     }
        System.out.println(count);  */
		
		
			 
		   
		/*  int sum=0, num1=num;
			while(num!=0)
			{
			  int rem=num%10;
			  sum=sum+rem*rem*rem;
			  num=num/10;
			}
		
		if(sum==num1)
		System.out.println("Given number is Armstrong number");
		else 
			System.out.println("number not a armstrong number");  */
		
		}	
	}

}
	


