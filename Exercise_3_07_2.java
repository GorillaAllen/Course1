import java.util.Scanner;

public class Exercise_3_07_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("輸入列數");
		int rows = s.nextInt();
		System.out.print("輸入欄數");
		int cols = s.nextInt();
		
		for(int i = 1; i <= rows*cols*2; i++) {
			System.out.printf("%2d|", i );
			if( i == rows*cols) {
				System.out.println();
			}
			if( i % cols == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		for(int i=(rows*cols)+2 ; i <=(rows*cols*3) ; i=i+2) {
			System.out.printf("%2d|", i );
			if( i % (cols*2) == 0) {
				System.out.println();
			}
		}
	}

}
