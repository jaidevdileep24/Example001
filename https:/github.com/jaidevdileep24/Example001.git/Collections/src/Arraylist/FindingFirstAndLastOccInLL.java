package Arraylist;
import java.util.*;
public class FindingFirstAndLastOccInLL {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		sc.nextLine();
		for(int i = 0;i<n;i++) {
			ll.add(sc.next());
		}

		String ns = sc.next();
		
		for(int i = 0;i<ll.size();i++) {
			if(ll.get(i).equals(ns)) {
				System.out.println("Found " + (i+1) );
				break;
			}
		}
		
		for(int i = ll.size()-1;i>=0;i--) {
			if(ll.get(i).equals(ns)) {
				System.out.println("Found " + (i+1) );
				break;
			}
		}
	
	}

}
