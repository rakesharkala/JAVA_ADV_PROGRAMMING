//import java.util.*;
//import java.util.Scanner.*;
//
//class day2{
//    
//  public static void main(String args[]){
//      
//      Scanner sc=new Scanner(System.in);
//      
//      System.out.println(" Enter meal cost");
//      double c=sc.nextDouble();
//      
//      System.out.println("enter the tip ");
//      int tip=sc.nextInt();
//      
//      System.out.println(" enter the tax on food ");
//      int tax=sc.nextInt();
//      
//      double tiptotal=(c/100)*tip;
//      double taxtotal=(tax/100)*c;
//      
//      double tot=tiptotal+taxtotal;
//      
//      double total=tot+c;
//      System.out.println("the total cost of food : "+ total);
//      
//      
//      
//      
//        
//    }
//}






import java.util.*;
import java.util.Scanner.*;

class day2{
    
  public static void main(String args[]){
      
      Scanner sc=new Scanner(System.in);
      
    //  System.out.println(" Enter meal cost");
      double c=sc.nextDouble();
      
     // System.out.println("enter the tip ");
      int tip=sc.nextInt();
      
    //  System.out.println(" enter the tax on food ");
      int tax=sc.nextInt();
      
      double tiptotal=(c/100)*tip;
      double taxtotal=tax/100*c;
      
      double tot=tiptotal+taxtotal;
      
      double total=tot+c;
      System.out.println(taxtotal);
      
      System.out.println(Math.round(total));
      
      
      
      
        
    }
}
