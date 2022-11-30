package ABSTRACT_INTERFACES;


interface demos1
{
	void abc();
	
	default void show()
	{
		System.out.println("default interface method");
	}
}

class ex implements demos1
{
	public void abc()
	{
		System.out.println("this is cls from declare of interface");
		
	}
}
public class DEFAULT_METHOD_IN_INTERFACE
{
	
	public static void main(String[] args) {
		demos1 obj=new ex();
		obj.abc();
		obj.show();    // default method also need to cl
	}

}
