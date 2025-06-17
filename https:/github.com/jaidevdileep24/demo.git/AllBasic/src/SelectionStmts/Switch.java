package SelectionStmts;
//The switch statements only work with byte,sort,int,char,String,enum
//Switch(expression){
//	case 1:
//		Statements
//		break
//	case 2:
//		statements
//		break
//	default:
//		statements

//The switch statement in java is a control structure that allows our program to choose one of the fixed values based on the expression.it simplifies multiple condition checks,making the code more readable and engaged.
import java.util.*;
	
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkDay(n));
		System.out.println(Switch.weakDay(n));

	}
	
	public static String checkDay(int day) {
		switch(day) {
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "wednesday";
			case 4:
				return "Thrusday";
			case 5:
				return "friday";
			case 6:
				return "saturday";
			case 7:
				return "sunday";
			default:
				return "invaild";
		}
	}
	
	public static String weakDay(int day) {
		switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				return "non-weakDay";
			case 6:
			case 7:
				return "weakDay";
			default:
				return "Invaild input";
		}
	}
}
