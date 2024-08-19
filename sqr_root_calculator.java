import java.util.Scanner;

public class sqr_root_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; // the number to find square root
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the interger and find its square root: ");
		x = s.nextInt();
		System.out.printf("square root of " + x + " is roughly: " + getSqrRoot(x));
		s.close();
	}

	static double getSqrRoot(int d) {
		double sqr_root = 0;
		for (int i = 0; i * i < d; i += 1) {
			sqr_root = i;
		}
		sqr_root -= 1;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.1) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.1;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.01) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.01;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.0001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.0001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.00001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.00001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.0000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.0000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.00000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.00000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.000000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.000000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.0000000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.0000000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.00000000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.00000000001;
		
		for (double i = 0; (sqr_root + i)*(sqr_root + i) < d; i += 0.000000000001) {
			sqr_root = sqr_root + i;
		}
		sqr_root -= 0.000000000001;
		
		return sqr_root -0.000000000001;
	}
}
