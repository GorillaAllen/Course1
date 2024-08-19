public class PassArgDemo {
	static void myMethod2(int[] i) {
		for (int j = 0; j <= i.length; j++) {
			i[0] = i[0] + 1;
			System.out.println("In MyFunc(): " + i[0]);
		}
	}

	public static void main(String[] args) {
		int[] i = { 10, 11, 12 };
		myMethod2(i); // call by reference
		System.out.println("In main(): " + i[0]);
	}
}
