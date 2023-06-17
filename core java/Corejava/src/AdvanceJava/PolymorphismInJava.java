package AdvanceJava;



public class PolymorphismInJava {
	public static void main(String[] args) {
		
		andriod1 and = new andriod1();
		iphone1 ip = new iphone1();
		
		
		and.callertune();
		ip.callertune();
		
		
	}

}

class phone1{ // class phone1 
	String type;
	String os;
	String price;
	String imeiNo;
	
	public void callertune() // callertune method of phone1 class
	{
		System.out.println("Hey mama Hey mama");
	}
}

class andriod1 extends phone1{ // class andriod 1 
	
	public void callertune(){ // here we re-define the callertune method
		
		System.out.println("Hey rama hey rama");
	}
	
	
}

class iphone1 extends phone1{ // class iphone 1
	
	public void callertune() // callertune method of iphone1
	{
		System.out.println("tuk tuk tuk tuk ");
	}
	
}