package online.coding.basic;

import java.util.Scanner;

public class GoogleMirrorChange {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while((t--)>0) {
    	 int n=sc.nextInt();
         int[][] a=new int[n][n];
    //	System.out.println("enter the values");
         for(int i=0;i<n;i++) {
    	    for(int j=0;j<n;j++) {
    	      a[i][j]=sc.nextInt(); 
    	     }
    	  }
    	for(int i=0;i<n;i++) {
     	    for(int j=0;j<n;j++) {
     	      System.out.print(a[i][j]+" "); 
     	     }
  	      System.out.println();  
    	}
    	for(int j=0;j<n;j++) {
     	    for(int i=n-1;i>=0;i--) {
     	  	  System.out.print(a[i][j]+" ");
     	    }
    	  System.out.println();
    	  }
    	
        }

	}
}
