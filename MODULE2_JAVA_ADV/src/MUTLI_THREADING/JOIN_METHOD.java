package MUTLI_THREADING;

public class JOIN_METHOD 
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
				
				
				obj.join();  // join METHOD IS USED TO WAIT THE MAIN METHOD UNTIL COMPLETION OF THREAD PROCESS
				obj2.join();
				System.out.println("this is rakesh");
				
				
	}
	}


