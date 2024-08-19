import java.util.Scanner;

class food{
	int price;
	void show_price(){
		System.out.println("此餐點是" + price + "元");
	}
}
class Main_meal extends food{
	Main_meal(String meal_opt){
		switch(meal_opt) {
			case "A":
			case "a":
				System.out.println("滑堡套餐。請選副餐");
				price = 80;
				break;
			case "B":
			case "b":
				System.out.println("大滑堡套餐。請選副餐");
				price = 100;
				break;
			case "C":
			case "c":
				System.out.println("烤雞堡套餐。請選副餐");
				price = 90;
				break;
			default:
				System.out.println("培根堡套餐。請選副餐");
				price = 80;
				break;
}}}

class Second_dish extends food{
	Second_dish(String Second_dish_opt){
		switch(Second_dish_opt) {
			case "A":
			case "a":
				System.out.println("已選薯條。請選甜點");
				price = 40;
				break;
			case "B":
			case "b":
				System.out.println("已選洋蔥圈。請選甜點");
				price = 40;
				break;
			case "C":
			case "c":
				System.out.println("已選雞塊。請選甜點");
				price = 50;
				break;
			default:
				System.out.println("已選雞柳條。請選甜點");
				price = 60;
				break;
}}}

class Dessert extends food{
	Dessert(String dessert_opt){
		switch(dessert_opt) {
			case "A":
			case "a":
				System.out.println("已選霜淇淋。請選飲料");
				price = 40;
				break;
			case "B":
			case "b":
				System.out.println("已選地瓜球。請選飲料");
				price = 40;
				break;
			case "C":
			case "c":
				System.out.println("已選吉拿棒。請選飲料");
				price = 50;
				break;
			default:
				System.out.println("已選爆米花。請選飲料");
				price = 30;
				break;
}}}

class Beverage extends food{

	Beverage(String beverage_opt){
		switch(beverage_opt) {
			case "A":
			case "a":
				System.out.println("已選中杯可樂。");
				price = 40;
				break;
			case "B":
			case "b":
				System.out.println("已選地瓜球。");
				price = 40;
				break;
			case "C":
			case "c":
				System.out.println("已選吉拿棒。");
				price = 50;
				break;
			default:
				System.out.println("已選爆米花。");
				price = 30;
				break;
}}}


public class Menu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item_price =0 , sum = 0;
		String option;
		
		System.out.println("請選主餐:\nA. 滑堡\nB. 大滑堡\nC. 烤雞堡\nD. 培根堡");
		Scanner s = new Scanner(System.in);
		option = s.next();
		Main_meal m1 = new Main_meal(option);
		sum += m1.price;
		
		System.out.println("請選副餐:\nA. 薯條\nB. 洋蔥圈\nC. 雞塊\nD. 雞柳條");
		option = s.next();
		Second_dish sd1 = new Second_dish(option);
		sum += sd1.price;
		
		System.out.println("請選副餐:\nA. 霜淇淋\nB. 地瓜球\nC. 吉拿棒\nD. 爆米花");
		option = s.next();
		Dessert des1 = new Dessert(option);
		sum += des1.price;
		
		System.out.println("請選副餐:\nA. \nB. \nC. \nD. ");
		option = s.next();
		Beverage bev1 = new Beverage(option);
		sum += bev1.price;
		
		
	s.close();
	}
}
