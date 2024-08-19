public class ThrowTest2 { // 類別方法: 計算a*b/c的值
   static double cal(double a, double b, double c) throws IllegalArgumentException {
      double value;
      if (c == 0) { // 丟出IllegalArgumentException例外
         throw new IllegalArgumentException("c不能是0!");
      } else {
         value = a * b / c;
         if (value < 0) { // 丟出IllegalArgumentException例外
            throw new IllegalArgumentException("運算結果小於0");
         }
      }
      return value;
   }

   // 主程式
   public static void main(String[] args) {
      double result;
      try { // 取得參數值
         double a = Double.parseDouble(args[0]);
         double b = Double.parseDouble(args[1]);
         double c = Double.parseDouble(args[2]);
         result = cal(a, b, c); // 呼叫方法
         System.out.println("計算結果: " + result);
      } catch (IllegalArgumentException e) { // 處理IllegalArgumentException例外
         System.out.println("例外說明: " + e.getMessage());
         System.out.print("例外原因: ");
         e.printStackTrace();
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
      }
   }
}
