package online.coding.basic;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMidElementStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> st1 = new Stack<Integer>();
		int sizeofstack=6;
		int mid = (int) Math.ceil(sizeofstack/2);
        int a[] = new int[6];
        
		for(int i=0;i<sizeofstack;i++) {
	      a[i]=sc.nextInt();
	      st.push(a[i]);
		}
      
      for(int i=sizeofstack-1;i>=0;i--) {
	       if(i==mid) {
	    	int x=st.peek();
	    	st.pop();
	       }else {
	    	   int y=st.peek();
	    	    st1.push(y);
		    	st.pop();
	       }
		}
		/*
		 * for(int i=sizeofstack-1;i>0;i--) { int p=st1.peek(); System.out.print(p+" ");
		 * st1.pop(); }
		 */
      System.out.println(st1);
      while (!st1.isEmpty())
      {
          System.err.println(st1.pop());
      }
      System.out.println(st1);
	}

}
