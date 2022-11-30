package ANONYMOUS_CLS_LAMDA_EXP;

interface Abc
{
	void show();
	
}
public class ANONYMOUS_CLS_WITH_INTERFACE 
{																	// memory save
	public static void main(String[] args) 
	{
		Abc obj=new Abc()
				{
			       public void show()
			       {
			    	   System.out.println("this is anonymous id");
			       }
			
				};
		obj.show();
	}

}
