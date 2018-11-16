package swap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Swwapp {

    // Complete the swapToSort function below.
   static int swapToSort(int[] a,int n) {
        // array cannot be sorted in a single swap
      // ArrayList<int> a = new ArrayList<int>();
       for(int i=0; i < a.length; i++)
{
            i = a[a.length - 1];
                int j = a.length - 1;  
    if(a[j] >= i && a[j - 1] >= i)
    {
         
        int temp = a[i-1];
        a[i-1] = a[i];
        a[i]=temp;
    }
     // a[j] = i;
    {
     if (a[n] < n){
     return 1;    
     }
    
        else{
      if(a[n-1] < a[n-2]){
     return -1;
 
   
}
           } 
 
 }
  //return 0;  
}
       return -1;
   }     
  
 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result1 = swapToSort(a,n-1);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//        bufferedWriter.close();

        scanner.close();
    }

}

