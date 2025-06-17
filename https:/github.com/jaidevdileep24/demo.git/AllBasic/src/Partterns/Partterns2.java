package Partterns;
import java.util.*;
public class Partterns2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int n = sc.nextInt();
		impli1(c);
		impli2(n);
	}
	
	public static void impli1(char c) {
		for(char i = 'A';i<= c;i++) {
			System.out.println(String.valueOf(i).repeat(i - 'A' + 1));
		}
	}
	
	public static void impli2(int n) {
		int sc = 1;
		for(int i = n;i>=1;i--) {
			System.out.print(" ".repeat(i));
			System.out.println("*".repeat(sc));
			sc += 2;
		}
	}
	
	public static void impli4(char c) {
		for(char i='A';i<=c;i++) {
			System.out.println(String.valueOf(i).repeat(i - 'A' +1));
		}
	}
	
	

}
