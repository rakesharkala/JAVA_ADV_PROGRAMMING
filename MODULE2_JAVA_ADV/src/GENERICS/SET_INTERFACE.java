package GENERICS;

import java.util.HashSet;
import java.util.Set;

public class SET_INTERFACE {
	public static void main(String[] args) 
	{
		
		Set <Integer> obj=new HashSet<>();  // hashset giv e randaom order 
										 //TREESET GIVE ASSENDING ORDER
		
		                              // hashing used to store data in memory 
		obj.add(1);                 // set eliminate dublicates elements
		obj.add(15);
		obj.add(10);
		obj.add(1);
		obj.add(42);
		
		for (Integer integer : obj) {
			System.out.println(integer);
			
		}
	}

}
