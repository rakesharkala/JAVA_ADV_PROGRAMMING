package GENERICS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//GENERICS : GENERIC S IS USED TO SPECIFY THE THE DATATYPE WIHT HELP OF GENERIC S 
// WE CAN USE SPECIFIC DATATYPE 
// GENERICS INTRODUCED IN 1.5======>1.4===>COLLECTION

public class BASIC_LIST_ARRAYLIST

{
	public static void main(String[] args)
	{
		
		List <Integer> no=new ArrayList<Integer>();
		
		no.add(1);
	//	no.add("RAKESH");
		no.add(15);
		no.add(1);         // has dublicate elements
		no.add(152);    
		
		System.out.println(no);
		
		
		
	}

}
