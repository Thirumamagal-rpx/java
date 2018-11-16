package sort;

//618013404
import java.util.Scanner;

public class quicksort {
	static int part(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (a[j] <= pivot) {
				i++;
				int t = 0;
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i + 1];
		a[i + 1] = a[high];
		a[high] = t;
		printArray(a);
		System.out.print("\n");
		return i + 1;
	}

	static void sort(int a[], int low, int high) {
		if (low < high) {
			int pi = part(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}

	}

	static void printArray(int a[]) {
		for (int n : a) {
			System.out.print(n + " ");
			System.out.print("");
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		// String[] arrItems = in.nextLine().split(" ");
		long startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			// int arrItem = Integer.parseInt(arrItems[i]);
			a[i] = in.nextInt();

		}
		if (n > 1)
			sort(a, 0, n - 1);
		in.close();
		long endTime = System.nanoTime();
		System.out.println("Difference : " + (endTime - startTime));
	}
}
