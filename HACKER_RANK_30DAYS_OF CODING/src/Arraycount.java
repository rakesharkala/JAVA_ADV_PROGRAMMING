

	import java.util.*;
	import java.util.Scanner;

	public class Arraycount {
	    
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        
	        int n=sc.nextInt();
	        int array[]=new int[40];
	        int count=0;
	        for(int i=0;i<n;i++ ){
	            array[i]=sc.nextInt();
	            count+=array[i];
	            
	        }
	        
	        System.err.println(count);
	        
	    }
	}

