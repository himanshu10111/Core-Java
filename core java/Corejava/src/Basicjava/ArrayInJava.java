package Basicjava;

public class ArrayInJava {
    public static void main(String[] args) {
         int numbers[] = {10,20,40,60,80,100}; // Array declare
        // numbers[0] used for print specific position.
         System.out.println(numbers[0]); //array indexing start from 0 so on zero position in array is 10 . so 10 will be print on the console.
         System.out.println(numbers[5]); // and here we are printing the 5th position which present in array.
         
         // the for loop is used for the ittrate the all values form the array and print all one by one.
         for(int i=0;i<=numbers.length;i++)
         {
            System.out.println(numbers[i]);
         }
    }
    
}
