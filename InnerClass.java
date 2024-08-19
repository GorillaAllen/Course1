package InnerClassLambda;
class OuterClass_ex {
	int x = 10;
	static int outer_z = 100;

	class InnerClass_ex {
		int y = 5;
		static int inner_z = 500;
	}
}

public class InnerClass {
	public static void main(String[] args) {

		OuterClass_ex Outer_cla = new OuterClass_ex();

		// OuterClass_ex.InnerClass_ex Inner_cla = new OuterClass_ex.InnerClass_ex();

		OuterClass_ex.InnerClass_ex Inner_cla = Outer_cla.new InnerClass_ex();

		System.out.println(Inner_cla.y + Outer_cla.x);

		System.out.println(Inner_cla.inner_z);
		System.out.println(OuterClass_ex.outer_z);

	}
}