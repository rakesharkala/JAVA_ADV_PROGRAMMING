package ABSTRACT_INTERFACES;

abstract class subs
{
   public abstract void num(Number ... i);
   
   public void show()
   {
	   System.out.println("THIS IS PRASENTED IN ABSTRACT CLS  ");
   }
}
 class s extends subs
{
	public void num(Number ... i )
	{
		
		for(Number k:i)                  // we cant use anything other then abstract having
		{
		System.out.println(k);
		
		}
	}
	}
 
public class NUMBER 
{

	public static void main(String[] args) {
		
		subs obj=new s();
		obj.num(10,15,14,45);

		
	}
	
	
}
