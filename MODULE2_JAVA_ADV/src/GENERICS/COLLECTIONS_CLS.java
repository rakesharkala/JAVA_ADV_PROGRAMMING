package GENERICS;
                               //Java program to demonstrate working of Collections.sort()
import java.util.*;
/*
public class Collectionsorting
{
 public static void main(String[] args)
 {
     // Create a list of strings
     List<String> al = new ArrayList<String>();
     al.add("Geeks For Geeks");
     al.add("Friends");
     al.add("Dear");
     al.add("Is");
     al.add("Superb");
     
  

     /* Collections.sort method is sorting the
     elements of ArrayList in ascending order. */
 /*    Collections.sort(al);
     Collections.reverse(al);
     Collections.shuffle(al);
     Collections.copy(al,al );
     Collections.max(al);
     Collections.min(al);
     
    for(String i:al) 
    {
    	System.out.println(i);
    	
    }
 }
}
*/

public class COLLECTIONS_CLS 
{
	public static void main(String[] args)
	{
		ArrayList <Integer> obj=new ArrayList<>();
		
		obj.add(14);
		obj.add(15);
		obj.add(15);
		obj.add(75);
		
		
		Collections.sort(obj);
		Collections.reverse(obj);
		
		Iterator it=obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
	}

}
