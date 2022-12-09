import java.util.*;
import java.util.Scanner;

class practice11{
    
    public static void main(){
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        long  count=0;
        
        long array[]=new long[100];
        
        
        for(int i=0;i<n;i++){
            
            array[i]=sc.nextLong();
            
            count+=array[i];
        }
        System.out.println(count);
    }
}