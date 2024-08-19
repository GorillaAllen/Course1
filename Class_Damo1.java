class Demo2 {
	int i;
	int age;
	String name;
}

class Stu_profile {
	String name;
    int stu_id;
	float Chi,Eng,Math,society,Nature,sum,avg;
	
	
	
	
	

	
   void score_value()
   {
	   sum=Chi+Eng+Math+society+Nature;
	   avg=sum/5;
   }
	
}

class Class_Damo1 {
	public static void main(String[] args) {

		
		Student_profile s1= new Student_profile();
		Student_profile s2= new Student_profile();
		Student_profile s3= new Student_profile();
		s1.Chi=100;
		s1.Eng=95;
		s1.Math=85;
		s1.society=80;
		s1.Nature=88;
		
		s1.score_value();
	
		System.out.println(" s1.sum = " + s1.sum);
		System.out.println(" s1.avg = " + s1.avg);
		
		// object 1
		Demo2 D_object1 = new Demo2();
		D_object1.i = 10;
		D_object1.age = 28;
		System.out.println(" D_object1.i = " + D_object1.i);
		System.out.println(" D_object1.age = " + D_object1.age);	
		D_object1.i = 20;
		System.out.println(" D_object1.i = " + D_object1.i);

		// object 2
		Demo2 D_object2 = new Demo2();
		D_object2.i = 100;
		D_object2.age = 18;
		
		System.out.println(" D_object2.i = " + D_object2.i);
		System.out.println(" D_object2.age = " + D_object2.age);
	}
}
