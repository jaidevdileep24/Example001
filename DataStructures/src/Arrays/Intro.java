package Arrays;

import java.util.Arrays;

//Arrays:- Arrays is a collection elements identified by index or key.in java arrays are objects so which can hold fixed no of values of a specific.the size of the array is determined at the time of creation can;t be changed afterwards.
//Syntax dataType[size] arr_name;
public class Intro {
	public static void main(String args[]) {
		//initialising an array
		int[] arr = {1,2,3,4,5};
		
		int[] arr1 = new int[5];
		Arrays.fill(arr1, 10);
		
		//Traversing an array
		//Using enhanced for loop
		for(int i: arr1) {
			System.out.print(i + " ");
		}
		
		//Using normal for loop
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		//Using streams
		
		Arrays.stream(arr).forEach( i -> System.out.println(i + " "));
		Arrays.stream(arr).forEach(i -> System.out.println(i + " "));
		
	}
}
