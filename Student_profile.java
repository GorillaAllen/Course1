class Student_data{
	String name;
	byte serial_num; 
	double lucky_num;
	static byte class_num = 104;
	
	Student_data(){
		do {
		lucky_num = Math.random();
		lucky_num=lucky_num*100;
		}
		while((int)lucky_num == 0);
	}
	
	void display(){
		System.out.println("班級:"+ class_num + "\t姓名:"+ name + "\t座號:" + serial_num + "\t幸運號碼:" + (int) lucky_num);
	}
}


public class Student_profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_data a1 = new Student_data();
		a1.name = "唐伯虎";
		a1.serial_num = 95;
		a1.display();
		
		Student_data a2 = new Student_data();
		a2.name = "秋香";
		a2.serial_num = 27;
		a2.display();
		
		Student_data a3 = new Student_data();
		a3.name = "華安";
		a3.serial_num = 59;
		a3.display();
		
	}

}
