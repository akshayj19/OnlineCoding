package online.coding.basic;

import java.util.Arrays;
import java.util.Scanner;

public class maximumHeight {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int brr[] = new int[1000];
    int	pro=0,l=0;
    for(int i=0;i<n;i++) {
     a[i]=sc.nextInt(); 	
      }
    Arrays.sort(a);	
    for(int i=0;i<n;i++) {
    	  for(int j=0;j<n;j++) {
    		  for(int k=0;k<n;k++) {
    				pro=a[i]*a[j]*a[k]; 
    		 brr[l]=pro;
    		 l++;
    	 pro=0;
    		  }
    	  }
    	  }
    Arrays.sort(brr);
    for(int i=0;i<1000;i++) {
    	  System.out.println(brr[i]);  
    }
    
   /* if(n<3) {
    	System.out.println(-1);	
    }else {
    	  System.out.println(brr[n-1]);  	
    }*/
  

    }
}
/*
 * pro=b*c*d; b=c;c=d;d=a[i]; brr[j]=pro; j++; pro=0;
 */

/*
 * int b=a[n-1]; int c=a[n-2], d=a[n-3]; pro=b*c*d;
 */

/*
		 * for(int k=1;k<n;k++) { int b=a[i]; int c=a[i+1]; //int d=a[i+2]; int
		 * pro=1,j=0; pro=b*c; b=c;c=a[i]; brr[j]=pro; j++; pro=0; }
		 */

/*
 * Arrays.sort(brr); for(int i=2;i<n;i++) { System.out.println(brr[i]+" "); }
 */ 