package JavaMethods;

public class paramteriseMethod {

    public static void main(String[] args) {

        paramteriseMethod pm= new paramteriseMethod(); 
        int sum=pm.Addition(10, 20); // call the method and store the value in sum variable.
        System.out.println("the sum is:-"+sum); 
        
    }

    public int Addition(int num, int num1) // here the method name is add and there are two parameters num and num1
    {
        return num1+num;

    }
    
}
