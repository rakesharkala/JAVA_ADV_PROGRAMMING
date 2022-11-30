package GENERICS;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class MAP_EXAMPLES 
{
	public static void main(String[] args) 
	{
		Map<Integer,String > obj=new HashMap<>();  // MAP CANRT ACCSE ITERATOR
		
		obj.put(1,"Rakesh");
		obj.put(5,"ANIL");
		obj.put(2, "awkal");
		obj.put(0, "52");
	
	System.out.println(obj);
	}

}
