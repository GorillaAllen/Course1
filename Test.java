abstract class Shape1 // Shape 抽象類別宣告

{ // 成員資料
  
  public double x; // X 座標

  public double y; // y 座標

// 抽象方法 : 計算面積
  public abstract void area();
}

interface IPerimeter // IPerimeter 介面宣告

{ // 介面方法 : 計算周長

   void perimeter();
}

// Rectangle 類別宣告

class Rectangle2 extends Shape1 implements IPerimeter

{ // 成員資料

   public double width;

   public double height;

// 建構子

  public Rectangle2(double x, double y, double width, double height)
	{  this.x = x; 
	   this.y =y;
	   this.width =width;
	   this.height =height;
	}





// 成員方法 : 實作抽象方法 area()

    public void area()
     { System.out.println("長方形面積:"+width*height);}

// 成員方法 : 實作介面方法 perimeter()

    public void perimeter()
   {

    System.out.println("長方形周長 :"+2*(width+height));

   }
}





public class Test

{

	public static void main(String [] args )
	{
		Shape1 s; // 抽象類別的物件變數
		Rectangle2 r; // 類別的物件變數
		
		Rectangle2 r1 = new Rectangle2(5.0 , 10.0, 4.0, 5.0);
		Shape1 r2 = new Rectangle2(10.0 , 10.0, 7.0, 9.0);
		IPerimeter r3 = new Rectangle2(10.0 , 15.0, 4.0, 8.0);
		
		System.out.println("長方形 r1 的資料 ====");
		System.out.println("X,Y 座標 :"+r1.x+r1.y);
		System.out.println("寬 高 :"+r1.width+r1.height);
		
		r1.area(); // 呼叫物件的副本方法
		
		r1.perimeter();
		
		if (r2 instanceof Rectangle2)
		
		System.out.println("r2 是 Rectangle 類別副本");
		
		System.out.println("長方形 r2 的資料");
		
		System.out.println("X,Y 座標 :"+r2.x+ r2.y);
		
		r = (Rectangle2) r2; // 型別轉換
		
		System.out.println("寬 高 "+r.width+r.height);
		
		r2.area(); // 呼叫物件的副本方法
		
		r.perimeter();
		
		if (r3 instanceof Rectangle2)
		
		System.out.println("r3 是 Rectangle 類別副本");
		System.out.println("長方形 r3 的資料===");
		
		s = (Rectangle2) r3; // 型別轉換
		System.out.println ("X,Y 座標="+s.x+s.y );
		
		r = (Rectangle2) r3; // 型別轉換
		
		System.out.println("寬 高 "+r.width+r.height);
		s.area (); // 呼叫物件的副本方法
		r3.perimeter();
	}
}

