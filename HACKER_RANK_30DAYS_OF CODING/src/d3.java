
import java.util.*;
import java.util.Scanner;

class d3{
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
       
        if(n%2==0&&n>2&&n<5&&n>20){
            System.out.println("Not Weird");
        }
    
        }
        
    
}