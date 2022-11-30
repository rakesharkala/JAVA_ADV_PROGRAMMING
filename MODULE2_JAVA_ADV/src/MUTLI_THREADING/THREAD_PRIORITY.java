package MUTLI_THREADING;

//THREAD PRIORITY IS GENERALLY USED TO IDENTIFY THREAD BASED ON THEIR PRIORITY

public class THREAD_PRIORITY
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
					
					obj.setName("    rks");
					obj2.setName("   anil");
					System.out.println(obj.getName());
					System.out.println(obj2.getName());
					
					obj.join();
					obj2.join();
					
					System.out.println("this is rakesh");
					
					
		}
		

	}

