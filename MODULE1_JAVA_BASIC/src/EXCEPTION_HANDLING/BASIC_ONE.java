package EXCEPTION_HANDLING;
// EXCEPTION HANDLING IS THE WAY OF HANDLING ERROR WHETHER ITS COMPILE TIME OR RUN TIME 
// TRY  : WE R WRITE ALL CRITICAL EXPRESSION IN THIS BLOCK

//CATCH : CATCH IS USED TO HANDLE THE ERROR
//FINALLY : THIS BLOCK EXCUTED ALWAYS
//CHECKED EXCEPTIONS : THROWS EXCEPION E ---> COMPILER KNOWS THIS EXCEPTION
//UN-CHECKED EXCEPTION : USING TRY CATCH --> COMPILER DEOST KNOW


public class BASIC_ONE                                //unchecked_ex
{
	public static void main(String[] args) 
	{
		int i=6,j=0,k;
		
		try {
			k=i/j;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.err.println("eroor"+e);
			
		}
		finally {                   // any error comes it will print first   / without finally it print last
		System.out.println("bye");
		}
		
	}

}
