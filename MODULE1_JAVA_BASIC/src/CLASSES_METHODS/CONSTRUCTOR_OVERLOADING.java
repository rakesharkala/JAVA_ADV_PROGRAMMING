package CLASSES_METHODS;

class Demo
{
	public Demo()     // IF WE WRITE VOID ,INT ANYHTING IT WILL ACT AS METHOD
	{
		System.out.println("DEFALUT CONSTRUCTOR RUNNING");   // CONSTRUCTOR ONLY HAVE 
															//PUBLIC AND CLS NAME ()
	}
	public Demo(int x,int y)
	{
		x=x+y;
		System.out.println(x);
	}
	
}


	public class CONSTRUCTOR_OVERLOADING 
    {
		
		public static void main(String[] args)
		{
			Demo obj=new Demo(5,5);
		}
    }
	
	
	
	
	
	
	
	
	

/*	public static void main(String[] args) 
	{
		CONSTRUCTOR_OVERLOADING constructor_OVERLOADING = new CONSTRUCTOR_OVERLOADING();
		constructor_OVERLOADING.demo();
	}
	public void demo()
	{
		System.out.println("METHOD IN SAME CLS \nWE CAN ACCESS USING CLS NAME NO neef OF OBJ when its static other wise \nwe need to create obj");
	}
}
*/