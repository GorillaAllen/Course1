//(1) 請撰寫一個 Engine (引擎) 類別。1600cc 引擎的成本是 20000 元，2000cc 引擎的成本是 25000 元。
//請製造一個 1600cc 的引擎及一個 2000cc 的引擎，呼叫其 getCost (成本) 方法，印出其傳回值。
//(2) 請撰寫一個 Aircond (空調) 類別。Auto 空調的成本是 12000 元，Manual 空調的成本是 10000 元。
//請製造一個 Auto 的空調及一個 Manual 的空調，呼叫其 getCost (成本) 方法，印出其傳回值。
//(3) 請撰寫一個 Sound (音響) 類別。
//一個音響的成本是 2000 元，請製造一個 Sound 物件，呼叫其 getCost (成本) 方法，印出其傳回值。
//Hint 撰寫一個父類別，裡面包含金額(屬性、變數、欄位)及一個計算金額的方法(回傳其前面金額變數的值)
//由Engine (引擎) 、 Aircond (空調)、Sound (音響) 類別來繼承
//利用建構子來設定好其金額及相關資料的判斷
//最後由主程式來產生各類物件來計算其金額(共有5個物件)

import java.util.Scanner;

class Part_price_data_r1{
	int price;
	String name;

	int getCost(){
		return price;
	}
}	
class Engine_r1 extends Part_price_data_r1{
	Engine_r1(int i){
		price = i;
	}
}
class Aircond_r1 extends Part_price_data_r1{
	Aircond_r1(int i){
		price = i;
	}
}
class Sound_r1 extends Part_price_data_r1{
	Sound_r1(int i){
		price = i;
	}
}
	


public class Car_part_price_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		String option;
		String name;
		
		Engine_r1 cc_1600 = new Engine_r1(20000);
		cc_1600.name = "1600cc engine";
		Engine_r1 cc_2000 = new Engine_r1(25000);
		cc_2000.name = "2000cc engine";
		Aircond_r1 auto = new Aircond_r1(12000);
		auto.name = "auto AC";
		Aircond_r1 manual = new Aircond_r1(10000);
		manual.name = "manual AC";
		Sound_r1 sound = new Sound_r1(2000);
		sound.name = "sound system";
		
		System.out.println("請輸入欲查價零件類別:");
		System.out.println("A:引擎類");
		System.out.println("B:空調類");
		System.out.println("C:音響");
		
		Scanner s = new Scanner(System.in);
		option = s.next();
		
		switch(option) {
		case "A":
		case "a":
			System.out.println("請輸入欲查價引擎型號:");
			System.out.println("A:1600cc");
			System.out.println("B:2000cc");
			option = s.next();
			switch(option) {
				case "A":
				case "a":
					price = cc_1600.getCost();
					name = cc_1600.name;
					System.out.println("the cost of " + name + " is " + price);
					break;
				default:
					price = cc_2000.getCost();
					name = cc_2000.name;
					System.out.println("the cost of " + name + " is " + price);
			}
		break;
		case "B":
		case "b":
			System.out.println("請輸入欲查價空調型號:");
			System.out.println("A: auto");
			System.out.println("B: manual");
			option = s.next();
			switch(option) {
				case "A":
				case "a":
					price = auto.getCost();
					name  = auto.name;
					System.out.println("the cost of " + name + " is " + price);
				break;
				default:
					price = manual.getCost();
					name  = manual.name;
					System.out.println("the cost of " + name + " is " + price);
			}
		break;
		default:
			price = sound.getCost();
			name  = sound.name;
			System.out.println("the cost of " + name + " is " + price);	
		}
	}
}
