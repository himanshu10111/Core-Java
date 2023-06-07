package Basicjava;

public class TypeCasing {
	
	// Basically Type casting means you assign one primitive data type to another.
	
	// Widening Casting (automatically) - converting a smaller type to a larger type size
	//byte -> short -> char -> int -> long -> float -> double

	//Narrowing Casting (manually) - converting a larger type to a smaller size type
	// double -> float -> long -> int -> char -> short -> byte
	
	public static void main(String[] args) {
	
		int integer=10;
		float decimal= integer;
		
		System.out.println(decimal);
		
		float dec=20.33f;
		
		// int a=dec; this type of type casting is not valid show error:
		
		int example = (int) dec;
		
		System.out.println(example);
			
	}	

}