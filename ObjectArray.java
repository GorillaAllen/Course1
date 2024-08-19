class Company1 {
	String company_name;
	double price;
	String ceo;
	int tel;

	
	Company1() {
	}
	
	
	Company1(String n, double p, String a) {
		company_name = n;
		price = p;
		ceo = a;
	}

	
	Company1(String n, double p) {
		company_name = n;
		price = p;
	}
	
	
	void show() {
		System.out.println("公司名：" + company_name);
		System.out.println("價格：" + price);
		System.out.println("ceo：" + ceo);
	}


}




public class ObjectArray {
	public static void main(String[] args) {
		
//		int x1=10;
//		
//		int []x=new int[10];
//		
//		x[0]=5;
//		x[1]=10;
//		
//		x[9]=100;
		
		Company1 com0 = new Company1();
		
		Company1[] com1 = new Company1[3];
		
		
		
		com1[0] = new Company1("Android", 30000000, "Lccnet");
		com1[1] = new Company1("Apple", 65000000, "Hook");	
		com1[2] = new Company1();
//		
		com1[2].company_name="Nvidia";
		com1[2].price=3000000000000.0;
		com1[2].ceo="Jensen";
//		
		for (Company1 com : com1)
			com.show();
	}
}
