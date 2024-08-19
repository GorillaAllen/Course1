public class CallStackDemo2 {
	static void method1() {
		method2();
	}

	static void method2() {
		int i;
		i = 4 / 2;
		
		int x[]=new int [6];
		x[8]=100;
		
	}

	public static void main(String[] args) {
		try {
			method1();
				
		} 
		catch (ArithmeticException e) {
			System.out.println("Devide by 0!  Please try again!");

			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException w2)
		{
			System.out.println("Index out of bounds ");
	
			w2.printStackTrace();
		}
		
		
		
		
		
		
		
		
	

		
		System.out.println("apple");
	}
}
