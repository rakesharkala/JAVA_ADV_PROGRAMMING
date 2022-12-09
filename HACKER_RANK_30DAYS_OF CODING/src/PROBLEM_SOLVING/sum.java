package PROBLEM_SOLVING;
	
	import java.util.Scanner;

	class operation 
	{
	    int sum1,sum2,i,j;
	    public int sum()
	    {
	        Scanner sc=new Scanner(System.in);
	        
	        //INPUT TAKING
	        int a[][]=new int[6][6];
	        
	        for(int i=0;i<a.length;i++)
	        {
	            for(int j=0;j<a.length;j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	        }
	        
	        // DIVIDE AND HOUR GLS
	        for( i=0;i<a.length/2;i++)
	        {
	            for( j=0;j<a.length/2;j++)
	            {
	               sum1=a[i][j]+a[i][j+1]+a[i][j+2]+a[i][j+3];
	            }
	        }
	          for( i=0;i<a.length/2;i++)
	        {
	            for( j=0;j<a.length/2;j++)
	            {
	               sum2=a[i][j]+a[i][j+1]+a[i][j+2]+a[i][j+3];
	            }
	        }
	        int maxsum=Math.max(sum1, sum2);
	       return maxsum;
	    }
	    
	}


	class sum
	{
	    public static void main(String args[])
	    {
	        
	        operation ob=new operation();
	       int s= ob.sum();
	       System.out.println(s);
	        
	    }
	}


