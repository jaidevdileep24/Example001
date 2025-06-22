package Set;
import java.util.*;
//hash set is particularly known for its efficiency and the time complexity of retrieval,adding,removing is O(1)
//NoDuplicates, unOrdered Collection of elements, efficient performance.
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(10);
		hs.add(100);
		
		System.out.println(hs);
		//set.retainAll():- this method will return the common elements in two sets
		//removeAll():- returns the different elements form the both the set (s-s1) returns s
		//AddAll():- Adds collection of elements into the set.
		//equals():- checks for two sets are equal or not.
		System.out.println(hs.hashCode());//it will return the address of the has array it determines where the element should be placed in.
		
	}

}
