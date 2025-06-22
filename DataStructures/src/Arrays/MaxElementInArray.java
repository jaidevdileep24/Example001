package Arrays;

import java.util.*;

public class MaxElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findMax(arr,n));
		System.out.println(findSecondMAx(arr,n));
	}
	
	static int findMax(int[] arr,int n) {
		int m = Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>m) m=i;
		}
		return m;
	}
	
	static int findSecondMAx(int[] arr,int n) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i:arr) hs.add(i);
		ArrayList<Integer> narr = new ArrayList<>(hs);
		Collections.sort(narr);
		return narr.get(narr.size()-2);
	}
	
	

}
