package ABSTRACT_INTERFACES;

interface Demo5
{
	void abs();
	default void show()
	{
		System.out.println("this is deom");
	}
}
interface mydemo
{
	public default void show()
	{
		System.out.println("this is mydemo interface");
	}
	
}
class exnms implements Demo5,mydemo
{
		
	@Override
	public void abs() {
		System.out.println("this is implented");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo5.super.show();
	}
	
	
}
public class MULTIPLE_INHARITANCE_____________ 
{
public static void main(String[] args) {
	Demo5 o=new exnms();
	o.abs();
	o.show();
	
}
}
