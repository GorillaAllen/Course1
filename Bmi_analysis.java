import java.util.Scanner;

public class Bmi_analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   float height, weight, bmi;
   int age;
   String name;
   Scanner s=new Scanner(System.in);
   
   System.out.println("請輸入姓名來計算BMI, 或是輸入exit退出");
   name = s.next();
   
   while(true) {
	   if(name.equals("exit")) {
		   System.out.println("感謝使用,祝愉快 :)");
		   break;
	   }
	   else {

		   System.out.println("請輸入年齡");
		   age = s.nextInt();
   
		   System.out.println("請輸入身高(公分)");
		   height = s.nextFloat();
   
		   System.out.println("請輸入體重(公斤)");
		   weight = s.nextFloat();
   
		   bmi = weight / (height/100) / (height/100);
   
		   System.out.println("姓名:" +name + " 年齡:" +age + " 身高:" +height +" 體重:" +weight );
		   System.out.println("你的BMI是: "+bmi );
   
		   if(bmi>=27) {
			   System.out.println("我認識5個胖子,你是其中3個.需要立刻力行「健康體重管理」囉");
		   }
		   else if(bmi>=24) {
			   System.out.println("還不是肥宅,但快了");
		   }
		   else if(bmi>=18.5) {
			   System.out.println("健康寶寶");
		   }  
		   else {
			   System.out.println("麥當勞好吃喔");
		   }
	   }
   System.out.println("\n請輸入姓名來計算BMI, 或是輸入exit退出");
   name = s.next();
   }
 
   s.close();
}
}
