package Arrays;
import java.util.*;
public class TwoDimentionalArray {

	public static void main(String[] args) {
		//Static initialisation
		int[][] arr = {
				{1,3,4},
				{2,3,4}
		};
		
		for(int[] i:arr) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//Taking input for the user
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] tarr = new int[r][c];
		
		for(int i = 0;i<tarr.length;i++ ) {
			for(int j = 0;j<tarr[i].length;j++) {
				tarr[i][j] = sc.nextInt();
			}
		}
		
		
		for(int[] i:tarr) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//For jagged array[rows and columns are not same]
		int jr =sc.nextInt();
		
		int[][] jarr = new int[jr][];
		for(int i = 0;i<jarr.length;i++) {
			jarr[i] = new int[sc.nextInt()];
			for(int j = 0;j<jarr[i].length;j++) {
				jarr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] i:jarr) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
