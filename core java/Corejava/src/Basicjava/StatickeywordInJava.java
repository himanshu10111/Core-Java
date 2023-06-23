package Basicjava;

public class StatickeywordInJava {
 public static void main(String[] args) {
	 
	 // Here you can see that we can directly access the member variable of Static class without creating objects..
	
	 System.out.println(Static.id); 
	 System.out.println(Static.name);
	 System.out.println(Static.rollno);
	 
	 // we can access those  member function just using (.)
	 Static.function();
	 
	 // here we can access the static inner class of Static class Using (.)
	 System.out.println(Static.test.val); 
	 
	 
	  // Here test class have 1 instance variable which is not a Static so here we creating the object of test class .. 
	 
	 Static.test t1 = new Static.test();
	 System.out.println(t1.name);
	 
	 
	 
	 
	
	 
}
}
 class Static
{
 static int id=10; // Static instance variable
 static String name="Himanshu";
 static String rollno="MC21014";
 
 public static void function() // Static member Function
 {
	 System.out.println("These is the Static member method of Static class ");
 }
 
 static class test // Static inner class
 {
	 static int val=10;
	 String name="kiran";
	 
 }
 
 
 
}