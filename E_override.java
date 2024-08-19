
class C3 {

	int i =10;
	
	void f(String s) 
	{
	
		System.out.println ("f in class C: "+s);
	}
	
}



class D3 extends C3 {

	//變數覆寫
	int i =500;
	
	//方法覆寫
	void f(String s) 
	{
	
		System.out.println ("f in class D: "+s); // 父類別中的方法 f 將被此方法覆寫！

	}

}
public class E_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D3 d = new D3();
	
		System.out.println("d = "+ d.i);
		
		
		d.f ("hello");
	}

}
