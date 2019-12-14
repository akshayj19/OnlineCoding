package online.coding.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while ((t--) > 0) {
			int n = sc.nextInt();
			n=n+1;
			String s[] = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextLine();
			}
			 Arrays.sort(s);
		System.out.println(s[1]+" "+s[n-1]); 
		//	System.out.println(Arrays.toString(s));
		}

	}
}
/*
 * for(int i=0;i<s.length-1;i++) { for(int j=0;j<s.length-1;j++) {
 * if(s[j].compareTo(s[i])>0) { String temp = s[j]; s[j] = s[i]; s[i] = temp; }
 * } }
 */
 
