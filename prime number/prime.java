// write a program to check wether number is prime or not 
import java.util.*; 
import java.math.MathContext;

public class prime { // prime class
    public static void main(String[] args) { // main class
        System.out.println("ENter the Number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int c=2;
        if(num==0 || num==1) // handing 0 and 1 
        {
            System.out.println("The Enter nnumber is wrong");
            System.out.println(num +" is the not a prime and composite");
            System.exit(0);
            
        }

        while(c < num ) // loop for handing remaining numbers
        {
            if(num%c==0)
            {
                System.out.println("not prime");
                System.exit(0);
            }
            c=c+1; 
        }
        System.out.println("The number is prime");



    }
    
}
