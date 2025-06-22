package Arraylist;
// Generic are the future in java that allows u to write code and operate on objects of various types while ensuring type safety.
//To provide type safety and code reusability.
//Generic class is a class that can work with any datatype.u define the type when u instance the class.
//Advantages:- No classCastException, increased reusablity.
public class Generics {

	public static void main(String[] args) {
		Box<String> bs = new Box<>();
		
		Box<Integer> bi = new Box<>();
		

	}
	
	public static<T> void disp(T item) {
		System.out.println(String.format("item %s", item));
	}

}


class Box<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}


//Generic methods :- generic method is a method that can operate on objects on various types.
//WildCards in generic:- wild cards in genericS are special symbols used to make generic code and more flexible. they allow different type of data without explicitly specifying the type.there are mainly three types of wild cards are there unbounded(?), upper bounded (? extends T), lower bounded (? super T) these wild cards are imp for large applications bcz they make ur code addaptable and reusable.
//public static<T> void item(T item) {
//	System.out.println(item);
//}

// Unbounded WildCards(?):- when we don't care about the specific type of data in a collection and only need to read from it.	
// UpperBounded WildCards(? entends T) :- where t is a specific class. this is used when u want to work with a type that is a subclass of a specific class.this is useful for when u want to  read data from a collection but u don't modify it.






