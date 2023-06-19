package AdvanceJava;

public class AbstractClassInJava {
	public static void main(String[] args) { // main method 
		Sneakers sneakers = new Sneakers("Nike", 10.5, "Black"); // creating object and passing arguments
        sneakers.createShoes("Adidas", 9.5, "White"); 
        sneakers.readShoes();
        sneakers.updateShoes("Puma", 11, "Red");
        sneakers.readShoes();
        sneakers.deleteShoes();
        sneakers.readShoes();
	}
}


abstract class Shoes { // class shoes 
    private String brand; // instance variables
    private double size;
    private String color;

    public Shoes(String brand, double size, String color) {  // parameter constructor 
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public abstract void displayDetails(); // method that shod very child class have to override 

    // getter setter
    
    public String getBrand() { 
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Sneakers extends Shoes { // child class sneaker
    public Sneakers(String brand, double size, String color) {
        super(brand, size, color);
    }

    // try to create CRUD operations created below related methods ..
    
    @Override
    public void displayDetails() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
    }

    
    public void createShoes(String brand, double size, String color) {
        setBrand(brand);
        setSize(size);
        setColor(color);
        System.out.println("New sneakers created!");
    }

    public void readShoes() {
        displayDetails();
    }

    public void updateShoes(String brand, double size, String color) {
        setBrand(brand);
        setSize(size);
        setColor(color);
        System.out.println("Sneakers updated!");
    }

    public void deleteShoes() {
        setBrand("");
        setSize(0);
        setColor("");
        System.out.println("Sneakers deleted!");
    }
}
