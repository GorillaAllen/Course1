class Demo_v1 {
	int i;
}

class stu_profile{
	int stu_id ,chinese, english, math, history, physics,sum;
	float   average;
}

class stu_profile_demo {
	public static void main(String[] args) {
		
		stu_profile s1 = new stu_profile();
		s1.stu_id = 1;
		s1.chinese = 10;
		s1.english = 10;
		s1.math = 10;
		s1.history = 10;
		s1.physics = 10;
		s1.sum = s1.chinese + s1.english + s1.math + s1.history + s1.physics;
		s1.average = (float) s1.sum / 5;
		System.out.printf(
		"學生座號: %d  國文:%d  英文:%d  數學:%d  歷史:%d  物理:%d  總和:%d  平均:%.2f\n", 
		s1.stu_id,s1.chinese,s1.english,s1.math,s1.history,s1.physics,s1.sum,s1.average);
		
		
		stu_profile s2 = new stu_profile();
		s2.stu_id = 2;
		s2.chinese = 20;
		s2.english = 20;
		s2.math = 20;
		s2.history = 20;
		s2.physics = 20;
		s2.sum = s2.chinese + s2.english + s2.math + s2.history + s2.physics;
		s2.average = (float)s2.sum / 5;
		System.out.printf(
		"學生座號: %d  國文:%d  英文:%d  數學:%d  歷史:%d  物理:%d  總和:%d  平均:%.2f\n", 
		s2.stu_id,s2.chinese,s2.english,s2.math,s2.history,s2.physics,s2.sum,s2.average);
		
		stu_profile s3 = new stu_profile();
		s3.stu_id = 3;
		s3.chinese = 30;
		s3.english = 30;
		s3.math = 30;
		s3.history = 30;
		s3.physics = 30;
		s3.sum = s3.chinese + s3.english + s3.math + s3.history + s3.physics;
		s3.average = (float) s3.sum / 5;
		System.out.printf(
		"學生座號: %d  國文:%d  英文:%d  數學:%d  歷史:%d  物理:%d  總和:%d  平均:%.2f\n", 
		s3.stu_id,s3.chinese,s3.english,s3.math,s3.history,s3.physics,s3.sum,s3.average);
		
		stu_profile s4 = new stu_profile();
		s4.stu_id = 4;
		s4.chinese = 40;
		s4.english = 40;
		s4.math =    40;
		s4.history = 40;
		s4.physics = 40;
		s4.sum = s4.chinese + s4.english + s4.math + s4.history + s4.physics;
		s4.average = (float) s4.sum / 5;
		System.out.printf(
		"學生座號: %d  國文:%d  英文:%d  數學:%d  歷史:%d  物理:%d  總和:%d  平均:%.2f\n", 
		s4.stu_id,s4.chinese,s4.english,s4.math,s4.history,s4.physics,s4.sum,s4.average);
		
		stu_profile s5 = new stu_profile();
		s5.stu_id = 5;
		s5.chinese = 50;
		s5.english = 50;
		s5.math = 50;
		s5.history = 50;
		s5.physics = 50;
		s5.sum = s5.chinese + s5.english + s5.math + s5.history + s5.physics;
		s5.average = (float) s5.sum / 5;
		System.out.printf(
		"學生座號: %d  國文:%d  英文:%d  數學:%d  歷史:%d  物理:%d  總和:%d  平均:%.2f\n", 
		s5.stu_id,s5.chinese,s5.english,s5.math,s5.history,s5.physics,s5.sum,s5.average);
		
		
	
		
		
	//	Demo_v1 D_object1; // 宣告物件 D_object1
	//	D_object1 = new Demo_v1(); // 產生物件 D_object1

		// Demo D_object1 = new Demo();
		// int x = 5
		// String y ="apple"
		
		

	}
}
