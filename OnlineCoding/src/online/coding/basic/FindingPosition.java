package online.coding.basic;

import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while ((t--) > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n + 1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			position(arr, n + 1);
	 	}

	}

	 static void position(int arr[], int size) {
         
		if (size % 2 != 0) {
			size = (size / 2) + 1;
		} else {
			size = size / 2;
		}
		int b[] = new int[size];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				b[j] = arr[i];
				j++;
			}
		}
		if (b.length != 2) {
			position(b, b.length);
		}
		if (b.length == 2)	{
		  System.out.println(b[1]);
           }
	}
}

/*
 * for (int i = 0; i <= n; i++) { System.out.print( i+" "+ arr[i]+" "); }
 * System.out.println();
 */