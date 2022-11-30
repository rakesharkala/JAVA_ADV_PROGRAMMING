package MUTLI_THREADING;

public class _2ndWAY_CREATE_THREAD_PRIORITY 
{
	
			public static void main(String[] args) throws InterruptedException 
			{
				Thread obj=new Thread(()->
				                      {
										for(int i=1;i<=5;i++) 
					                      {
					    		             System.out.println("HIII");
					    		             try {Thread.sleep(1000);} catch (Exception e) {}
					    	               }
					                   },"HII THREAD");
				Thread obj2=new Thread (()->
				                        {
									        	for (int i = 0; i < 5; i++) 
									        	{
									        		System.out.println("HELLO");
									             try {Thread.sleep(1000);}catch(Exception e) {}
												}
									       
										},"HELLO MAN");
						
						obj.start();
						try {Thread.sleep(200);}catch(Exception e) {}
						obj2.start();
						System.out.println(obj.getPriority());    // it give priority
						System.out.println(obj2.getPriority());
					
						obj.join();
						obj2.join();
						
						System.out.println("this is rakesh");
			}}

