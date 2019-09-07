package com.capgemini;

import java.util.Scanner;

public class IsPowerOfTen {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		while(num>9 && (num%10)==0)
		{
			num/=10;
		}
		if(num==1)
			System.out.println("Given number is power of Ten");
		else
			System.out.println("Given number is not a power of Ten");

	}

}
