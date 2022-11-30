package OOPS_4;

class AX
{
	public AX()
	{
		System.out.println("A CLASS ");
	}
	public AX(int i)
	{
		System.out.println("in parametaraised A"+i);
	}
}
class BX extends AX
{
	public BX()
	{
		super();
		System.out.println("in b");
	}
	public BX(int i)
	{
		super(i);
		System.out.println("in para B"+i);
	}
	
}


public class PARAMETERAISED_SUPER
{
  public static void main(String[] args) 
{
	BX obj=new BX(5);
	
}
}
