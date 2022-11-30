package EXCEPTION_HANDLING;

import java.io.EOFException;

public class MUTILPLE_cATCH
{
	public static void main(String[] args)
	{
		int i=5,j=1,k;
		int a[]=new int [5];
		
		try 
		{
			k=i/j;
			System.out.println(k);
			int s=a[5];
			System.out.println(s);
			
			
		} 
		catch (ArithmeticException  e)
		{
			System.out.println("this is arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array indexout of bonds ");
		}
		catch(Exception e)                               // if we specificall error handling this block will finally other wise it will give error
		{
			System.out.println("something went wrong");
		}
		
		finally
		{
			System.out.println("process completed");
		}
	}

}
