
abstract class Person2   	// Person類別宣告 
{  // 成員資料
   public String name;   	// 姓名
   public int age;       		// 年齡  
   // 抽象方法: 計算總分或總價
   public abstract void total();
   
   public abstract void avg();
   
   public void area()
   {
	   System.out.println("Person2"); 
	   
   }
   
   public void area2()
   {
	   System.out.println("Person22"); 
	   
   }
   
}
// Student類別宣告
class Student extends Person2
{
   // 成員資料
   public String stdNo;
   public double test1, test2;
   // 建構子
   public Student(String no, String name, 
             int age, double t1, double t2)
   {  stdNo = no;
      this.name = name;
      this.age = age;
      test1 = t1; 
      test2 = t2;
   }
   
   // 成員方法: 實作抽象方法total()
   public void total()
   { 
     System.out.println("總分:"+(test1+test2)); 
   }
   
   public void avg()
   { 
     System.out.println("總分:"+(test1+test2)/2); 
   }
   
   
   
   
   
}





//主程式類別
public class AbstractTest
{ 
  // 主程式
  public static void main(String[] args) 
  {
     Student s;     // 類別的物件變數
     // 宣告Student類別型態的變數, 並且建立物件
     Student s1 = new Student("stu1","apple",40, 88, 76);
     Person2 p2 = new Student("stu2","android",30,67,23);
     // 顯示學生s1的資料
     System.out.println("學生s1的資料 =====");
     System.out.println("編號: " + s1.stdNo);
     System.out.println("姓名: " + s1.name);
     System.out.println("年齡: " + s1.age);
     // 呼叫物件的副本方法
     s1.total();
     // 顯示學生s2的資料, 檢查是否為Student的副本
     if (p2 instanceof Student) 
        System.out.println("->p2是Student類別副本");
     System.out.println("學生p2的資料 =====");
     
//     System.out.println("編號: " + p2.stdNo);
//     System.out.println("編號: " + p2.test1);
//     System.out.println("編號: " + p2.test2);
     
     
     
     s = (Student) p2;   // 型別轉換
     System.out.println("編號: " + s.stdNo);
     System.out.println("編號: " + s.test1);
     System.out.println("編號: " + s.test2);
     
     System.out.println("姓名: " + p2.name);
     System.out.println("年齡: " + p2.age);
     
     System.out.println("姓名: " + s.name);
     System.out.println("年齡: " + s.age);
     
     
     // 呼叫物件的副本方法
     p2.total();
     
     s.total();
  }
}
