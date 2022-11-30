package ABSTRACT_INTERFACES;


interface acr
{
	int num=8;
	void abc();
	
	static void show ()
	{
		System.out.println("this is static method in the interface wowww");
	}
}
class acr1 implements acr
{

	@Override
	public void abc()
	{
		//num=6;        will give u error bs we cant modify declared in interface static
		System.out.println("this is method of interface");
	}
	
}

public class STATIC_METHOD_IN_INTERFACE
{
public static void main(String[] args) {

	acr.show();          // we can cl static method wiht cls no need obj
	//acr.add();
}
}
