  import java.util.*;
  import java.util.Scanner;
  
  class Arraydemo{
     
      public static void main(String args[]){
          
        Scanner sc=new Scanner(System.in);
        
        
        int a[]=new int[6];
        for(int i=0;i<=5;i++){
            a[i]=sc.nextInt();
            
        
            
        }
        
        for(int i=0;i<=5;i++) {
        	System.out.print(a[i]+" ");
        }
      }
  }