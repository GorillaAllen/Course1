import java.util.Scanner;

public class Exercise_2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s1;
		   String s2;
		   Scanner s=new Scanner(System.in);
		   
		   System.out.println("請輸入第一個字串:");
		   s1 = s.next();
		   
		   System.out.println("請輸入第二個字串:");
		   s2 = s.next();
		   
		   
		   if(s1 == s2) {
			   System.out.println("s1==s2 : true; s1 equals s2 : true");
		   }
		   else{
			   if(s1.equals(s2)) {
				   System.out.println("s1==s2 : false; s1 equals s2 : true");
			   }
			   else {
				   System.out.println("s1==s2 : false; s1 equals s2 : false");
			   }
		   }
		   
		   s.close();
	}

}
