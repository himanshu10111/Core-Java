package Basicjava;
public class BooleanInJava{
    public static void main(String[] args) {

        // suppose we have to store 0 and 1 or true or false or yes and no type of values.
        // in java boolean support the true or false type of values .
        
        int integer=10;
        int integer1=20;

       boolean b1= integer < integer1; // here we check whether integer1 is greater than integer or not if yes then boolean b1= store true else false
       
       System.out.println(b1); 

       boolean b2=valcheck(integer, integer1);

       System.out.println("The Value of b2 is :"+b2);

    }

    public static boolean valcheck(int a,int b)
    {
        boolean b1;
        if (a<b)
        {
            b1=true;
        }
        else{
            b1=false;
        }
        return(b1);
    }

}