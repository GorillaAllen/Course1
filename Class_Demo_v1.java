class Demo {
	int i;		
}

class Car {
	int j;		
}

class Class_Demo_v1 {
	public static void main(String[] args) {				
  //    int x;		
//		Demo D_object1; // 宣告物件 D_object1\
//		D_object1 = new Demo(); // 產生物件 D_object1

		// int x           = 5;
		
		 Demo D_object1 = new Demo(); 
		 Demo D_object2 = new Demo();
		 Demo D_object3 = new Demo();
		// Car D_object1 = new Car(); 
		 
		 
		 
		 D_object1.i=100;
		 System.out.printf("D_object1.i的值為 = %d %n",D_object1.i);
		 	 
		 D_object2.i=200;
		 System.out.printf("D_object2.i的值為 = %d  %n",D_object2.i);
		 
		 D_object3.i=300;
		 System.out.printf("D_object3.i的值為 = %d  %n",D_object3.i);
		 
		// D_object1.i=100;
		 System.out.printf("D_object1.i的值為 = %d %n",D_object1.i);

		// int x = 5
		// String y ="apple"

	}
}
