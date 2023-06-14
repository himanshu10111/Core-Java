package AdvanceJava;

public class ConstructorInJava {
	
	public static void main(String[] args) {
		
		
		Human1 human = new Human1("himanshu",22,178,62); // creating object and pass the arguments or (parameter)
		System.out.println("Name: "+human.name+" Age: "+human.age+" Heiht: "+human.height+" Weight: "+human.weight);
		
		
	}
	

}

class Human1
{
	String name;
	int age;
	float height;
	float weight;
	
	
	

	public Human1() { // this is Default constructor 
		super();
		
	}



	public Human1(String name, int age, float height, float weight) { // these is parameter constructor
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	
}
