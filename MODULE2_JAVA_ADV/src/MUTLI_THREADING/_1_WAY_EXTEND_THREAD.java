package MUTLI_THREADING;
// HERE WE R USING START AND RUN METHOD TO EXCUETE SYMULTANOULSLY 

class Hello1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HII");
			try {Thread.sleep(5000);}catch(Exception e) {}
			
		}
	}
}
class hii extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("HELLO");
			try { Thread.sleep(5000);}catch(Exception e) {};
		}
		
	}
	
}
public class _1_WAY_EXTEND_THREAD 
{
public static void main(String[] args)
{
	Hello1 obj=new Hello1();
	hii obj1=new hii();
	
	obj.start();
	
	try {Thread.sleep(200);}catch(Exception e) {}
	
	obj1.start();
	
	
	
	
}
}
