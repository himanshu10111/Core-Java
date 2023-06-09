package Basicjava;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        System.out.println("enter the number");
        int val = sc.nextInt();

        for(int i = 0; i < 10; i++)
    {
        if(i==val)
        
        break;
        System.out.println("hello");

    }

    }
    
}
