package ABSTRACT_INTERFACES;

//cant define methods cant create obj

interface  Writter
{
	public void writter();
}


class pen implements Writter
{


	@Override
	public void writter() {
		System.out.println("i am pen");
		
	}
}
class pencil implements Writter
{
	public void writter()
	{
		System.out.println("this is pencil cls");
	}
	
}
class kit
{
	public void dosome (Writter p)
	{
		p.writter();
	}
}
public class INTERFACES_DEMO
{
	public static void main(String[] args) 
	{
		kit k=new kit();
		
		 
		Writter p=new pen();
		Writter pc=new pencil();
		
		k.dosome(pc);
		k.dosome(p);
		
	}

}
