import java.util.Scanner;

public class Grade_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum[]= new double[5]; 
		int grade[][] = new int[5][5], num[] = new int[5]; //宣告陣列跟學號num		
		Scanner s = new Scanner(System.in);
		
		for( byte i=0 ; i<=4 ; i++) {
			System.out.println("請輸入學生座號");//輸入學生座號
			num[i] = s.nextInt();
		
			System.out.println("請輸入國文成績");//輸入個別成績到陣列		
			grade[i][0] = s.nextInt();
			sum[i] += grade[i][0];
			
			System.out.println("請輸入英文成績");//輸入個別成績到陣列	
			grade[i][1] = s.nextInt();
			sum[i] += grade[i][1];
			
			System.out.println("請輸入數學成績");//輸入個別成績到陣列		
			grade[i][2] = s.nextInt();
			sum[i] += grade[i][2];
			
			System.out.println("請輸入社會成績");//輸入個別成績到陣列	
			grade[i][3] = s.nextInt();
			sum[i] += grade[i][3];
			
			System.out.println("請輸入自然成績");//輸入個別成績到陣列	
			grade[i][4] = s.nextInt();
			sum[i] += grade[i][4];
		}
		
		for(int i=0; i<=4 ; i++) {
		System.out.print(" 學生座號 " + num[i]);
		System.out.print(" 國文成績:" + grade[i][0]);
		System.out.print(" 英文成績:" + grade[i][1]);
		System.out.print(" 數學成績:" + grade[i][2]);
		System.out.print(" 社會成績:" + grade[i][3]);
		System.out.print(" 自然成績:" + grade[i][4]);
		System.out.print(" 加總:" + sum[i] );
		System.out.print(" 平均:" + sum[i] / 5 );
		System.out.println("");
		System.out.println("");	
		}
		
	s.close();
	}

}
