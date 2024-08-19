package generic;

public class TestGenerics4 {

	public static <E> void printArray(E[] array_name) {
		for (E i : array_name) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
	}
}