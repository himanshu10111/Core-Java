// Write a Program To Take Input From user As a Name and print it with Hello .
// Ex : Suppose Name is Himanshu So print (Hello Himanshu).

import java.util.*; // for Import Scanner
class name // class name (name)
{
public static void main(String[] args) { // main method
    Scanner sc= new Scanner(System.in);  // scanner declaration
    System.out.println("Enter your name"); // print
    String name=sc.nextLine();                // taking Input 
    System.out.println("Hello "+name);    // output (in print statement + is use for Concatenation of String)
}
}