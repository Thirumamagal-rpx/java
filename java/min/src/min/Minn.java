package min;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Minn {
	private static int minimumSum(int[] l, int[] r, int n) {
	   Arrays.sort(l);
       Arrays.sort(r);
       
       int result = 0;
       for (int i = 0; i < n; i++)
           result += (l[i] - r[i - 1]);

       return result;
}

public static void main(String[] args) throws IOException {
   // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	
	Scanner scanner = new Scanner(System.in);

	int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] l = new int[n];

    String[] lItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
        int lItem = Integer.parseInt(lItems[i]);
        l[i] = lItem;
    }

    int[] r = new int[n];

    String[] rItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
        int rItem = Integer.parseInt(rItems[i]);
        r[i] = rItem;
    }

    long result = minimumSum(l, r,n);
   

    scanner.close();
}
}
