package Loops;
import java.util.*;
//the while loop lets u repeat as long as the condition true
//Benefits:-  UnKnown number of iterations, simple and flexible,keeps code clean.
public class WhileLoop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fact(n));
	}
	
	public static int fact(int n) {
		int f = 1;
		while(n>1) {
			f *= n--;
		}
		return f;
	}

}
