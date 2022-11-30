package MUTLI_THREADING;

public class USING_LAMDA_MT
{
public static void main(String[] args) 
{
	Thread obj=new Thread()
			{
		       public void run()
		       {
		    	   for(int i=1;i<=5;i++) {
		    		   System.out.println("HIII");
		    		   try {Thread.sleep(1000);} catch (Exception e) {}
		    	   }
		       }
			};
	Thread obj2=new Thread ()
			{
		         @Override
		        public void run() {
		        	for (int i = 0; i < 5; i++) {
		        		System.out.println("HELLO");
		             try {Thread.sleep(1000);}catch(Exception e) {}
					}
		        }
			};
			
			obj.start();
			try {Thread.sleep(200);}catch(Exception e) {}
			obj2.start();
			
			System.out.println("this is rakesh");
			
			
}
}
