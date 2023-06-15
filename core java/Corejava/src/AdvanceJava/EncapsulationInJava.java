package AdvanceJava;

public class EncapsulationInJava {
	
	public static void main(String[] args) {
		
		bike b1 = new bike();
		b1.setName("Kawasaki Ninja H2");
		b1.setPrice(300000.00f);
		b1.setCompany("kawasaki");
		b1.setModel("Ninja");
		b1.setCc(1000);
		b1.setFuelCapacity(20);
		b1.setTopspeed(412);
		b1.setWatrentyperiod(6);
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		System.out.println(b1.getCompany());
		System.out.println(b1.getModel());
		System.out.println(b1.getCc());
		System.out.println(b1.getFuelCapacity());
		System.out.println(b1.getTopspeed());
		System.out.println(b1.getWatrentyperiod());
		
	}

}

class bike // class bike 
{ // here the all members are private we can not access it directly so that's why we create the getter setter to get and set the data 
	private String name;
	private float price;
	private String company;
	private String Model;
	private int cc;
	private int fuelCapacity;
	private int topspeed;
	private int watrentyperiod;   
	//Till here all are the  instance variable
	// below the getter setter is there
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	public int getWatrentyperiod() {
		return watrentyperiod;
	}
	public void setWatrentyperiod(int watrentyperiod) {
		this.watrentyperiod = watrentyperiod;
	}
	
	
	
}

