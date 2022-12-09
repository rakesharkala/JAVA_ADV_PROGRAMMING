import java.util.Scanner;

public class fibanociseries {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int a=0,b=1,res;
		
		System.out.print(a+" "+b +" ");
		
		for(int i=0;i<n;i++) {
			res=a+b;
			a=b;
			b=res;
			System.out.print(res+" ");
		}
		
		
	}
}
