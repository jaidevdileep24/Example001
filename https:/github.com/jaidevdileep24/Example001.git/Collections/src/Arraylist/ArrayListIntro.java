package Arraylist;
import java.util.*;
//In traditional arrays we have fixed size, manual data shifting, performance issues
//ArrayList:- An arrayList is a java resizable array implementing list interface.unlike traditional arrays arrayList can grow and shrink as elements are added and removed. This makes them highly useful for managing collection of data those size may vary...
	//Dynamic resizing, expansion, average efficiency.
public class ArrayListIntro {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		arr.get(0);//get will work based on the index.
		arr.add(4, 44);//We can also add an element at specific position.
		
		arr.remove(4);
		arr.remove(50);
		
		arr.set(0, 1000);
//		arr.contains(arr) 
		arr.isEmpty();
		

		//Common Exceptions:- 
		//indexOutsofbound
		//concurentModificationException:- occurs when modifying an arrayList while looping through it.
		//null values:- it allows null values but forgetting to handle those will get NullPointerException.
		//Performance issues:- while inserting or deleting elements in the middle.
		
	}
}
