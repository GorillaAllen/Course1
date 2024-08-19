import java.util.Scanner;

public class pi_cal_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d; //運算次數
		double term = 0;//項
		double sum = 0; //總和
		System.out.println("請輸入運算次數:");
		Scanner s = new Scanner(System.in);
		d = s.nextInt();
		for(int i = 0; i < d ; i++) {
			
			if(i%2 == 0) {
				term = (double)  1 / (1 + (2*i))  ;
			}
			else {
				term = -(double)  1 / (1 + (2*i))  ;
			}
			sum += term;
			System.out.printf("term值大約為:%.6f\n", term );
			System.out.printf("Pi值大約為:%.6f\n", sum*4 );
		}
		
		s.close();
	}

}
