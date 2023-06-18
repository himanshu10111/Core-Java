package AdvanceJava;

import AdvanceJava.Outer1.Inner1;

public class InnerClassInJava{  // 
	public static void main(String[] args) { // main method
		
		Outer.Inner in = new Outer.Inner(); // here we are creating the object of Inner class
		 // Note : these syntax is valid for when Inner class is Static type
		
		in.fun(); // calling fun method of Inner class
		
		
		Outer1 out = new Outer1(); // Creating Object of Outer1 Class 
		Outer1.Inner1 i1= out.new Inner1(); // Here we creating object of Innner1 class note:- These syntax valid when Inner class is normal
		
		i1.fun();
		
	}
}

class Outer{ // outer class 
	
	
	
	static class Inner // outer static inner class
	{
		void fun()  // fun method of Inner class
		{
			System.out.println(" These is fun method of Inner class");
		}
		
	}
}

class Outer1 // Outer1 Class
{
	int x=10; // Instance variable of Outer1 Class
	
	class Inner1{ // Class Inner1 
		void fun() { // fun method of Inner1 class
			System.out.println("These is Inner1 Class fun method"+x);
		}
		
	}
}