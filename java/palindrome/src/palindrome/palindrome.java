package palindrome;

import java.util.Scanner;
 class palindrome
{

/**
 * @param str
 */
public static boolean isPalind(String str) 
// 448020
{
	
//String reverse="";
//
//for(int i = str.length() - 1; i >= 0; i--)
//{
//    reverse = reverse + str.charAt(i);
//}
//
//			if(str.equals(reverse)) {
//				return true;
//			}
//	
//	else {
//	return false;
//	}
//}


//258944
//int limit = str.length() - 1;
//char st1 [] = str.toCharArray();
//for( int i = 0 ,j = limit; i < j ;i++,j--)
//{
//    if(st1[i] == st1[j])
//    {
//    	return true;
//           
//    } else {
//        
//    }
//    }
//return false;
//}

//int result = 0;
//int remainder;
//
//while (str.length()<str.length())
//	if(str.equals(reverse))
//{
//    int number = 0;
//	remainder = number % 10;
//    number = number / 10;
//    result = result * 10 + remainder;
// }
//return true;
//	
//
//}

	//245917
int length = str.length();
if (str.isEmpty() || length == 1) 
    return true;
return str.charAt(0) != str.charAt(length - 1) ?  false : isPalind(str.substring(1,length - 1));
} 


 //239207
//	 int left = 0;
//	    int right = str.length() - 1;
//
//	    while (left < right) {
//	        if (str.charAt(left) != str.charAt(right))
//	            return false;
//	        left++;
//	        right--;
//	    }
//	    return true;
//}

public static void main(String[] args)
{

	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter a string to see if it is a palindrome or :");
	 
	long startTime = System.nanoTime();
	 String str=scan.nextLine();
	 scan.close();
	
	 System.out.println(palindrome.isPalind(str));
 long endTime = System.nanoTime();
     
    System.out.println("Difference : " + (endTime - startTime));
}

}
    
   
  

