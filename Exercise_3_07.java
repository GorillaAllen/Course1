import java.util.Scanner;

public class Exercise_3_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("輸入列數");
		int x = s.nextInt();
		System.out.print("輸入欄數");
		int y = s.nextInt();
		
		
		int[][] a = new int[x][y];
		int[][] b = new int[x][y];
		int[][] c = new int[x][y];
		
		for(int i = 0; i < x ; i++) {
			for( int j = 0; j < y; j++) {
				a[i][j] = (y*i) + (j+1) ;
			}
		}
		
		for(int i = 0; i < x ; i++) {
			for( int j = x*y; j < (x+1)*y ; j++) {
				b[i][j-x*y] = (y*i) + (j+1) ;
			}
		}
		
		for(int i = 0; i < x ; i++) {
			for( int j = 0; j < y; j++) {
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		
		for(int i = 0; i < x ; i++) {
			for( int j = 0; j < y; j++) {
				System.out.printf("%2d|",a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < x ; i++) {
			for( int j = 0; j < y; j++) {
				System.out.printf("%2d|",b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < x ; i++) {
			for( int j = 0; j < y; j++) {
				System.out.printf("%2d|",c[i][j]);
			}
			System.out.println();
		}
		
		s.close();
	}

}
