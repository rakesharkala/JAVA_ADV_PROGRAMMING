package EXCEPTION_HANDLING;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CHECKED_EXCEPTION 
{
    public static void main(String[] args) throws Exception
    {
    	
    	System.out.println("enter the no : ");
    	
    	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));   //this is another way of taking input from user 
    	
    	int n=Integer.parseInt(obj.readLine());    // this read line give exception this is compiler knows ,generally referd as checked exception
    	
		System.out.println(n);
	}
}
