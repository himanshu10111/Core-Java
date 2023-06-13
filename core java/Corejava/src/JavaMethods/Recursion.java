package JavaMethods;

import java.util.Scanner;

// Recursion means a function or method which calling itself.
// finding factorial using recursion..

public class Recursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int number= sc.nextInt();
        
        System.out.println(fact(number));
    }
    
    public static int fact(int num)
    {
        if(num==0 || num ==1)
        {
            return 1;
        }
        else{
            return num*fact(num-1); // here we can see that the fact function call itself.
        }
    }
}
