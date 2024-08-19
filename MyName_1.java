public class MyName_1 {
	
	
	// 建構子應用
	void ShowMyName(String name) {
		System.out.println("我是" + name);
	}

	
	MyName_1(String name) {
		ShowMyName(name);
	}

	MyName_1(int age) {
		System.out.println("ags is " + age);
	}	
	
	MyName_1(String name , int age) {
		ShowMyName(name);
		System.out.println("ags is " + age);
	}
	
		
	
	public static void main(String[] args) {
		
		String name = "王小明";
		int age = 18;
		
		MyName_1 a = new MyName_1(name);
		MyName_1 a1 = new MyName_1(18);
		MyName_1 a2 = new MyName_1("apple",25);
		
		
		a.ShowMyName(name);
		
		
			
		
		String nameb = "louis";
		MyName_1 b = new MyName_1(nameb);
		b.ShowMyName(nameb);
//
		String namec = "alvin";
		MyName_1 c = new MyName_1("alvin");
		c.ShowMyName(namec);
	}
}
