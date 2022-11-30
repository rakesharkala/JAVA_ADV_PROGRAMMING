package ABSTRACT_INTERFACES;

import java.util.Scanner;

public class demo 
{
	   public static void main(String[] args) 
	   {
		int a[]=new int[10];
		
	    Scanner sc=new Scanner(System.in);
	  
	     System.out.println("Enter array values");
	
	     	for(int x=0;x<a.length;x++)
	     		{
	     				a[x]=sc.nextInt();
	     		}
	     		System.out.println("my OUTPUT is");
	
	     		for (int x=0;x<a.length;x++)
	     			{
	     			System.out.println(a[x]);
	     			}
	

	}

}

