
import java.util.*;
import java.util.Scanner;

public class practice22 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value :");
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0;
		int add = 0;
		int zeros = 0;
		
		System.out.println(" enter the valus : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			}
		
			int a1 = count / n;
			int a2 = add / n;
			int a3 = zeros / n;
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);

		}

	}
