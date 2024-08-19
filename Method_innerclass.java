package InnerClassLambda;
class Outer {
	static int x = 10;
	int y = 20;
	int b;

	public void outerMethod(int a) {
		int b = 52;

		class Inner {
			public int z = 30;

			public void show() {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("z = " + z);
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				x = 5000;
				y = 1250;
				System.out.println("**********");
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				//a = 9876;
				b = a; //無法存取所在方法以外的變數

			}

		}

		Inner inner = new Inner();
		inner.show();

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}

public class Method_innerclass {

	public static void main(String[] args) {
		int z = 1234;

		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.outerMethod(z);
		System.out.println("in main outer.x = " + outer.x);
		System.out.println("in main outer.y = " + outer.y);

	}

}
