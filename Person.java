class UserAccount {
   private int balance, value; // 帳戶餘額

   void clearAccount() {
      balance = 0;
   } // 清空帳戶餘額的 "方法"

   void deposit(int m) {
      balance = balance + m;
   } // 存錢的 "方法"
   
   void withdraw(int m) {
	   if(balance < m)
		   System.out.println("餘額不足");
	   else	balance -= m;
   }//提款的"方法"

   private int getBalance() {
      return balance;
   } // 顯示目前餘額的 "方法"
   
   int Balance() {
	   value = balance;
	   return value;
   }
}

public class Person {
   public static void main(String[] args) {
      UserAccount Apple = new UserAccount(); // 產生帳戶：Apple
      UserAccount Android = new UserAccount(); // 產生帳戶：Android
      Apple.clearAccount(); // Apple 的帳戶餘額清空
      Android.clearAccount(); // Android 的帳戶餘額清空
      Apple.deposit(1500); // Apple 存1500 元
      Android.deposit(2200); // Android 存 2200 元
      Apple.withdraw(500); // Apple 提500 元
      Android.withdraw(2450); // Android 提 1450 元
      
      System.out.println("Apple has " + Apple.Balance() + " dollars."); // 顯示 Apple 目前的帳戶餘額
      System.out.println("Android has " + Android.Balance() + " dollars."); // 顯示 Android 目前的帳戶餘額
   }
}
