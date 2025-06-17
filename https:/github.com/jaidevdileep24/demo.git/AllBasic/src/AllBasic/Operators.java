package AllBasic;
//Operator:- operator is a symbol/keyword that tells the computer what to do.
//Operator is a symbol/Keyword that is used to perform operations on variables and values.
//Arithmetic Operators:-it is a symbol that tell the computer to do basic math operators like[+,-,/,*,%]
	//Operator precedence:-
	//Associativity:- same precedence will be groped.left to right.
//Relational Operators:- relational operators are the special symbols that let u compare to values [>,<,!=,==,===,>=,<=]
//Logical Operators:- Logical Operators are the symbols that is used to combine two or more results and return true or false.[&&,||,!)
//BitwiseOperators:- bitwise operators are the special symbols used to manipulate individual bits of the numbers.[&,|,^,~,<<,>>,>>]
//Ternary Operators:- a ternary operator is a unique statement in java that let u right if-else statement in a single line. it is called as ternary operator bcz it wor's with three operands.
	//Condition ? trueValue: falseValue
public class Operators {

	public static void main(String[] args) {
		var a = 10;
		var b = 20;
		var c = a>b ? a+b : a-b;
		System.out.println(c);
		
		var age = 19;
		var eligible = age >= 18 ? "yes":"no";
		System.out.println(eligible);
		
		int res = a>b ? a+b:a-b;
		System.out.println(res);
				

	}

}
