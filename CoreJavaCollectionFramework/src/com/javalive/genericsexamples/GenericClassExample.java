package com.javalive.genericsexamples;

/**
 * @author JavaLive.com
 * @description 
 */


//A Simple Java program to show working of user defined 
//Generic classes 

//We use < > to specify Parameter type 
class Test1<T> {
	// An object of type T is declared
	T obj;

	Test1(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

// We can also pass multiple Type parameters in Generic classes.
class Test<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

// A Simple Java program to show working of user defined
// Generic functions

class Test2 {
	// A Generic method example
	 <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
}

// Driver class to test above


public class GenericClassExample {
	public static void main(String[] args) {
		// instance of Integer type
		Test1<Integer> iObj = new Test1<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test1<String> sObj = new Test1<String>("JavaLive.com");
		System.out.println(sObj.getObject());

		//Calling Test class
		Test<String, Integer> obj = new Test<String, Integer>("GfG", 15);

		obj.print();
		
		//Calling method of Test2 class
		Test2 obj1=new Test2();
		
		 // Calling generic method with Integer argument 
		obj1.genericDisplay(11); 
   
        // Calling generic method with String argument 
		obj1.genericDisplay("JavaLive.com"); 
   
        // Calling generic method with double argument 
		obj1.genericDisplay(1.0); 
	}
}
