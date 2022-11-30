package GENERICS;

import java.util.HashSet;
import java.util.Set;

public class SET_HASHSET 
{
	public static void main(String[] args) 
	{
		Set <String> str=new HashSet<>();
		
		str.add("rakesh");   
		str.add("anil");
		str.add("rakesh");    // this will be override  bs dublicate element
		
		
		System.out.println(str);
		
	}

}
