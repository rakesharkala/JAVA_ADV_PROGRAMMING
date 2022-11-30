package CLASSES_METHODS;

class dc
{
	int i,j;
	
	public dc()                // DEFAULT CONSTRUCTOR
	{
		System.out.println("THIS IS DEFAULT CONSTRUCTOR ");
		i=5;j=6;
		int sum=i+j;
		System.out.println(sum);
	}
	
	public dc(Number k)           // PARAMETERISED CONSTRUCTOR
	{
		//k=k+10;
		System.out.println(k);
	}
	
	
	
}



public class CONSTRUCTOR_DEMO
{

	  public static void main(String ...args)
	  {
		  dc obj=new dc(5.5);     // WE HAVE TO PARAMETERS ,AS PER THAT IT WILL TAKE CONSTRUCTOR
		  						  // CONSTRUCTOR WILL BE AUTOMATICALLY CALLED 
		  						  // CONSTRUCTOR USED TO ALLOCATE MEMORY TO OBJ
	  }
}
