package online.coding.basic;

import java.util.Scanner;

public class hello {

public static void main(String aegs[]) {
    Scanner sc = new Scanner(System.in);
 long k = sc.nextLong();
 long n = sc.nextLong();
 long arr[] = new long[(int) n];
 for(long i=0;i<n;i++) {
  arr[(int) i]=sc.nextLong();   
   }
       long j, max; 

     for (long i = 0; i <= n - k; i++) { 

         max = arr[(int) i]; 

         for (j = 1; j < k; j++) { 
             if (arr[(int) (i + j)] > max) 
                 max = arr[(int) (i + j)]; 
         } 
         System.out.print(max + " "); 

     }
 }
}
