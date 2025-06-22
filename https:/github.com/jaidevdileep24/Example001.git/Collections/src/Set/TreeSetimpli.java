package Set;
//A tree set is the part of java.util package and implements set interface.unlike other set tree set keeps elements in a sorted order. it uses red-black tree a type of self balancing search tree it allows elements are sorted in the form of sorted order.
//Sorted,No duplicates, NavigableSet interface.
//O(log n) - adding,removing,searching for an elements.
import java.util.*;

public class TreeSetimpli{

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(390);
		ts.add(10);
		ts.add(100);
		
		System.out.println(ts);
		
		System.out.println(ts.size());
		System.out.println(ts.remove(10));
		System.out.println(ts);
		System.out.println(ts);
		System.out.println(ts.first());
		
		//UseCases:- Sorted data storage, navigating through data, ranking system.
	}

}
