import java.util.Scanner;

class DAY6{
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t  = in.nextInt();
        in.nextLine();
        
        while(t > 0){
            String s = in.nextLine();
            for(int i =0; i< s.length();i++){
                char ch = s.charAt(i);
                if(i % 2 == 0){
                    System.out.print(ch);
                }
            }
            
            System.out.print(" ");
            
             for(int i =1; i< s.length();i++){
                char ch = s.charAt(i);
                if(i % 2 != 0){
                    System.out.print(ch);
                }
            }
            System.out.println("");
            
            t--;
        }
        
        
        
        
}}