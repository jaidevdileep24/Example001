package Set;
//Comparator:- it is used to define the custom order for objects.unlike comparable which only define in natural ordering but when it comes to comparator allows to compare the objects in multiple ways. like sorting a list of students by grades,marks,names,numberof problems solved.
//compareTo(T obj1, T obj2):- the compare methods take 2 objects and return 
import java.util.*;
public class ComparatorInterface {

	public static void main(String[] args) {
		ArrayList<Student1> arr = new ArrayList<>();
		
		arr.add(new Student1("jai",101));
		arr.add(new Student1("jaidev",1000));
		arr.add(new Student1("jaidevdileep",99));
		
		//sort by marks
//		arr.sort(new Comparator<Student1>() {
//			@Override
//			public int compare(Student1 s1,Student1 s2) {
//				return Integer.compare(s1.marks, s2.marks);
//			}
//		});
//		
//		System.out.println("Sorted by marks: " + arr);
//		//Sort by name;
//		arr.sort(new Comparator<Student1>() {
//			@Override
//			public int compare(Student1 s1,Student1 s2) {
//				return s1.name.compareTo(s2.name);
//			}
//		});
		
		arr.sort(new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1,Student1 s2) {
				return Integer.compare(s1.marks, s2.marks);
			}
		});
	}

}

class Student1 {
	String name;
	int marks;
	
	public Student1(String name,int marks) {
		this.name= name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", marks=" + marks + "]";
	}
	
	//Collections.sor(arr),Collections.binarySearch(arr,ele),Collections.reverse(),Collections.frequency((arr,ele),Collectins.isDisjoint():- it is used to check if the two collections have no common elements,Collections.max(),Collections.min(),
	
	 	
}
