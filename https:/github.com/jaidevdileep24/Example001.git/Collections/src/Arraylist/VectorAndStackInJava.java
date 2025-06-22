package Arraylist;
//VectorAndStackInJava:- there are the part of leagecy frameworks.
//Vector:- A vector is a dynamic array,similar to arrayList which can grow and shrink as needed. one first class provided by java.
//Stack is a subClass of vector represent lifo.
//Thread safe.
import java.util.*;
public class VectorAndStackInJava {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);

		Stack<Integer> st = new Stack<>();
		st.add(10);
		st.add(20);
		st.push(10);
		st.push(20);
	}
	
	//due to synchronisation performance might slower as compare to arraylist and linkedlist
	//Replaced by modern alternatives
	//Thread safe Alternatives:- methods like synchronised classes like Collections.syncrhonisedList() and classes like concurrentHashMap 
	
}
