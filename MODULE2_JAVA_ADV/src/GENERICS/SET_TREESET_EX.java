package GENERICS;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SET_TREESET_EX 
{
	public static void main(String[] args) 
	{
		/*
		Set <Integer> no=new TreeSet<>();
		                        // treset gives the data in assendding order
		no.add(10);
		no.add(15);
		no.add(10);
		no.add(12);
		
		System.out.println(no);
		*/
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		
		Set <String> str=new TreeSet<>();
		
		for(int i=0;i<=5;i++)
		{
			str.add(name);
			System.out.println(str);
		}
		   // based on first letter string is sorted
		
		
	}
	
	
	

}
