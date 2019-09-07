package com.capgemini;

public class FindSecMaxEle {

	public static void main(String[] args) {
		int[] a={1,4,5,2,56,78,95};
		int temp;
		 int length=a.length;
		    for(int i=0;i<a.length;i++)
		    {
		    	for(int j=0;j<a.length;j++)
		    	{
		    		if(a[i]<a[j])
		    		{
		    			 temp=a[i];
		    			 a[i]=a[j];
		    			 a[j]=temp;
		    		}
		    		
		    	}	
		    }
		
		System.out.println("Second max element in array is " + a[length-2]);  
		System.out.println("Second min element in array is " + a[1]);
	}

}
