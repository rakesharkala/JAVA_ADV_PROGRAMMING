package FUNCTIONS;

import java.util.Scanner;

public class EvenOdd {

	

	public static void main(String[] args) {     // main method

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n value :  ");
		int n = sc.nextInt();

		Evenodd(n);   // we can cl static methods directly when its in same cls but dif method
	}		        	// when its not static we can use cls name here also no need of OBJ
	
	
	
	public static void Evenodd(int a) {      // sub method   // function

		if (a % 2 == 0) {
			System.out.println("Even number !!  ");

		} else {
			System.out.println("Odd number !!  ");
		}

	}

}
