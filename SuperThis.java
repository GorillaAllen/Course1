class Book {
	String name;
	double price;
	String author;

	Book(String n, double p, String a) {
		name = n;
		price = p;
		author = a;
	}

	void show() {
		System.out.println("書名: " + name);
		System.out.println("定價: " + price);
		System.out.println("作者: " + author);
	}
}

class ComputerBook extends Book {
	boolean hasDisk;

	ComputerBook(String n, double p, String a, boolean h) {
		super(n, p, a);
		hasDisk = h;
		this.show();
	}

	void show() {
		super.show();
		System.out.println("附光碟? " + hasDisk);
	}
}

public class SuperThis {
	public static void main(String[] args) {
		ComputerBook cBook = new ComputerBook("Java程式設計", 580.0, "張搧風", true);
	}
}
