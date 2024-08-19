//(1)實體欄位(至少三個)：姓名，毛色，年紀，品種、身高、體重…
//(2)類別欄位:居住地址
//(3)建構子:請設計一個建構子，在建構物件時把實體欄位的初始值都設定好
//(4)宣告實體方法:可以把實體欄位及類別欄位的值都秀出來
//(5)在主程式中建立物件(至少2隻寵物)；再用物件呼叫上面的實體方法

class Pet{
	String name, color, age, breed, height, weight;
	static String address = "花蓮縣貓貓街狗狗號";
	Pet(String a, String b, String c,String d,String e ,String f){
		name  = a;
		color = b;
		age   = c;
		breed = d;
		height= e;
		weight= f;
	}
	
	void show_pet_info(){
		System.out.println("***** 寵物名: "+ name);
		System.out.println("***** 毛色: " + color);
		System.out.println("***** 年紀: " + age);
		System.out.println("***** 品種: " + breed);
		System.out.println("***** 身高: " + height);
		System.out.println("***** 體重: " + weight);
		System.out.println("***** 住址: " + address);
		System.out.println();
	}	
	
}

public class My_pet_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet cat = new Pet("濃湯","黑色","15","Mix","25公分","6公斤");
		Pet dog = new Pet("清湯","白色","14","邊牧","45公分","19公斤");
		cat.show_pet_info();
		dog.show_pet_info();
	}

}
