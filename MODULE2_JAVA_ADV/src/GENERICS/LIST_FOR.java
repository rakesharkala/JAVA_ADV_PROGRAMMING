package GENERICS;

import java.util.ArrayList;
import java.util.List;

public class LIST_FOR 
{
	public static void main(String[] args) 
	{
		
		List obj=new ArrayList<>();    
		obj.add("rakesh");
		obj.add(1);
		obj.add(15);
		obj.add("rakesh");
		
		
		for (int i = 0; i < 4; i++) 
		{
			System.out.println(obj.get(i));
			
		}
		
	
		
	}

}
