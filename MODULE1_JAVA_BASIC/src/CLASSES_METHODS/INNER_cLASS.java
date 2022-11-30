package CLASSES_METHODS;

class outer
                                   //WHY WE NEED 
								   // ONLY OUTER PURPOSE CLS WHEN NEED
{									// INNER CLS 3 TYPES   A,MEMEBER CLS
	public void show()								    // B,STATIC CLS
	{												    // C,ANONYMOUS CLS
		System.out.println("HIII THIS IS OUTER CLS");
	}
	
	class inner
	{
		public void show()
		{
			System.out.println("THIS IS INNER CLS");
		}
	}
}
public class INNER_cLASS 
{
	public static void main(String[] args)
	{
		
		outer obj=new outer();
		
		outer.inner obj2=obj.new inner();   // THIS IS PROCESS TO CREATE INNER OBJ
				
		obj.show();
		obj2.show();
	}

}
