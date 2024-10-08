import java.io.*;
import java.util.Vector;

public class ExceptionDemo {
	public static void main(String[] args) {
		ListOfNumbers num = new ListOfNumbers();

		num.writeList();
		System.out.println("One file has been created as \"OutFile.txt\"");
	}
}

class ListOfNumbers {
	private Vector victor;
	private static final int size = 10;

	public ListOfNumbers() {
		victor = new Vector(size);
		for (int i = 0; i < size; i++)
			victor.addElement(new Integer(i));
	}

	public void writeList() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i = 0; i < size; i++)
				System.out.println("Value at: " + i + " = " + victor.elementAt(i));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("File has been closed!");
				out.close();
			} else {
				System.out.println("File has not been created!");
			}
		}
	}
}
