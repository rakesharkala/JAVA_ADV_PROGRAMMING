package MUTLI_THREADING;

public class ALIVE_METHOD 
{
		public static void main(String[] args) throws InterruptedException 
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
				System.out.println(obj.isAlive());   // join method is give the status of thread is live and end
				
				
			    obj.join();
			    obj2.join();
				System.out.println("this is rakesh");
				System.out.println(obj2.isAlive());
				
				
	}
	}



