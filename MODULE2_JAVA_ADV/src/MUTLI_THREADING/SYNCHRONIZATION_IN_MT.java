package MUTLI_THREADING;

// HERE 2 METHODS USING SINGLE RESOURSE AT A TIME 
// SO SOME MISCONSUPTIONS OCCURED IN IT ----> TO OVER COME THIS  WE USE SYNCHRONISE 
// ---THIS IS METHOD IS USED TO ALLCATE THE RESOURSE A ATIME TO SINGLE METHOD 

class   dens
{
	int count=0;
	public synchronized void show()    // synchronized is responsible for allocate resoures to one method at a time 
	{
		count++;
	}
}
public class SYNCHRONIZATION_IN_MT 
{
	public static void main(String[] args) throws InterruptedException {

   dens obj=new dens();
   
   Thread t1=new Thread(new Runnable()
		   				{
							@Override
							public void run() {
								
								for(int i=0;i<1000;i++)
								{
									obj.show();	
								}
								
							}   
				       });
   
   Thread t2=new Thread(new Runnable()
					   {
				   			public void run()
				   			{
				   				for (int i = 0; i < 1000; i++) {
				   					obj.show();
								}
				   			}
					   });
   
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(obj.count);
		 
		
	}
}
