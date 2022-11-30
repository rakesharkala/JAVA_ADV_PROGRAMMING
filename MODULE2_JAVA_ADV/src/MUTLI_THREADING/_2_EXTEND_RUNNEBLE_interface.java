package MUTLI_THREADING;
// already runnable inface is predef


class A  implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HII");
			
			try {Thread.sleep(1000);}catch(Exception e){}
			
		}
		
	}
}

class B implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HELLo");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
}
public class _2_EXTEND_RUNNEBLE_interface
{
	public static void main(String[] args) 
	{
		Runnable obj=new A();
		Runnable obj2=new B();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(200);}catch(Exception e) {}
		t2.start();
		
	}

}
