import java.util.*;

public class ArrayListExample4 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> reverse_al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		// accessing the element
		System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		al.set(1, "Dates");
		// Traversing list
		for (String fruit : al)
			System.out.println(fruit);
		
		reverse_al = al;
		
		for (int i = 0; i < al.size() ; i++) {
			reverse_al.set(i, al.get(al.size()-1-i));
		}
		for (String fruit : reverse_al)
			System.out.println(fruit);

	}
}