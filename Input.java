import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);

        System.out.println("請輸入學生姓名？");
        String name = s.next();
        
        System.out.println(name+"，同學您好!請再輸入您的年紀(整數)");
        int age = s.nextInt();
        
        System.out.println(name+"您的年紀為"+age+"歲");

        System.out.println("測式程式結束。");

        s.close();    // 關閉Scanner物件

	}

}
