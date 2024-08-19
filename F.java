class C2 {
	private int i;
	public void setInfo(int x) { i = x; }
	public int getInfo() { return i; }
}
class D2 extends C2 {}   // ���O D �~�����O C
class E2 extends C2 {}   // ���O E  �~�����O C

public class F {
	public static void main(String[] args) {
		D2 d = new D2();
		E2 e = new E2();		
		d.setInfo(5);
		e.setInfo(7);		
		System.out.println("The value of d is "+d.getInfo());
		System.out.println("The value of e is "+e.getInfo());
	}
}
