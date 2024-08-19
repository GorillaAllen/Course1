// 自訂Exception類別, 繼承Exception類別
class UserException extends Exception { // 變數宣告
   int data;

   // 建構子
   public UserException(int data) {
      this.data = data;
   }

   // 覆寫getMessaeg()方法
   public String getMessage() {
      return ("錯誤! 出價太多次: " + data);
   }
}

// 主程式類別
public class DefineExceptionClass { // 主程式
   public static void main(String[] args) {
      try {
         int i;
         for (i = 0; i < 5; i++) {
            if (i == 3) { // 丟出自訂的例外
            System.out.println("出價次數: " + i);
               throw new UserException(3);
            }
            System.out.println("次數檢查: " + i);
         }
      } catch (UserException e) { // 處理自訂的例外
         System.out.println("例外說明: " + e.getMessage());
         System.out.print("例外原因: ");
         e.printStackTrace();
         return;
      } finally {
         System.out.println("錯誤處理結束!");
      }
      System.out.println("程式結束!");
   }
}



