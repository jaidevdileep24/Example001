package Strings;
import java.util.*;
public class Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String ns = new String(s);
//		String fs = s;
		
//		if(s==ns) { //checks for the reference not for the value
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		if(s==fs) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		if(s.equals(ns)) { //checks for the value not for the reference.
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		
//		if(s.equals(fs)) {
//			System.out.println("true");
//	} else {
//		System.out.println("false");
//	}
		
		
		impliMethods();
	}
	
	public static void impliMethods() {
		//Concatenation:-it is the process of joining the two or more strings.
		String fname = "jai ";
		String sname = "devdileep";
		String finame = fname + sname;
		String afiname = fname.concat(sname);
		System.out.println(finame);
		System.out.println(afiname);
		
		StringBuilder sb = new StringBuilder();
		sb.append("jai");
		
		
		//using string buffer
		StringBuffer sbr = new StringBuffer();
		sbr.append("hello\n");
		sbr.append("jaidevdileep");
		System.out.println(sbr);
		
		//Length:- 
		System.out.println(fname.length());
		//charAt(ind):- used to access a specific characters
		System.out.println(fname.charAt(0));
		//substring(st,end):- used to get a specific part of the string
		System.out.println(finame.substring(0,5));
		System.out.println(finame.substring(0));
		//Equals:-used to compare the two strings
		//toUpperCase():-,toLowerCase();
		//trim():- it is used to trim the trailing and leading spaces from astring
		String st = "    hello   ";
		System.out.println(st.trim());
		
		//IndexOf():- used to get index of a specific character of a specific character in a string
		System.out.println(finame.indexOf('h'));
		
		//Join():- joins an array or list of strings into a single string using a specific 
		String[] arr = finame.split("\\s+");
		String words = String.join("-", arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(words);
		
		//startsWith(),endsWith(),isEmpty()
		//String formating, %S->for strings, %d for integers, %f for floats, %t for date 
		String fs = String.format("hello this is  %s and my age is %d", "jai",22);
		System.out.println(fs);
		
		
	}

}
