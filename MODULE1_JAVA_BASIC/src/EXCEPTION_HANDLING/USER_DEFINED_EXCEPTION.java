package EXCEPTION_HANDLING;

public class USER_DEFINED_EXCEPTION 
{
	public static void main(String[] args)
	{
		int i=1,j=4,k;
		
		try 
		{
			k=i/j;
			System.out.println(k);
			
			if(k==0)
			{
				
				throw new rakeshException("this error id def by mee");
			}
		} 
		catch (rakeshException e) 
		{
			System.out.println("rkdefined "+e);
		}
		finally
		{
			System.out.println("bye");
		}
		
	}

}
