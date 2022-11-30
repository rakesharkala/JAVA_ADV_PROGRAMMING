package CLASSES_METHODS;

class calc
{
	int num1,num2;
	 
	public calc(int n1,int n)
	{
		this.num1=(n1+n);
		this.num2=n-n1;
		System.out.println(num1+"   "+num2);
		System.out.println(n1+"    "+n);
		
	}
	
}

public class THIS_KEYWORD 
{
	
	public static void main(String[] args)
	{
		// THIS KEY WORD MAINLY USED TO SPECIFY THE INSTANCE VARIABLE WHEN LOCAL VARIABLE 
		// AND INSTANCE VARIBLE AS SAME VARIABLE NAME
		
		calc s=new calc(5,9);
		
	}

}
