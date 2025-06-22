package queue;
// An ArrayDeque is the part of java collections framework which implements dequeue  interface.unlike queue dequeue allows both end insertion and deletion
//Double Ended,No capacity restrictions, fast performance.
// we can add elements at first and also at last and also we can remove elements ad last and first so which can follow both FIFO and LIFO structure.
//While adding and removing elements arrayDeque more efficient that linked list


import java.util.*;
public class ArrayDequq {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
//		dq.addFirst(10);
//		dq.addLast(20);
		dq.peek();
		dq.isEmpty();
		dq.size();
		
		//UseCases:- Task management,undo-redo functionality,browser history,
	}

}
