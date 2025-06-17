package NumberPrograms;
import java.util.*;
public class NumberPrograms1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		impli1(n);
//		char c = sc.next().charAt(0);
//		VowelConso(c);
		int n = sc.nextInt();
		int b = sc.nextInt();
//		checkArm(n);
//		DecimalBin(n);
//		fib(n);
//		gcd(n,b);
//		perfectSquare(n);
//		System.out.println(primeCheck(n));
//		rangeNumPrime(n,b);
//		nnumPrime(n);
		swap(n,b);
	}
	
	public static void impli1(int n) {
		if(n<0) 
			System.out.println("Negative");
		else if(n >0)
			System.out.println("Positive");
		else
			System.out.println("zero");
	}
	
	public static void leapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) 
			System.out.println("Leap year");
		else
			System.out.println("Non leap year");
		
	}
	
	public static void vowelConso(char c) {
		String ov = "aeiouAEIOU";
		String dg = "0987654321";
		
		if(ov.contains(String.valueOf(c))) 
			System.out.println("vowel");
		else if(dg.contains(String.valueOf(c)))
			System.out.println("digit");
		else
			System.out.println("Consonent");
	}
	
	public static void checkArm(int n) {
		String s = String.valueOf(n);
		int sum = 0;
		for(char c:s.toCharArray()) {
			sum += Math.pow(Character.getNumericValue(c), s.length());
		}
		System.out.println(sum);
		if(sum == n) 
			System.out.println("Armstrong");
		else
			System.out.println("Not an ArmStrong");
	}
	//10/2->0
	//5/2-->1
	//2/2 -->0
	
	public static void DecimalBin(int n) {
		String bin = "";
		while(n>0) {
			int d = n%2;
			bin =  String.valueOf(d) + bin;
			n /= 2;
			
		}
		System.out.println(bin);
	}
	
	public static void fib(int n) {
		int a = 0,b =1;
		System.out.println(a + "\n" + b);
		n -= 2;
		while(n>0) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			n--;
		}
	}
	
	public static void gcd(int a,int b) {
		while(b != 0) {
			int t = a%b;
			a = b;
			b = t;
		}
		System.out.println(a);
	}
	
	public static void perfectSquare(int n) {
		int num = (int) Math.sqrt(n);
		System.out.println(num);
		int e = num*num;
		System.out.println(e);
		
		if(n == e) 
			System.out.println("Perfect square");
		else
			System.out.println("Not a perfect square");
	}
	
	public static boolean primeCheck(int n) {
		if (n <= 1)
	        return false;
	    if (n == 2 || n == 3)
	        return true;
	    if (n % 2 == 0) 
	        return false;
	    
	    for (int i = 3; i <= Math.sqrt(n); i += 2) { 
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static void rangeNumPrime(int s,int e) {
		for(int i = s;i<=e;i++) {
			if(primeCheck(i))
				System.out.println(i);
		}
	}
	
	public static void nnumPrime(int n) {
		int pc = 0;
		for(int i = 2;i<=Integer.MAX_VALUE;i++) {
			if(primeCheck(i)) {
				System.out.println(i);
				pc++;
//				System.out.println("PC " + pc);
			}
			if(pc==n)
				break;
		}
	}
	
	public static int maxNum(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>c && b>a)
			return b;
		else
			return c;
	}
//	10 2
//	1010
//  0010 --> 1000--8
//			 0010 -->10
					//1000
					//1010
	
	
	public static void swap(int a,int b) {
		 a = a^b;
		 b = a^b;
		 a = a^b;
		 System.out.println(a + " " + b);
	}
	
	

}
