package queue;
//queue:- queue is a ds which holds the elements in first in first out order.
	//Real world Analogies:-  server Requests,Printer Queue
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		// Enqueue:- for adding the elements
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);
		
		// Dequeue:- for removing elements
		Queue<Integer> dq = new LinkedList<>();
		dq.poll();
		dq.remove();
		q.peek();
		q.offer(10);//inserts an element into the queue if it is not full only.
		
		
		q.isEmpty();
		q.size();
		
		
		//Benefits:- fairness and order, efficient resource management, improved user experience.
		
		

	}

}
