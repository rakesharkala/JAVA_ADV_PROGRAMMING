package CLASSES_METHODS;


class Var
{
	
	public int show(int ... i)  // it will store collection of ele ,act as array
	{
		int sum=0;
		
		for( int j:i)        // act as array so we need loop to store ele from array
		{
			sum+=j;
			System.out.println(j);   // not work j[0];
		}
		
		
		return sum;
	}
	
}
public class VARARGS_TYPE_OF_ARRAY
{
	public static void main(String ... args)
	{
		Var obj=new Var();
		int s=obj.show(1,2,5 ,10);
		System.out.println(s);
		
	}

}
