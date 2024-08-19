public class CallStackDemo {
	static void method1() {
		method2();
	}

	static void method2() {
		int i;
		i = 4 / 0;
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Devide by 0!  Please try again!");
			e.printStackTrace();
		}

		System.out.println("apple");
	}
}
