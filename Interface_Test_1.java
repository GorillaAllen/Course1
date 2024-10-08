interface IArea // IArea介面宣告
{
   // 常數的宣告
   final double PI = 3.1415926;

   // 介面方法: 計算面積
   void area();
}

class Circle_I implements IArea // Circle類別宣告
{
   // 資料成員
   public double x; // X座標
   public double y; // y座標
   private double r; // 半徑
   // 建構子

   public Circle_I(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }

   // 實作IArea介面的方法area()
   public void area() {
      System.out.println("圓面積: " + PI * r * r);
   }
}

class Square implements IArea // 正方形類別宣告
{
   // 資料成員
   public double length; // 邊長
   // 建構子

   public Square(double x) {
      length = x;
   }

   // 實作IArea介面的方法area()
   public void area() {
      System.out.println("正方形面積: " + length*length );
   }
}


// 主程式類別
public class Interface_Test_1 {
   // 主程式
   public static void main(String[] args) {
      // 宣告類別型態的變數, 並且建立物件
      Circle_I c = new Circle_I(6.0, 15.0, 5.0);
      // 呼叫物件的介面方法area()
      c.area();
      // 顯示介面的常數值
      System.out.println("PI常數: " + IArea.PI);
   }
}
