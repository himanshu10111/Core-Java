package Basicjava;

import java.util.Scanner;

public class BasicOperationArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number you want to enter in Array :note Max limit is 25");
        int arrayLimit= sc.nextInt();
        int numbers[]= new int[25]; // here we set the limit of array which is 25.

        if(arrayLimit>25){
            System.out.println("you exced the limit please enter the number less than 25");
            System.exit(0); // this is for code running is terminate .
        }
        else{
            int num=1;
            int num1=1;
            System.out.println("Enter "+arrayLimit+" Numbers: in array");
            
            for(int i=0;i<arrayLimit;i++)
            {
                System.out.println("Enter "+num+"number:- ");
                numbers[i]=sc.nextInt();
                num++;  
            }
             for(int i=0;i<arrayLimit;i++)
            { 
                System.out.println("Entry "+num1+" = "+numbers[i]);
                num1++;
            }   
        }
    }
}
    





