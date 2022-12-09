
import java.util.*;
import java.util.Scanner;

class practice2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int count = 0;

		int a[] = new int[10];

		System.out.println("Enter array numbers :");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < 5; i++) {
			
			if(a[i]==i) {
				continue;
				
			}else {
				
			}
   
			System.out.println(a[i]);
	
			
		}
		
		
	
		System.out.println(count);

	}
}