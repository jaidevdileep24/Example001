package Arraylist;
//Problem with ArrayList:- insufficient insertions and deletions,Performance bottlenecks, not ideal for queues.
//LinekedList:-  Linked List is a collection of nodes where each node contains data, ref to next nodes, ref to previous nodes.
	//Quick insertion and deletion, doubly linked structure, ideal for implementing queues and deQueus.
//Types of linkedList
//Single LinkedList:-  each node point to the next node
//Double LinkedList:- both ways
//circular LinkedList:- each node points to the next node and tail will pointing to the head like will form a chain.
import java.util.*;
//efficient data insertion and deletion, doubly linked structure,
public class LinekedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(10);//use addFirst to inset highest element at first.
		ll.addLast(20);
		ll.addAll(ll);
		ll.remove(); //Retrives and removes the head of the linked list
		ll.remove(0); //removes and element based on position.
		ll.removeAll(ll);
		ll.removeFirst();
		ll.removeLast();
		ll.get(0);
		ll.getFirst();
		ll.getLast();
		ll.size();
		ll.isEmpty();
		
		//Differences:- 
	}

}
