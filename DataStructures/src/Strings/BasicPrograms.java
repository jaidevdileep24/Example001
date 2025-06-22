package Strings;
import java.util.*;
public class BasicPrograms {

	public static void main(String[] args) {
		System.out.println(reverseString());
		System.out.println(containsString());
		System.out.println(checkPali());
		System.out.println(countVowels());
		System.out.println(checkAnnagrams());
		checkAnna();
	}
	
	static StringBuilder reverseString() {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		return sb.reverse();
	}
	
	static boolean containsString() {
		String f = "hello this is jai";
		return f.contains("this");
	}
	
	static String checkPali() {
		String s = "madam";
		String ns = "";
		for(char i:s.toCharArray()) {
			ns = i+ns;
		}
		
		System.out.println(ns);
		if(ns.equals(s)) 
			return "palindrome";
		else
			return "Not a plindrome";
	}
	
	static int countVowels() {
		String  v = "aeiouAEIOU";
		int vc = 0;
		String name = "hey this is jaidevdileep";
		for(char i:name.toCharArray()) {
			if(v.contains(String.valueOf(i))) ++vc;
		}
		return vc;
	}
	
	
	static String checkAnnagrams() {
		String f = "Liste";
		String s = "Silen";
		
		if(f.length() != s.length()) 
			return "Not an Annagram";
		else
			f = f.toLowerCase();
			s = s.toLowerCase();
			
			char[] farr = f.toCharArray();
			Arrays.sort(farr);
			
			char[] sarr = s.toCharArray();
			Arrays.sort(sarr);
			
			String ffarr = new String(farr);
			String ssarr = new String(sarr);
			if(ffarr.equals(ssarr)) 
				return "Annagram";
			else
				return "Not an Annagram";
			
	}
	
	static String checkAnna() {
		String s = "Listen";
		String f = "Listen";
		
		if(s.length() != f.length()) 
			return "not annagram";
		else {
			f = f.toLowerCase();
			s =s.toLowerCase();
			
			char farr[] = f.toCharArray();
			Arrays.sort(farr);
			
			char sarr[] = s.toCharArray();
			Arrays.sort(sarr);
			
			String fs = String.valueOf(farr);
			System.out.println(fs);
			String ss = String.valueOf(sarr);
			System.out.println(sarr);
			return "";
		}
			
		
	}

}
