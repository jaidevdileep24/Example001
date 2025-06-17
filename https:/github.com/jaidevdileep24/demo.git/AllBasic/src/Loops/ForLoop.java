package Loops;

//for(initialisation , condition, update) {}
//Iterating a list to count the number of elements.
import java.util.*;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sumNNum(n));

	}
	
	public static int sumNNum(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum += i;
		}
		
		int nsum = n*(n+1)/2;
		System.out.println(nsum);
		return sum;
		
		
	}

}
