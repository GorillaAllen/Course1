public class ThrowDemo {
	public static float method(float x, float y) throws ArithmeticException {
		float result;
		if (y == 2) {
			throw new ArithmeticException("分母為2");
		}
		result = x / y;
		return result;
	}

	public static void main(String[] args) {
		try {
			System.out.println(method(5, 2));

		} catch (ArithmeticException e) {
			System.out.println("Devide by 2!  Please try again!");
			System.err.println("Caught ArithmeticException " + e.getMessage());
			e.printStackTrace();
		}
	}
}
