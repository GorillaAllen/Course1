interface IPet {
   int slow = 4;
   int mid = 12;
   int fast = 20;

   String getSound();

   int getSpeed();
}

class Animal {
   public String name;

   public Animal(String name) {
      this.name = name;
   }
}

class MyDog extends Animal implements IPet {
   public MyDog(String name) {
      super(name);
   }

   public String getSound() {
      return "汪汪";
   }

   public int getSpeed() {
      return IPet.fast;
   }
}

class MyBird extends Animal implements IPet {
	   public MyBird(String name) {
	      super(name);
	   }

	   public String getSound() {
	      return "Ru. r.u ";
	   }

	   public int getSpeed() {
	      return IPet.fast;
	   }
	}

// 主程式類別
public class Interface_Test_2 {
   // 主程式
   public static void main(String[] args) {
      MyDog c = new MyDog("仔仔");
      System.out.println("狗名: " + c.name);
      System.out.println("它的叫聲:" + c.getSound());
      System.out.println("跑的速度:" + c.getSpeed());
   }
}
