package Arraylist;
//ArrayDequeue:- it is the sort form for array double ended queue is a resizeable array based implimentation of a double ended queue(Dequeue) in java.it allows fast insertions and delections at both ends.making more effiecient than linked list	
	//More efficient than linkedList, fifo and lifo,no capacity resitrictions unlike ArrayList, don't allow null elements, unlike other queue elements.
import java.util.*;
public class ArrayDequeue {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		int e = ad.poll(); //Retrives and removes the head of the deque.

		//For stack
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.poll();
		
		
	}

}
