package PROBLEM_SOLVING;
import java.util.Scanner;

public class MIN_MAX_ARRAY_1_EXCLUDE 
{
	    public static void main (String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int a[]=new int[5];
	        int sum=0;
	        int min=1,max=0;
	        for(int i=0;i<a.length;i++)
	        {
	         a[i]=sc.nextInt();   
	        }
	        for(int i=0;i<a.length;i++)
	        {
	        	sum=0;
	            for(int j=0;j<a.length;j++)
	            {
	                if(i==j)
	                {
	                    sum=sum+a[j];
	                }   
	            }
	            if(min<sum)
	                {
	                    min=sum;
	                }
	                if(max>sum)
	                {
	                    max=sum;
	                }
	        }
	        System.out.println(min+" "+max);
	        
	    }
	}
