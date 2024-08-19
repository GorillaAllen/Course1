public class ArrayDeclare {
	public static void main(String[] args) {
		int[] books = new int[3];
		System.out.println("books[0]預設值 = " + books[0]);
		books[0] = 550;
		books[1] = 580;
		books[2] = 470;
		// books[3] = 600; //ArrayIndexOutOfBoundsException
		System.out.println(books[0]);
		System.out.println(books[1]);
		System.out.println(books[2]);
	}
}