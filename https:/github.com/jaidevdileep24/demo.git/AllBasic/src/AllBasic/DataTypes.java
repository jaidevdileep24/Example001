package AllBasic;
// data type is a label in java that tell the computer what type of value of a variable is going to hold.
//in java data types are classfied into 2 types
//1--> primitive :- these are basic building blocks.there are useful to deal with simple data.
	//byte(-128->127) //marks,grades, - 8bits/1byte -2^8 -> 2^8 -1
	//short (-32768 -> 32767) math calculations,store game score -16 bits/2byte
	//int -2^32 -> 2^32 -1 // 4
	// long -2^64 -> 2^64 -1 8
	//float f 4byte single pression
	// double 8bytes  pression
	//char 2bytes
//type casting :-  converting  one data type to another data type is called as type casting.
	//implicit casting(Widening) :- when we convert smaller data type to larger data type then it is called as implicit/widening 
		//	byte -> sort, sort -> int, int -> long, long -> float, 
	//Explicit(narrowing) casting:-  when we convert larger data type into smaller then it is called as explicit casting.
		//data loss of risk,manual con,data types.
//Suffixes:- suffixes are used to tell the computer the specific data type of a number. by default number are treated as int or double so suffixes help u to define explicity float and long values.
//Understanding the scientific notation in java.:-  java allows is used to represent numbers using scientific notation. which is often useful to represent very large and small values.

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int snum = 10;
		double bnum = snum;
		int fnum = (int) bnum;
		
		float smallNum = 1.2e2f;
	}

}
