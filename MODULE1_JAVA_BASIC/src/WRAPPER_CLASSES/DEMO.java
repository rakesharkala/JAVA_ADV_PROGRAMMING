package WRAPPER_CLASSES;

public class DEMO 
{
  public static void main(String[] args) 
  {
	Integer i=new Integer(10);  // storing inside obj   //BOXING
	
	Integer j=10;                //AUTO BOXING
	
	System.out.println(i+"   "+j);
	
	
	int o=j.intValue();           //unboxing
	
	//int o=value();               // auto unboc=xing
	

	System.out.println(o);
	
	String str="125";
	
	int n=Integer.parseInt(str);     // parsint method used to convert string to int
	System.out.println(n);
	
}
	
	
}
