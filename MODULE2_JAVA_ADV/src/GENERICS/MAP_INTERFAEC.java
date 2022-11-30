package GENERICS;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MAP_INTERFAEC 
{
	public static void main(String[] args) 
	{
		Map <Integer,String> obj=new HashMap<>();
		
		obj.put(1, "RAKESH");
		obj.put(1, "ANIL KUMAR");
		obj.put(3,"YADAVS");
		
		System.out.println(obj);  // map also ignore dublicate elements
		
		System.out.println(obj.get(1));
		
		
		Set<Integer> keys =obj.keySet();
		for (Integer s :keys ) {
			System.out.println(s);
			
		}
		
		
	}
	

}
