package louis_20231130;

public class Static_variable_example {

	static int a = 1;
	static int b = 2;

	public static void main(String[] args) {
		System.out.println("static variable a= " + Static_variable_example.a);
		System.out.println("variable b= " + Static_variable_example.b);
		System.out.println("variable b= " + b);

		Static_variable_example obj = new Static_variable_example(); // 創建一個class物件(Object)
		System.out.println("instance variable b= " + obj.b);
		System.out.println("instance variable b= " + obj.a);
		obj.a = 50;
		System.out.println("instance variable a= " + obj.a);
	}

}
