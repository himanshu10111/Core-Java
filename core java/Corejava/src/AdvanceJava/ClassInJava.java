package AdvanceJava;
public class ClassInJava { 
public static void main(String[] args) { // main method 

human h1 = new human(); // creating objects of class human.

h1.name="himanshu";
h1.age=21;
h1.height=5.7f;
h1.weight=62.8f;
h1.color="Medium";
System.out.println(h1.name);
System.out.println(h1.age);
System.out.println(h1.height);
System.out.println(h1.weight);
System.out.println(h1.color);


    
}
    
}

class human // Class Human have some own properties.
{
    String name;
    float age;
    float height;
    float weight;
    String color;
}