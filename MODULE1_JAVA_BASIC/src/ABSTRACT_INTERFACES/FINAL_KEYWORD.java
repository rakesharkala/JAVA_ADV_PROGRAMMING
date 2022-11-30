package ABSTRACT_INTERFACES;
// WE CAN USE FINAL WITH VARIABLES ,METHODS ,CLSS
// WHEN ITS FINAL IT NOT ACCESS ANYTHING ===> CREDIT

 final class fdemo
{
	final int j=8;
   public void syso() 
   {
	  // j=10;
	System.out.println("this is used final keyword");
}	
}                                       
////                                it give error we cant acces
//class childs1 extends fdemo
//{
//
//}
public class FINAL_KEYWORD 
{
public static void main(String[] args) 
{
	fdemo o=new fdemo();
	o.syso();
	
}
}
