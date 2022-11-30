package GENERICS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class SORT_BASED_ON_LAST_dIGIT
{
	
	public static void main(String[] args) 
	{
		List <Integer>obj=new ArrayList<>();
		
		obj.add(502);
		obj.add(546);
		obj.add(412);
		obj.add(124);
		obj.add(215);
		
//		Collections.sort(obj);
//		
//		java.util.Iterator<Integer> it =obj.iterator();
//		
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		// based on last digit
		
		// HERE WE ARE COMPARATOR *******
		
		
		Comparator <Integer> c=new Comparator<>()
				{

					@Override
					public int compare(Integer i, Integer j) {
						
						if(i%10>j%10)
						{
							return 1;
						}
						
						return -1;
					}
			
				};
		
		Collections.sort(obj, c);
		
		Iterator it=obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
