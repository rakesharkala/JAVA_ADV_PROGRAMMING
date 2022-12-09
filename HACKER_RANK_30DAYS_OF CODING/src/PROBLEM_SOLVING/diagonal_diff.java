package PROBLEM_SOLVING;

import java.util.Scanner;

public class diagonal_diff {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int sum = 0, sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (i == j) {
					sum += a[i][j];
				}
				if (i == n - j - 1) {
					sum1 += a[i][j];
				}
			}
		}

		int f = sum - sum1;
		f=Math.abs(f);   // used to convert to positive value if any type 
		System.out.println(f);
	}

}
