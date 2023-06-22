package AdvanceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInJava {
public static void main(String[] args) {
	
	ArrayList<String> books = new ArrayList<String>(); // create Array List
	 
	// Add some Books name in Array List
	
	books.add("Python");
	books.add("java");
	books.add("Ruby");
	books.add("Perl");
	books.add("R");
	books.add("C#");
	// sort the members:
	Collections.sort(books);
	// print all members of Array list..
	for(String i : books)
	{
		System.out.println(i);
	}
	
	// Print single members
	System.out.println(books.get(0));
	System.out.println(books.get(1));
	
	//Change the values "or we can say that update the values"
	books.set(0,"React");
	System.out.println(books.get(0));
	
	// delete the values 
	books.remove(0);
	System.out.println(books.get(0));
	
	// delete all values
	//books.clear();

	
	// check how many elements in array list.

	System.out.println(books.size());
	
	
	
	
}
}

