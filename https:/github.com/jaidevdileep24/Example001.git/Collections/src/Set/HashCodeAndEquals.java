package Set;

import java.util.Objects;

//
public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Student {
	String name;
	int id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o ==  null || getClass() != o.getClass()) return false;  
		Student st = (Student)o;
		return id == st.id && Objects.equals(name,st.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	
	
}
