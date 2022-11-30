package GENERICS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LIST_WITH_ENHANCED_FOR 
{
	public static void main(String[] args) 
	{
		List<Integer> obj=new ArrayList<>();
		
		obj.add(1);
		obj.add(14);
		obj.add(15);
		obj.add(75);
	
		for(int j:obj)
		{
			System.out.println(j);
		}
		
		
	}

}
