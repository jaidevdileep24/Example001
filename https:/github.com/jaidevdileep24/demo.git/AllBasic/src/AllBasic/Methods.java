package AllBasic;
//Method:- method are the set of statements used to perform certain operation.
//organise the code. avoid reputations,reusability, improve readability.
//Types of methods
	//withoutParameters and withputReturn type
	//withoutPrams with return type
	//with params without return type
	//with params with rt
	
public class Methods {

	public static void main(String[] args) {
		Methods.sayHello();
		Methods.sayHi();

	}
	
	static void sayHello() {
		System.out.println("jai");
	}
	
	static void sayHi() {
		System.out.println("say hieee...");
	}
	
//	assessModifier returnType MethodName parameters.
	//Parameters:- parameters are like placeHolders for data passing inside a method basically these are used to pass the input to the method
	//Arguments are actual values that we can pass at the time of the call
	//LocalVariables:- a variables which are declared inside the method,constructor,block is called as local variables.these variables are useful with that method only.The method finished executing then those reference are wiped out of the memory.
	//why do we need localVariables :- perfect for temporary storage,to provide encapsulation,memory management.
	//scope of a variables:- the scope of the variable is limited to the method or block of the code where it's declared.
		//if a local variable declared inside a method then it is available with that method only or else with in that block only.
	
//Memory Management:-Java uses to key areas of memory to keep everything tidy when u call a method.
	//Stack memory:- when u call a method, java allocates a stack of memory on the stack for that. this method is called as activation record or stack frame.
	//heap memory:- heap memory is for storing objects created by new keyword.unlike stack memory objects in the heap memory remain until they are no longer needed.

}
