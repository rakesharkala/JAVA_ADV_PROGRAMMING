package JDBC_;

import java.util.Scanner;


import java.awt.geom.Arc2D.Double;
import java.sql.*;

public class STUDENT_CURD_OP 
{
	

	public static void main(String[] args)
	{
	curd_operations2 ob=new curd_operations2();
		
		Scanner sc=new Scanner(System.in);
		int ch = 0;
		
		do {
			System.out.print("ENTER UR CHOICE :  ");
			System.out.println("\n==========================\n");
			
			System.out.println("1 FOR INSERT   : ");
			System.out.println("2 FOR DISPLAY  : ");
			System.out.println("3 FOR UPDATE   : ");
			System.out.println("4 FOR DELETE   : ");
			System.out.println("5 EXIT");
			ch=sc.nextInt();
			
			switch (ch)
			{
			case 1:
				ob.insertData();
				break;
			case 2:
			    ob.displayData();
			    break;
			case 3:
				ob.updateData();
				break;
				
			case 4:
				ob.deleteData();
				break;
			default :
				System.out.println("THANK YOU VISIT AGAIN ");
			
				
			}
		}
			while (ch<5);
		}
			
			public Connection getConnect() {                 // method to avoid rewritting first 2steps
			
			try
			{
				
				String url="jdbc:mysql://localhost:3306/student_info";     
				String uname="root";
				String pass="7032248200@Aa";                                                //this common to all steps
				
				Class.forName("com.mysql.cj.jdbc.Driver");                                  //2nd step loading drivers nd register
				Connection con=DriverManager.getConnection(url,uname,pass);					//3rd create connection							//forname responsible for load
			
//				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				Connection con=DriverManager.getConnection("jdbc.mysql://localhost/3306/student_info","root","7032248200@Aa");
				
				return con;
				
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			return null;
			
	}
			
				
		
}
