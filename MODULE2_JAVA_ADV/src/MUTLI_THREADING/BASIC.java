package MUTLI_THREADING;

import java.util.Iterator;

class demo
{
	public void show() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HII THIS ");
			
			try { Thread.sleep(1000);} catch (Exception e) {}
		}

	}
}

class Hello
{
	public void show()
	{
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("hello man");
		  try { Thread.sleep(1000);} catch (Exception e) {}
	  }
		

	}
}
public class BASIC
{
	public static void main(String[] args) 
	{
		demo obj=new demo();
		Hello o=new Hello();
		
		obj.show();
		o.show();
		
	}

}
