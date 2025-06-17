package Loops;
import java.util.*;
// do { //block of code} while(condition);
// the do-while loop is a control flow statement that executes the block of code at least once then it repeatedly executes the block of code until the condition is true.
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String l = sc.next();
		
//		do {
//			System.out.println(l);
//			l = sc.next();
//		} while(!l.equals("java"));
		
		System.out.println(fact(sc.nextInt()));
	}
	
	public static int fact(int n) {
		int f = 1;
		do {
			f *= n--;
		} while(n>1);
		return f;
	}
	
	

}
