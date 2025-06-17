package SelectionStmts;
import java.util.*;
public class CMul5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(impli(sc.nextInt()));
		int t = sc.nextInt();
		checkT(t);
		System.out.println("Program ended");

	}
	
	public static boolean  impli(int num) {
		if(num%5==0) 
			return true;
		else
			return false;
		
	}
	
	
	public static void checkT(int t) {
		if(t>35) 
			System.out.println("hot");
	}

}
