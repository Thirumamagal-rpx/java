package palindrome;
import java.util.Scanner;

//public class Palindr{
//
//
//
//	public static String revers(String str) {
//        StringBuilder reversed = new StringBuilder(str.length());
//        for (int i = str.length(); i > 0; i--) {
//            reversed.append(str.charAt(i - 1));
//        }
//		return str;
//    }
//        private static String removeSpace(String aword) {
//            StringBuilder buffer = new StringBuilder();
//               for (int i = 0; i < aword.length(); i++)   {
//                if(aword.charAt(i) != ' ') 
//{
//                    buffer.append(aword.charAt(i));
//                }
//            }
//		return buffer.toString();
//    
//    }
//
//
//public static void main(String args[]) {
//	Scanner in = new Scanner(System.in);
//    System.out.println("Please enter the string: ");
//    String str=removeSpace(in.nextLine()) ;
//        String reversed = revers(str);
//   in.close();
//    if (str.equals(reversed)) {
//        System.out.println("The string " + str + " is a palindrome");
//    }
//    else {
//        System.out.println("The string " + str + " is not a palindrome");
//    }
//    
//}
//
//}
//233287
	class Palindr
	{
	 public static void main(String args[])
	 {
	  String original, reverse = "";
	  Scanner in = new Scanner(System.in);

	  System.out.println("Enter a string to check if it is a palindrome");
	  original = in.nextLine();

	  int length = original.length();

	  for ( int i = length - 1; i >= 0; i-- )
	     reverse = reverse + original.charAt(i);
		 System.out.println(System.nanoTime());
	  if (original.equals(reverse))
	     System.out.println("Entered string is a palindrome.");
	  else
	     System.out.println("Entered string is not a palindrome.");
		 System.out.println(System.nanoTime());

	 }
	} 

