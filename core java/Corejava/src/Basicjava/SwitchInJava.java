package Basicjava;

import java.util.Scanner;
import java.util.*;

public class SwitchInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, val1, val2 = 0;
        System.out.println(" Choose option \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
        i = sc.nextInt();
        System.out.println("Enter First Number");
        val1 = sc.nextInt();
        System.out.println("Enter Second Number");
        val2 = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("The addition of "+ val1 +" and " +val2+" is:"+calculator.add(val1, val2));
                break;
            case 2:
            System.out.println("The subtraction of "+ val1 +" and " +val2+" is:"+calculator.subtract(val1, val2));
                break;
            case 3:
            System.out.println("The multiplication of "+ val1 +" and " +val2+" is:"+calculator.multiply(val1, val2));
                break;
            case 4:
            System.out.println("The division of "+ val1 +" and " +val2+" is:"+calculator.division(val1, val2));
                break;

            default:
                System.out.println("Enter Wrong entry:- Error Enter valid Entry");
                break;
        }

        System.out.println("Thank you for using these Calculator");

    }
}

class calculator {

    public static int add(int val1, int val2) {
        return val1 + val2;
    }

    public static int subtract(int val1, int val2) {
        return val1 - val2;
    }

    public static int multiply(int val1, int val2) {
        return val1 * val2;
    }

    public static int division(int val1, int val2) {
        return val1 / val2;
    }

}