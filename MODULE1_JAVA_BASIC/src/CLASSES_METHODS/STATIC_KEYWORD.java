package CLASSES_METHODS;
class Employee
{
	String name;
	int sal;
	static String ceo; 
	
	public static void me()
	{
		ceo="prudhi";
	}
	public void emp()
	{
		System.out.println("NAME OF THE EMPLOYEE   : "+name);
		System.out.println("SALARY OF THE EMPLOYEE : "+sal);
		System.out.println("CEO OF THAT EMPLOYEE   : "+ceo);
	}
	
}
public class STATIC_KEYWORD 
{
public static void main(String[] args) 
{
	Employee obj1=new Employee();
	
	
	//Employee.ceo="ANIL";  //STATIC METHODS ND VARIABLES USING CLS NAME
	Employee.me();          // static method can be override 
	obj1.name="RAKESH";
	obj1.sal=50000;
	
	
Employee obj2=new Employee();
	
	obj2.name="KARTHI";
	obj2.sal=60000;

	
	obj1.emp();
	System.out.println();
	obj2.emp();
	
}
}
