package AllBasic;
//Variable is a container which is used to stored data. it used to reference and manipulate data.
//In java variables are classified into 2 types primivite(int,float,double,boolean,char) and reference(string,array,object)...
public class Variables { 
	public static void main(String args[]) {
		//primitive Varaible
		int a = 10;
		var b = "jaidev"; //with var the complier figures the data and assign's to the variable.//var can be used only for local variable requires immediate  initialisation.

		System.out.println(a);
		System.out.println(b);
		//explicit
		//inferred
		//Declaration ,initialisation,assignment
		//Declaration:-this when we declare the variable
		int score;
		//initialisation:-this where initialise the value to a variable
		score = 10;
		//assignment:- this is where we change the value
		score = 20;
		System.out.println(score);
		
		//rules :-must start with a letter or underscore,cannot contain spaces,case sensitive,reserved words can't be used,variables cloud be any length.
		
		//var keyword:-VAR keyword is a shorthand  way to declare variables with out specifying the type.the java is smart enough to infer the type to it.in the compilation time.
	}
	

}
