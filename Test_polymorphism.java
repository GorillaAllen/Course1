
//public class Test {

//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("name is Test");
//	}
//
//}

class C4 {
	// private int i;
	static int w = 10;
	static int i = 10;

	public void setInfo(int x) {
		i = x;
	}// this.i =x (e.i=7)

	public int getInfo() {
		return i;
	} // e.i

	static void getw() {
		System.out.println("static variable w= " + w);
		System.out.println("variable i= " + i);
	}

	int add(int i, int j) {
		return i + j;
	}

	float add(float i, float j) {
		return i + j;
	}

	double add(double i, double j) {
		return i + j;
	}

	int add(int i, float f) {
		return i + (int) f;
	}

	int add(int i, int j, int k) {
		return i + j + k;
	}

}

class D4 extends C4 {
	String name; // 1
	int seatNum = 0; // 2
	double luckyNum = 20; // 3

	void getprofile() {
		System.out.println("name is " + name);
		System.out.println("seatNum is  " + seatNum);
		System.out.println("luckyNum is  " + luckyNum);

	}

	void setprofile(String name, int seatNum) {
		this.name = name;
		this.seatNum = seatNum;
	}

} // 類別 D 繼承類別 C

// class Louis
// interface apple

class E4 extends C4 {

	int i = 50;

} // 類別 E 繼承類別 C

class Test_polymorphism {

	public static void main(String[] args) {

		D4 d = new D4();
		E4 e = new E4();
		C4 c = new C4();

		int c_add2 = c.add(1, 2);
		System.out.println("The value of c_add2 = " + c_add2);

		System.out.println("before setInfo e.i is " + e.i);

		d.setInfo(5);
		e.setInfo(7); // C.i -->(e.i)
		d.i = 6;
		// e.i=8;

		d.w = 60;
		e.w = 80;

		System.out.println("The value of d is " + d.getInfo());
		System.out.println("Tbefore setInfo e.i is " + e.getInfo());
		System.out.println("The value of d.i is " + d.i);
		System.out.println("before setInfo e.i is" + e.i);

		System.out.println("The value of d (w) is " + d.w);
		System.out.println("The value of e (w) is " + e.w);

		int add2 = e.add(1, 2);
		int add3 = e.add(1, 2, 3);
		System.out.println("The value of add2 = " + add2);
		System.out.println("The value of add3 = " + add3);

	}
}
