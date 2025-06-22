package queue;
import java.util.*;



//The priority Queue is a part of java.util package or collection frame work that implements queue interface and where each element is assigned based on the priority.
//Element priority matters, no fixed order, heap-based implementation.
	//Natural ordering(Integers,Stings), Custom Comparator and also we can give our own priority to determine the priority.
public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(100);
		pq.add(20);
		pq.add(110);
		System.out.println(pq);
		
		int e = pq.poll();
		System.out.println(e);
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.peek());
		
		//UseCases:- task scheduling,Dijkstras Algo. 
//		impli1(); 
		reverseStringUAD();
		}
	
	
	static void impli1() {
		Queue<Integer> pq = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			pq.offer(sc.nextInt());
		}
		
		int ne = sc.nextInt();
		pq.poll();
		pq.add(ne);
		System.out.println(pq);
		
	}
	
	//It is built on min heap ds.A heap is a special type of binary tree  	that maintains a specific order of of elements order, where each element in the parent node smaller(in min_heap) or lager than(max_heap) that it's children
	//Use cases:- job processing, task scheduling, real_time systems, pathFinding algorithms,Load balancing.
	static void reverseStringUAD() {
		String s = "Jaidevdileep";
		
		Deque<Character> ad = new ArrayDeque<>();
		for(char i:s.toCharArray()) {
			ad.addFirst(i);
		}
		
		for(char c:ad) {
			System.out.print(c);
		}
	}
	
//	Feature	ArrayDeque	PriorityQueue
//	Ordering	Maintains insertion order.	Always keeps elements sorted (min-heap by default).
//	Access	Fast O(1) for addFirst() & addLast().	O(log n) for insertions and removals.
//	Use Case	Used for stack (LIFO) and queue (FIFO).	Used for priority-based retrieval.
//	Performance	Faster than LinkedList for deque operations.	Efficient for priority-based processing.
//	Sorting	No automatic sorting of elements.	Always returns the smallest element first (poll()).
//	Null Values	Allows null elements.	Does not allow null eleme

	}

