import java.util.Scanner;

class Company1_1 {
	String company_name;
	double price;
	String ceo;
	int tel;

	
	Company1_1() {
	}
	
	
	Company1_1(String n, double p, String a) {
		company_name = n;
		price = p;
		ceo = a;
	}

	
	Company1_1(String n, double p) {
		company_name = n;
		price = p;
	}
	
	
	void show() {
		System.out.println("公司名：" + company_name);
		System.out.println("價格：" + price);
		System.out.println("ceo：" + ceo);
	}


}




public class ObjectArray_1 {
	public static void main(String[] args) {
		
//		int x1=10;
//		
//		int []x=new int[10];
//		
//		x[0]=5;
//		x[1]=10;
//		
//		x[9]=100;
		
		Company1_1 com0 = new Company1_1();
		
		Company1_1[] com1 = new Company1_1[30];
	    String com_name,ceo_name;
	    double value;
		//int i=0;
	    
	    
		//準備輸入相關資訊
	    Scanner input = new Scanner(System.in);	   
	    
	    System.out.println("請問要輸入幾位員工資料" );
	    int emp_count=input.nextInt(); 
	    
	    for (int i=0;i<emp_count;i++)
	    {
	    	System.out.println("請輸入公司名稱:" );
	    	com_name=input.next();
	    	
	    	System.out.println("請輸入資本額:" );
	    	value=input.nextDouble();
	    	
	    	System.out.println("請輸入公司老闆是誰:" );
	    	ceo_name=input.next();
	  
	    	com1[i] = new Company1_1(com_name, value, ceo_name);  	
	    }
	    
	    
	    
	    
//		com1[0] = new Company1_1("Android", 30000000, "Lccnet");
//		com1[1] = new Company1_1("Apple", 65000000, "Hook");	
//		com1[2] = new Company1_1();
//		
//		com1[2].company_name="Nvidia";
//		com1[2].price=3000000000000.0;
//		com1[2].ceo="Jensen";
	    
	   
	    
//	  //秀出所有員工物件陣列(30位)的員工的資料
//		for (Company1_1 com : com1)
//			com.show();
	
	
	    
	    
		
	//秀出您所需入的員工數的資料
		for (int i=0;i<emp_count;i++)
			com1[i].show();
		
		
	}
}
