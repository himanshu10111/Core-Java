package AdvanceJava;

public class InheritanceInJava {
	
	public static void main(String[] args) { // main method.
		andriod and= new andriod(); // here  we are creating and as a object of Android class
		iphone ip= new iphone(); // here we are creating ip as a object of iphone class
		
		and.setName("iQoo"); // set values in to it
		and.setBrand("Neo");
		and.setPrice(30000);
		and.setOs("Andriod");
		and.setRam(8);
		and.setRom(128);
		and.setCamrapx(48);
		and.setNfc("andriod NFC");
		
		System.out.println(and.getName()); // get values and print into it on console.
		
		ip.setName("iphone");
		ip.setBrand("SE");
		ip.setPrice(70000);
		ip.setOs("IOS");
		ip.setItag("Air Tag");
		
		System.out.println(ip.getName());
		System.out.println(ip.getItag());
		System.out.println(ip.getOs());
		
		
		
		
		
	}

}

class phone{ // class phone 
	private String name;
	private float price;
	private String brand;
	private int camrapx;
	private int ram;
	private int rom;
	private String os; // Till here all are the instance variable 
	// in below all are the getter setter method for access the variable.
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCamrapx() {
		return camrapx;
	}
	public void setCamrapx(int camrapx) {
		this.camrapx = camrapx;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	
}

class andriod extends phone{ // class android extends phone because android phone have some similar thing present in phone 
	private String nfc;

	public String getNfc() {
		return nfc;
	}

	public void setNfc(String nfc) {
		this.nfc = nfc;
	}
	 
}

class iphone extends phone{ // same android iphone is did.
	private String itag;

	public String getItag() {
		return itag;
	}

	public void setItag(String itag) {
		this.itag = itag;
	}
	
}