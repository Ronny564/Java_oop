package searchingSorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[5];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Enter Array Value");
			A[i] = sc.nextInt();
		}
		System.out.println("Enter Search Key word");
		int key = sc.nextInt();

		int f = 0;
		int l = A.length - 1;
		int mid;
		while (f <= l) {
			mid = (f + l) / 2;

			if (key == A[mid]) {
				System.out.println(key + " is found at " + mid);
				break;
			} else if (key > A[mid]) {
				f = mid + 1;
			} else if (key < A[mid]) {
				l = mid - 1;
			}
		}
		if(f>l)
			System.out.println(key + " is not found");

	}

}
