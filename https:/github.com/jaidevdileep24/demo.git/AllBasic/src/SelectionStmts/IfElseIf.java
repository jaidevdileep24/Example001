package SelectionStmts;
import java.util.*;


public class IfElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkWeakDay(n));
	}
	public static String checkWeakDay(int n) {
		String nwd = "12345";
		String wd = "67";
		if(nwd.contains(String.valueOf(n))) {
			return "Non-WeakDay";
		} else if(wd.contains(String.valueOf(n))) {
			return "Weak-day";
		} else {
			return "Invalid input";
		}
	}
}
