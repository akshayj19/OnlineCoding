package online.coding.basic;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    while((t--)>0) {
		    	 int n=sc.nextInt();
		         char[] a={'@', '#', '$', '%', '^', '&', '~', '*', '!'};
		         char arr[] = new char[n];
			     char[] c=new char [n];
		         int k=0;
		         String inp;
		         System.out.println("Enter character array: ");
		         inp = sc.next();
		         for(int i=0; i<n; i++)
		         	arr[i] = inp.charAt(i);
		         
		         for(int i=0;i<a.length;i++) {
			    	    for(int j=0;j<n;j++) {
			    	     if(a[i]==arr[j]) {
			    	    c[k]=a[i];
			    	       k++;
			    	       }
			    	     }
			    	  }
		         for(int i=0;i<n;i++) {
		         System.out.println(c[i]);
		         }
		    }
	}

}
