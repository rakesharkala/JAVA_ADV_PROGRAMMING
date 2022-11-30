package EXCEPTION_HANDLING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// HERE NO NEED OF  CLOSING THE RESOURSE ,TRY WILL HANDLE EVERYTHING

public class TRY_with_RESOURSES
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("ENTER THE NAME AND VALUE  : ");
		String name;
		
		try(BufferedReader obj=new BufferedReader (new InputStreamReader (System.in)))
		{
			name =obj.readLine();
			
		} 
		System.out.println(name );
	}

}
