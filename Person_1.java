class UserAccount1 
{
   private int balance; // 帳戶餘額

	   void clearAccount() 
	   {
	      balance = 0;
	   } // 清空帳戶餘額的 "方法"

	   
	   void deposit(int m) 
	   {
	      balance = balance + m;
	   } // 存錢的 "方法"

	   
	   void  withdraw_deposit(int n) 
	   {
		  if (balance < n) {
		  System.out.println("餘額不足,無法提款");
		  }	  
		  else {
	      balance = balance - n;
	      System.out.println("帳戶餘額: " + balance);
	      }
	      
	      
	   } // 提錢的 "方法"
	   
	   
	   int getBalance() 
	   {
	      return balance;
	   } // 顯示目前餘額的 "方法"


}









public class Person_1 {
   public static void main(String[] args) {
      UserAccount1 Apple = new UserAccount1(); // 產生帳戶：Apple
      UserAccount1 Android = new UserAccount1(); // 產生帳戶：Android
      
      
      
      Apple.clearAccount(); // Apple 的帳戶餘額清空
      Android.clearAccount(); // Android 的帳戶餘額清空
      
      System.out.println("***** 清空帳戶餘額 *****  ");
      System.out.println("Apple has " + Apple.getBalance() + " dollars."); // 顯示 Apple 目前的帳戶餘額
      System.out.println("Android has " + Android.getBalance() + " dollars."); // 顯示 Android 目前的帳戶餘額
      
      
      
      Apple.deposit(1500); // Apple 存1500 元
      Android.deposit(2200); // Android 存 2200 元
      
      System.out.println("***** 存款後餘額 *****  ");
      System.out.println("Apple has " + Apple.getBalance() + " dollars."); // 顯示 Apple 目前的帳戶餘額
      System.out.println("Android has " + Android.getBalance() + " dollars."); // 顯示 Android 目前的帳戶餘額
  
      
      
      Apple.withdraw_deposit(500); // Apple 提款500 元
      Android.withdraw_deposit(300); // Android 提款300 元
    
      System.out.println("***** 提款後餘額 *****  ");
      System.out.println("Apple has " + Apple.getBalance() + " dollars."); // 顯示 Apple 目前的帳戶餘額
      System.out.println("Android has " + Android.getBalance() + " dollars."); // 顯示 Android 目前的帳戶餘額
   
   
   }
}
