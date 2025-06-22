package Arraylist;
//IterableInterface:- iterable interface is a part of java collections library.located in java.lang package. it represents a collection that can be traversed, meaning u can visit each element one by one in sequence.the iterable interface only contains single a single abstract methods
	//Iterator<t> iterator():- this method return an iterator object that provides the mechanism for iterating over elements in the collections elements. --> returns an iterator, which provides a mechanism to traverse one by one elements in a collection.
	//Simplified traversal, enhanced for loop support, custom iteration logic.
import java.util.*;
public class IterableInterface {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
