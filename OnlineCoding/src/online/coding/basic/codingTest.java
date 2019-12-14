package online.coding.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codingTest {

	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String input = br.readLine();
    String[] integersInString = input.split(" ");
    int a[] = new int[integersInString.length];
    for (int i = 0; i < integersInString.length; i++) {
        a[i] = Integer.parseInt(integersInString[i]);
    }
	System.out.println(a[0]);	
	System.out.println(a[1]);	
	}

}
