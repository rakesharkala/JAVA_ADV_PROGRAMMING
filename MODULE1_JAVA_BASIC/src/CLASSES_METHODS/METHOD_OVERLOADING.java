package CLASSES_METHODS;

class add
{
	public void perform()  // 2 MTHODS HAVE SAME NAME BUT DIFF SIGNATURE IS CALLED M O
	{
		System.out.println("ITS A NOT PARAMETERAISD METHOD");
	}
	public void perform(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		System.out.println("THIS IS PARAMETARISED METHOD IT \n OVERRIDE WHEN GIVE PARAMETERS");
	}
}


public class METHOD_OVERLOADING 
{

	public static void main(String[] args)
	{
		add obj=new add();
		
		obj.perform(5,6);
		
	}
}
