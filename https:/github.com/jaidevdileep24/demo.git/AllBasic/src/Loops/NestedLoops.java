package Loops;
//NestedLoops:- nested loops are the loops that are written inside the other loop and these loops are executed fully when the outer loop runs only once.
//LabelledLoops:-Labelled loops let you name our loops,so we can decide which loop can break and which loop can continue based on the loop name.

//labelName:
	//	for(condition) {
	//		for(condition) {
	//			for(condition) {
	//				if(Condition) break labelNAme;
	//			}
	//		}
	//	}
public class NestedLoops {

	public static void main(String[] args) {
		outerLoop:
		for(int i = 0;i<=10;i++) {
			innerLoop:
			for(int j  = 0;j<i;j++) {
				if(i==5) break outerLoop;
				System.out.print(j + " ");
				if(j==i) continue innerLoop;
			}
			System.out.println(i + "-->>");
		}

	}

}
