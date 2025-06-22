package Set;
//Comparable interface is used to define the natural ordering for objects of class.it allows objects to be compared to each other, which is especially useful when u need to compare the objects.
//compareTo(T obj) method is used to compare this object to another object.
//sorting the objects,task priorisation,leader boards
import java.util.*;
public class ComparableInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++) {
			String s = sc.nextLine();
			String[] sarr = s.split("\\s+");
			Person p = new Person(sarr[0],Integer.parseInt(sarr[1]));
			arr.add(p);
		}
		
		Collections.sort(arr);
		for(Person ele:arr) {
			System.out.println(ele);
		}

	}

}

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person p) {
		if(this.age < p.age) {
			return 1;
		}else if(this.age > p.age) {
			return -1;
		}else {
			return 0;
		}
}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


class CustomString implements Comparable<CustomString> {
	private String str;
	
	public CustomString(String str) {
		this.str = str;
	}
	
	@Override
	public int compareTo(CustomString cs) {
		return cs.str.compareTo(this.str);
	}

	@Override
	public String toString() {
		return "CustomString [str=" + str + "]";
	}

}


class Studen implements Comparable<Studen> {
	String name;
	int marks;
	
	public Studen(String name,int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Studen other) {
		return Integer.compare(this.marks, other.marks);
	}
	
	
	
}