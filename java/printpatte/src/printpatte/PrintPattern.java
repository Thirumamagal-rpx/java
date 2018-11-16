package printpatte;


import java.util.Scanner;

//4  3  2  1  2  3  4  
//
//   3  2  1  2  3  
//
//      2  1  2  
//
//         1  
//
//      2  1  2  
//
//   3  2  1  2  3  
//
//4  3  2  1  2  3  4  
//
//5  4  3  2  1  2  3  4  5  

class PrintPattern {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter a number n :\n");
		 			int n = in.nextInt();
		 			System.out.println("\n");
		//int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("   ");
			}
			for (int k = i; k >= 1; k--) {

				System.out.print(k + "  ");

			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l + "  ");
			}

			System.out.println("\n");

		}

		for (int i = 2; i <= n; i++) {
			for (int k = n - 1; k >= i; k--) {
				System.out.print("   ");
			}
			for (int j = i; j >= 1; j--) {

				System.out.print(j + "  ");

			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l + "  ");
			}
			System.out.println("\n");
in.close();
		}
	}
}
