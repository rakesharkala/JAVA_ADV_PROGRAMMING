package GENERICS;

//Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR_EX {
public static void main(String[] args) {

 // Make a collection
 ArrayList<String> cars = new ArrayList<String>();
 
 cars.add("Volvo");
 cars.add("BMW");
 cars.add("Ford");
 cars.add("Mazda");

 // Get the iterator
 Iterator<String> it = cars.iterator();

 // Print the first item
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }
 System.out.println(it.next());
}
}

























/*
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ITERATOR_EX
{
	public static void main(String[] args)
	{
		Collection values =new ArrayList();
		
		values.add("rakesh");
		values.add("veera");
		values.add("hari");
		values.add(25);
		
		Iterator it= values.iterator();
		
		while (it.hasNext())
		{
		
		
	}

}
*/