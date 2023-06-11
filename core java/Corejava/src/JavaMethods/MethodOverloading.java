package JavaMethods;
// Method overloading means there are multiple methods have same name but different parameters.
public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading method =  new MethodOverloading();
        method.method();
        method.method("Himanshu");
        method.method(10, 20);
        
        
    }

    public void method() // here method name is "method" but there is no argument are passed here.
    {
        System.out.println("these method do not contain any parameters");
    }

    public void method(String str)// here also method name is "method" but there is one String type argument is passed
    {
        System.out.println(str);
    }

    public void method (int a,int b) // same as above but there are two int type of parameter are passed.
    {
        System.out.println(a+b);
    }
    
}
