package sort;
//insertion sort
//1657872
import java.util.Scanner;

//public class solution {
//	 
//    public static void main(String a[]){
//        int[] arr1 = {10,34,2,56,7,67,88,42};
//        int[] arr2 = doInsertionSort(arr1);
//        for(int i:arr2){
//            System.out.print(i);
//            System.out.print(", ");
//        }
//    }
//     
//    public static int[] doInsertionSort(int[] input){
//         
//        int temp;
//        for (int i = 1; i < input.length; i++) {
//            for(int j = i ; j > 0 ; j--){
//                if(input[j] < input[j-1]){
//                    temp = input[j];
//                    input[j] = input[j-1];
//                    input[j-1] = temp;
//                }
//            }
//        }
//        return input;
//    }
//}


//public class solution {
//
//    // Complete the insertionSort1 function below.
//    
//       static void insertionSort1(int n, int[] arr) {
//        int arrItem; 
//        for (int i = 1; i < n; i++ ){
//         
//           for(int j = i ; j > 1 ; j--){
// 
//               if(arr[j] < arr[j-1]){
//                    arrItem = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = arrItem;
//                
//       
//    }
//               System.out.print(arr[j] +  " ") ;  
//               System.out.print("");        
//           }}  
//        }
//       
//
//
//       public static void main(String[] args) {
//           Scanner scanner = new Scanner(System.in);
//
//           int n = scanner.nextInt();
//           scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//           int[] arr = new int[n];
//
//           String[] arrItems = scanner.nextLine().split(" ");
//           scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//           for (int i = 0; i < n; i++) {
//              int arrItem = Integer.parseInt(arrItems[i]);
//               arr[i] = arrItem;
//           }
//
//           insertionSort1(n, arr);
//        scanner.close();
//          }
//
//}

public class solution {

    // Complete the insertionSort1 function below.
    
       static void insertionSort1(int n, int[] arr) {
    	   int i = arr[arr.length - 1];
           int j = arr.length - 1;                 //for finding the last number in an array
           while (arr[j] >= i && arr[j - 1] >= i) {            
                   arr[j] = arr[j - 1];
                   j--;
                   printArray(arr);
                   if (j == 0)
                           break;
           }
           arr[j] = i;
           printArray(arr);
  
   }

   static void printArray(int[] arr) {
         for(int n: arr)                                             //for each loop
                  System.out.print(n+" ");
           System.out.println("");
   }

    
  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int[] arr = new int[n];

      String[] arrItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      long startTime = System.nanoTime();
      for (int i = 0; i < n; i++) {
    	 
         int arrItem = Integer.parseInt(arrItems[i]);
          arr[i] = arrItem;
      }

      insertionSort1(n, arr);
       scanner.close();
       long endTime = System.nanoTime();
       System.out.println("Difference : " + (endTime - startTime));}
    

    }

