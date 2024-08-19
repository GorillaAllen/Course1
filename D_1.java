class C_1 {
//	int i;

	 private int i;

	// if i value is private open below

	 void change_i_value(int value)
	 {
	
	 i=value;
	 }
	
	 void show_i_value()
	 {
	
	 System.out.println("i_value = "+i);
	 }
}

public class D_1 {
	public static void main(String[] args) {
		C_1 c1 = new C_1();

//		c1.i = 10;
//		System.out.println("c1.i = " + c1.i);
//		c1.i = 20;
//		System.out.println("c1.i = " + c1.i);

//		if i value is private open below

		 c1.change_i_value(10);
		 c1.show_i_value();
		
	}
}
