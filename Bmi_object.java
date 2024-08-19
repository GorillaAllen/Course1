import java.util.Scanner;

class Student_bmi_data{
	double height, weight, bmi;
	
	Student_bmi_data(double hei, double wei){
	height = hei;
	weight = wei;
	bmi = wei / (hei/100) / (hei/100);
	}
	
//	double calculator(double height, double weight) {
//		return weight / (height/100) / (height/100);

}

public class Bmi_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hei, wei;
		Scanner s=new Scanner(System.in);
		Student_bmi_data a1[] = new Student_bmi_data[5];
		
		for(int i=0 ; i < 5 ; i++) {
			System.out.println("請輸入身高(公分): ");
			hei = s.nextDouble();
			System.out.println("請輸入體重(公斤): ");
			wei = s.nextDouble();
			a1[i] = new Student_bmi_data(hei, wei);
		}
		
		for(int i=0 ; i < 5 ; i++) {
			System.out.printf("BMI為: %.2f\n", (float) a1[i].bmi );
		}
		

	}

}
