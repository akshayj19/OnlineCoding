package online.coding.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class AddBIgInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while((t--)>0) {
	  BigInteger x= sc.nextBigInteger();
	  BigInteger y= sc.nextBigInteger();
			
	  MathematicalOperation obj= new MathematicalOperation();
	  System.out.println(obj.mod( x , y)); 
		}
	}
}

class MathematicalOperation{
    
    static BigInteger mod(BigInteger x, BigInteger y){
    
    BigInteger z;
     z =  y.remainder(x);
     return z;
    }
}