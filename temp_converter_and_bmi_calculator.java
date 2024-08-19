import java.util.Scanner;

public class temp_converter_and_bmi_calculator {

	
	static float bmi_calculator(float x, float y) {
		return x / (y/100) / (y/100); //return bmi
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		String m; // for option
		float degree, height, weight, bmi; // 
		
		System.out.println("請選擇:\n輸入1使用溫度換算功能\n輸入2使用BMI計算功能");
		Scanner s=new Scanner(System.in);
		option = s.nextInt();
		
		if( option == 1 ) {
			System.out.println("想要華氏轉攝氏溫度,請輸入A. 想要攝氏轉華氏溫度,請輸入B.");
	        m = s.next();
	        
	        switch(m)
		      {
		         case "A" :
		            System.out.println("請輸入華氏溫度:");
		            degree = s.nextFloat();
		            degree = ( degree - 32 ) / 9 * 5;
		            System.out.println("攝氏溫度為:" +degree);
		            break;
		            
		         case "B" :
		        	System.out.println("請輸入攝氏溫度:");
			        degree = s.nextFloat();
			        degree = degree * 9 / 5 + 32;
			        System.out.println("華氏溫度為:" +degree);
		        	break;
		         
		         default :
		            System.out.println("你很頑皮");
		      }	        
		}
		else if (option == 2) {
			System.out.println("請輸入身高(公分)");
			height = s.nextFloat();	   
			System.out.println("請輸入體重(公斤)");
			weight = s.nextFloat();
			bmi = bmi_calculator( weight, height );
			System.out.println("您的BMI是" + bmi );
		}
		else {System.out.println("別鬧惹");}
		
		
	s.close();
	}

}
