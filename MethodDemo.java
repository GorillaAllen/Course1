public class MethodDemo {
	static void printTriangle(int level) {
		int i, j, k, l;

		for (i = 1; i <= level; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for ( k = i-2 /*i此時為6, 但下一行只印4個***/ ; k >= 0 ; k--) {
			for (l = 1; l <= k ; l++)
				System.out.print("*");
		System.out.println();
			
		}
	}

	public static void main(String[] args) {
		printTriangle(5);
	}
}
