package ABSTRACT_INTERFACES;

//WE CANT CREATE OBJ OF ABSTRACT
//DECALREE METHODS
//U CANT CHANGE ABSTRACT CLS

abstract class Human
{
	public abstract void  eat();   // in abstract cls we can declare methods & define also
	
	public void walk()
	{
		System.out.println("HIII");
	}
}
//CONCRETE CLS
class man extends Human    // inthis class wee need declare method of abste=ract other wise it
                           // give error
{

	@Override
	public void eat()
	{    
		System.out.println("this is eaten ");
	}
	
}
public class ABSTRACT_DEMO 
{
	public static void main(String[] args)
	{
		
		Human obj=new man();
		obj.eat();
		obj.walk();           // we can call abstract cls method with child ref
		
	}

}
