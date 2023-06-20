package AdvanceJava;
import java.util.Scanner;

public class InterfaceInJava {
    public static void main(String[] args) {  // main method 
        Canvas canvas = new Canvas(); // creating object of Canvas Class
        canvas.create();
        canvas.readShoes(); // uncomment methods depend on requirements::
//        canvas.updateShoes();
//        canvas.readShoes();
//        canvas.deleteShoes();
//        canvas.readShoes();
    }
}

interface Shoes1 { // Interface Shoes
	
	// CRUD methods of interface which will define later which class implements these Interface
    void create(); 
    void readShoes();
    void updateShoes();
    void deleteShoes();
}

class Canvas implements Shoes1 { // class  Canvas Implements Interface Shoes 
	
	// Instance variable
	
    private String brand;
    private float price;
    private String color;
    private Scanner sc = new Scanner(System.in);

     // Getter Setter but here no need to create getter setter we can directly access Member variables .. but here i'm following follow 
    // that's why i m created , you can may or may not be created its depend on you..
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

     // Override the shoes Interface methods and Define them..
    @Override
    public void create() {
        System.out.println("Enter shoes Name");
        String name = sc.nextLine();
        setBrand(name);

        System.out.println("Enter shoes Price");
        float price = sc.nextFloat();
        setPrice(price);

        System.out.println("Enter shoes Color");
        String color = sc.next();
        setColor(color);
    }

    @Override
    public void readShoes() {
        System.out.println("Shoes Brand Name is: " + getBrand());
        System.out.println("Shoes Price is: " + getPrice());
        System.out.println("Shoes Color is: " + getColor());
    }

    @Override
    public void updateShoes() {
        System.out.println("Enter shoes Name");
        String name = sc.nextLine();
        setBrand(name);

        System.out.println("Enter shoes Price");
        float price = sc.nextFloat();
        setPrice(price);

        System.out.println("Enter shoes Color");
        String color = sc.next();
        setColor(color);
    }

    @Override
    public void deleteShoes() {
        setBrand("");
        setPrice(0);
        setColor("");
    }
}
