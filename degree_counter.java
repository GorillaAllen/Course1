import java.util.Scanner;

public class degree_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x; // for option
		double degree; // 
		
		Scanner s=new Scanner(System.in);
		System.out.println("想要華氏轉攝氏溫度,請輸入A. 想要攝氏轉華氏溫度,請輸入B.");
        x = s.next();
        
        switch(x)
	      {
	         case "A" :
	            System.out.println("請輸入華氏溫度:");
	            degree = s.nextDouble();
	            degree = ( degree - 32 ) / 9 * 5;
	            System.out.println("攝氏溫度為:" +degree);
	            break;
	            
	         case "B" :
	        	System.out.println("請輸入攝氏溫度:");
		        degree = s.nextDouble();
		        degree = degree * 9 / 5 + 32;
		        System.out.println("華氏溫度為:" +degree);
	        	break;
	         
	         default :
	            System.out.println("你很頑皮");
	      }
        s.close(); 
	}

}
