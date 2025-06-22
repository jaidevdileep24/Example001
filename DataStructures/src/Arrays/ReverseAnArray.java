package Arrays;
import java.util.*;
public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		impli(arr,n);
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
		//1 2 3 4 5
	}
	
	static void impli(int[] arr,int n) {
		int i = 0,j = arr.length-1;
		while(i < j) {
//			int t = arr[i];
//			arr[i] = arr[j];
//			arr[j] = t;
			
			//Without temp
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
			i++;
			j--;
		}
	}

}
