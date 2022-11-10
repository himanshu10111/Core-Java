// Write a program to Take a input of a Name and salary . If The salary is Greater than 10000(10k) add bonus 2000 otherwise add bonus 1000.

import java.util.*; // import Scanner class using util
public class Salary_Bonus { // class Declaration
    public static void main(String[] args) { // main class
        Scanner sc= new Scanner(System.in); // scanner declaration
        System.out.println("Enter your Name"); 
        String name=sc.nextLine();  // Taking input as a name
        System.out.println("Enter your  Salary"); 
        float sal=sc.nextFloat(); // Taking input as a salary
        if (sal>10000) // If Condition
        {
            sal=sal+2000; // salary bonus add 2000

        }
        else // else statement
        {
            sal=sal+1000; // salary bonus add 1000

        }
        System.out.println("Hello "+ name + " your Total salary with adding bonus is :"+ sal); // Print all data with concatenation
    }
}
