package EXCEPTION_HANDLING;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UN_CHECKED_EXCEPTION
{
	
	public static void main(String[] args) 
	{
		System.out.println("ENTER VALUE OR NAME ");
		
		BufferedReader  obj=new BufferedReader(new InputStreamReader (System.in));
		
		try 
		{
		String name=obj.readLine();
		obj.close();                    // we have close the io resourse otherwise it occupy memory space 
		
		System.out.println(name);
		}
		catch(Exception e)
		{
			System.out.println("this is having some issue");
		}
		finally
		{
			System.out.println("process completed ");
		}
		
	}

}
