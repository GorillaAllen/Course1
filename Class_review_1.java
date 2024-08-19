class Vehicle{
	String brand;
	int cc , power, price;
	String style;
	
	//new Car("Benz",1800,246,"SUV");
	Vehicle(String x,int y,int z,String st, int $){
		brand=x;
		cc=y;
		power=z;
		style=st;
		price=$;
	}
		
	void show_car_info()
	{
		System.out.println("***** 汽車Brand: "+brand);
		System.out.println("***** 汽車gas: "+cc);	
		System.out.println("***** 汽車speed: "+power);	
		System.out.println("***** 汽車style: "+style);	
		System.out.println("***** 汽車價格: "+ price);	
		
	}
	
	int speed_return()
	{
		power=power+10;
		return power;
	}
	
	
}







public class Class_review_1 {

	public static void main(String[] args) {
		
		Vehicle c1=new Vehicle("Benz",1800,246,"SUV",9527);
		Vehicle c2=new Vehicle("TOYOTA",1800,180,"SUV",8964);
		c1.show_car_info();
		c2.show_car_info();
		int tmp_speed=c1.speed_return();
		
		System.out.println("***** 汽車speed: "+tmp_speed);
		// TODO Auto-generated method stub

	}

}
