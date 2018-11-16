package soort;

import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
	static int swapToSort(int[] a) {
        // Return -1 or 0 or 1 as described in the problem statement.

  

	      int count=0;
	        int b[]=new int[a.length];
	        b=a.clone();
	        Arrays.sort(b);
	        if(Arrays.equals(a,b))
	        {
	            return 0;
	        }
	        else
	        {
	        for(int i=0;i<a.length-1;i++)
	        {
	            if(a[i]<=a[i+1])
	                continue;
	            else
	                count++;
	        }
	        if(count==2||count==1)
	          return 1;    
	        else
	            return -1;
	        }          
	    }
	        

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] a = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    for (int i = 0; i < n; i++) {
  	 
       int arrItem = Integer.parseInt(arrItems[i]);
        a[i] = arrItem;
    }

    swapToSort(a);
     scanner.close();
    }
  

  }

