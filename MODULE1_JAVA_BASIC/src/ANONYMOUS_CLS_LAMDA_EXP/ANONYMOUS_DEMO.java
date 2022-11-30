package ANONYMOUS_CLS_LAMDA_EXP;

class A
{
	public void show()                            // this anonymous cls basically used to overide the main cls method
	{ 
		System.out.println("A show ");
	}
}

public class ANONYMOUS_DEMO
{
	
	public static void main(String[] args)
	{
		A obj=new A() {
			public void show ()
			{
				System.out.println("B show ");
			}
		};
		obj.show();
		
		
	}

}


/*
class A
{
	public void show()
	{
		System.out.println("A show ");
	}
}
class B extends A
{
	public void show ()
	{
		System.out.println("B show ");
	}
}
public class ANONYMOUS_DEMO
{
	
	public static void main(String[] args)
	{
		A obj=new B();
		obj.show();
		
		
	}

}
*/