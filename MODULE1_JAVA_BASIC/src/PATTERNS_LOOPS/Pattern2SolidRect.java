package PATTERNS_LOOPS;

import java.util.Scanner;

public class Pattern2SolidRect {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n value to print pattern :");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
