package STRING_BUILDER_;

import java.util.Scanner;

public class Operations_on_sb {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		StringBuilder sb=new StringBuilder("rakesh arkala");
		//get single charecter from ||
		
		System.out.println(sb.charAt(0));
		
		// set a char in string 
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		
		//insert 
		
		System.out.println(sb.insert(5, "***"));
		
		//delete
		
		System.out.println(sb.delete(5, 8));
		sb.setCharAt(0,'R');
		System.out.println(sb);
		
		//append
		StringBuilder app=sb.append("  Lerner");
		System.out.println(app);
		
		System.out.println();
		
		System.out.println("The length of String :"+sb.length());
		
		
	}

}
