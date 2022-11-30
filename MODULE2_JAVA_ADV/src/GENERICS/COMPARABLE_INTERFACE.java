package GENERICS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class COMPARABLE_INTERFACE 
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		List <stud> obj=new ArrayList<>();
		
		obj.add( new stud(23,1,"rakesh"));
		obj.add( new stud(23,1,"rakesh"));
		obj.add( new stud(23,1,"rakesh"));
		obj.add( new stud(23,1,"rakesh"));
		
		Collections.sort(obj);
		
		for (stud stud : obj) {
			System.out.println(stud);
		}
		
	}

}
