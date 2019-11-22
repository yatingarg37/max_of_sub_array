package assignments;

import java.util.Scanner;

public class sub_array {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		for (int i = 0; i < n - k + 1; i++) {
			int max = arr[i];
			for (int j = i; j < i + k; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			System.out.println("Max Element of sub-array :" + max);
		}
	}
}
