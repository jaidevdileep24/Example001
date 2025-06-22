package Arrays;
import java.util.*;
public class AvarageOfEachArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] i:arr) {
			double avg = 0;
			for(int j:i) {
				avg += j;
			}
			System.out.println(avg/i.length);
		}
		
		//SUM OF MINIUMELEMENT IN EACH ROW
		int totsum = 0;
		for(int[] i:arr) {
			int min = Integer.MAX_VALUE;
			for(int j:i) {
				if(j<min) min = j;
			}
			System.out.println("min " + min);
			totsum += min;
		}
		System.out.println("tot sum of minium elements " + totsum);
		
//		1 2 3
//		4 5 6
//		7 8 9 j<arr.len[i]-1 [j][i]
		
	
		for(int[] i:arr) {
			double avg = 0;
			for(int j:i) {
				avg += j;
			}
			System.out.println("Average of each row " + avg/i.length);
		}
		
		int tminSum = 0;
		for(int[] i :arr) {
			int m = Integer.MAX_VALUE;
			for(int j:i) {
				if(j<m) m = j;
			}
			tminSum += m;
		}

	}

}
