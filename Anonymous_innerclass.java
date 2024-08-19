package InnerClassLambda;

interface Book {
	void show();

}

public class Anonymous_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * class test implement Book{
		 * 
		 * public void show() { System.out.println("匿名內部類別example");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * Book book = new test();
		 * 
		 * book.show();
		 */

		// Book book = new xxxxx implement Book()

		Book book = new Book() {
			public void show() {
				System.out.println("匿名內部類別example");

			}
		};

		book.show();

	}

}
