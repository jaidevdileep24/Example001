package Arrays;
//1DArray():- 
import java.util.*;
public class OneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		Arrays.stream(arr).forEach(j -> System.out.print(j + " "));
	}

}
