package ANONYMOUS_CLS_LAMDA_EXP;

public class LAMDA_EX {
	
	

		public static void main(String[] args) 
		{
//			abcx obj= ()-> {
//				             System.out.println("this is lamda");
//			              };
//			
//					obj.show();
			
			
			abcx obj= ()-> System.out.println("this is lamda");

		     obj.show();
		}

	}

@FunctionalInterface
interface abcx
{
	void show();
}