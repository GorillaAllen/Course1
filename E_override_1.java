class C2_1 {

	int i =10;
	
	void f(String s) 
	{
		System.out.println ("f in class C: "+s);
	}	
}

class D2_1 extends C2_1 {

	//變數覆寫
	int i =500;
	
	//方法覆寫
	void f(String s) 
	{
		System.out.println ("f in class D: "+s); // 父類別中的方法 f 將被此方法覆寫！
	}
}

class F2_1 extends C2_1 {}

public class E_override_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2_1 d = new D2_1();
		F2_1 f = new F2_1();
		System.out.println("d = "+ d.i);
		System.out.println("d = "+ f.i);
		
		
		d.f("hello");
		f.f("apple");
	}

}
