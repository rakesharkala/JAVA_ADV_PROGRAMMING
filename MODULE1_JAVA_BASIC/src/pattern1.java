
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				
				if(j==1||j==i) 

				System.out.print(j + " ");
				else
					System.out.print("  ");
			}
		
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if(j==1||j==i)
				System.out.print(j + " ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

	}
}