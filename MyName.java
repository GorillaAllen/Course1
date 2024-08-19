public class MyName {
	// 建構子應用
	void ShowMyName(String name) {
		System.out.println("我是" + name);
	}

	MyName(String name) {
		ShowMyName(name);
	}

	MyName(int age) {
		System.out.println("ags is " + age);
	}

	public static void main(String[] args) {
		String name = "王小明";
		int age = 18;
		MyName a = new MyName(name);
		MyName a1 = new MyName(18);
		a.ShowMyName(name);

		String nameb = "louis";
		MyName b = new MyName(nameb);
		b.ShowMyName(nameb);

		String namec = "alvin";
		MyName c = new MyName("alvin");
		c.ShowMyName(namec);
	}
}
