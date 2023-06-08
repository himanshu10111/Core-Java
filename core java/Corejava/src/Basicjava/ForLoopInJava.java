package Basicjava;

import java.util.Scanner;

public class ForLoopInJava {
// Lets try to make table code with the help of for loop.
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Number for Generating table ");

        int val = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(val+" * "+i+" = "+val*i);
        }
        System.out.println("Thank you");

        
    }
    
}
