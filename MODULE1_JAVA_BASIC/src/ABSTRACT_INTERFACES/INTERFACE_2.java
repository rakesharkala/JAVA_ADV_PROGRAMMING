package ABSTRACT_INTERFACES;

interface abc
{
	public void show();
}
class ci implements abc
{
	public void show()
	{
		System.out.println("HII THIS IS INTERFACE");
	}
}
public class INTERFACE_2 
{
	public static void main(String[] args) {

   abc obj=new ci();
   obj.show();
 
   
}
}