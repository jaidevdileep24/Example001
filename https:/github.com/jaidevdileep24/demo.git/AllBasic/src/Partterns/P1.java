package Partterns;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		impli1(n);
		System.out.println();
		impli2(n);
		System.out.println();
		impli3(n);
		System.out.println();
		impli4(n);
		System.out.println();
		impli5(n);
		System.out.println();
		impli6(n);
		System.out.println();
		impli7(n);
		System.out.println();
		impli8(n);
		System.out.println();
		impli9(n);
		System.out.println();
		impli10(n);
		System.out.println();
		impli11(n);
		System.out.println();
		impli12(n);
	}
	
	public static void impli1(int n) {
		for(int i = 0;i<n;i++) System.out.println("*");
	}
	
	public static void impli2(int n) {
		for(int i = 0;i<n;i++) System.out.println("*".repeat(n));
	}
	
	public static void impli3(int n) {
		for(int i = 1;i<=n;i++) System.out.println(String.valueOf(i).repeat(n));
	}
	
	public static void impli4(int n) {
		for(int i = 1;i<=n;i++) System.out.println("*".repeat(i));
	}
	
	public static void impli5(int n) {
		for(int i = 1;i<=n;i++) {
			IntStream.range(1, i+1).forEach(j -> System.out.print(j + " "));
			System.out.println();
		}
		
	}
	
	public static void impli6(int n) {
		for(int i = n;i>=1;i--) {
			IntStream.range(1, i+1).forEach(j -> System.out.print(j + " "));
			System.out.println();
		}
		
	}
	
	public static void impli7(int n) {
		for(int i = n;i>=1;i--) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i));
		}
	}
	
	public static void impli8(int n) {
		for(int i = 1;i<=n;i++) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i));
		}
	}
	
	public static void impli9(int n) {
		for(int i =1;i<=n;i++) {
			System.out.print(" ".repeat(n-i));
			System.out.println("* ".repeat(i));
		}
	}
	
	public static void impli10(int n) {
		for(int i = 1;i<=n;i++) {
			System.out.print(" ".repeat(n-i));
			System.out.println("* ".repeat(i));
		}
		for(int i = n-1;i>=1;i--) {
			System.out.print(" ".repeat(n-i));
			System.out.println("* ".repeat(i));
		}
	}
	
	public static void impli11(int n) {
		for(int i = 1;i<=n;i++) {
			if(i==1 || i==n) {
				System.out.println("*".repeat(n));
			} else {
				System.out.print("*");
				System.out.print(" ".repeat(n-2));
				System.out.println("*");
			}
		}
	}
	
	public static void impli12(int n) {
		int s = 1;
		for(int i = n;i>=1;i--) {
			if(i==n) {
				System.out.print(" ".repeat(n-1));
				System.out.println("*");
			} else {
				System.out.print(" ".repeat(i-1));
				System.out.print("*");
				System.out.print(" ".repeat(s));
				System.out.println("*");
				s += 2;
			}
		}
		s -=4;
		for(int i = 1;i<n;i++) {
			if(i==(n-1)) {
				System.out.print(" ".repeat(i));
				System.out.println("*");
			} else {
				System.out.print(" ".repeat(i));
				System.out.print("*");
				System.out.print(" ".repeat(s));
				System.out.println("*");
				s -=2;
			}
		}
		
	}

}
