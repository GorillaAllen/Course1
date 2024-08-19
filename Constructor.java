class Company {
	static String city = "台北市";

	String company_name;
	double price;
	String CEO;

	Company() {
		// this.company_name = "LCCNET";
		// this.price = 0.0;
		// this.CEO = "LCCNET";
		company_name = "LCCNET";
		price = 0.0;
		CEO = "LCCNET";
	}

	Company(String company_name, double price, String CEO) {
		// this.company_name = n;
		// this.price = p;
		// this.CEO = a;
		this.company_name = company_name;
		this.price = price;
		this.CEO = CEO;
		city = "新北市";
	}

	void show() {
		// System.out.println("公司名稱：" + this.company_name);
		// System.out.println("公司價值：" + this.price);
		// System.out.println("CEO：" + this.CEO);

		System.out.println("公司名稱：" + company_name);
		System.out.println("公司價值：" + price);
		System.out.println("CEO：" + CEO);
		System.out.println("城市：" + city);
	}
}

public class Constructor {
	public static void main(String[] args) {
		

		System.out.println("靜態(類別)變數(欄位)城市：" + Company.city);

		Company com1 = new Company("apple", 60000, "apple");
		com1.show();

		Company com2 = new Company();
		com2.show();
	}
}