package InnerClassLambda;
class OuterClass_example {
	double x = 3.14159;
	static int z = 50;
	// int y = 300;
	static int y = 300;

	static class InnerClass_example {
		int y = 5;

		public void show() {

			// System.out.println(OuterClass_example.x);
			System.out.println(OuterClass_example.z);

			// System.out.println(this.y);
			System.out.println("this is inner class's y_value=" + y);
			System.out.println("this is outter class's y_value=" + OuterClass_example.y);

		}

	}
}

public class InnerClass_static {
	public static void main(String[] args) {

		/*
		 * 
		 * OuterClass_ex Outer_cla = new OuterClass_ex(); OuterClass_ex.InnerClass_ex
		 * Inner_cla = Outer_cla.new InnerClass_ex();
		 * 
		 * 
		 */

		OuterClass_example.InnerClass_example inner_obj = new OuterClass_example.InnerClass_example();
		System.out.println(inner_obj.y);

		// System.out.println(inner_obj.z);
		System.out.println(OuterClass_example.z);
		// System.out.println(OuterClass_example.x);

		inner_obj.show();

	}
}
