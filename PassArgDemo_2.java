public class PassArgDemo_2 {

	static void myMethod1(int i) {
		i += 5;
		System.out.println("In MyFunc(): " + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 15;
		myMethod1(i); // call by value
		System.out.println("In main(): " + i);
	}
}
