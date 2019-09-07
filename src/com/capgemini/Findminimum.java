     //FindMinimumNoFromArray For Given Num
   
package com.capgemini;

import java.util.Scanner;

public class Findminimum {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int count=0;
		
		if(num<=a[0]+a[1]+a[2]+a[3])
		  {
			for(int i=0;i<a.length;i++)
			 {
				for(int j=0;j<a.length;j++)
				{
					if(a[i]+a[j]==num)
					{
						count++;
						System.out.println(a[i]+","+a[j]);
					}
				}	
			 }
		  
		System.out.println("Total count= "+count);
		  }
		else
		{
			System.out.println("Target value out of scope "+ -1);
		}
		
	}
}
