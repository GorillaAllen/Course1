public class Array_Access {
	public static void main(String[] args) {
		int prc[] = new int[3];
		int prcLength = prc.length;

		prc[0] = 200;
		prc[1] = 350;
		prc[2] = 250;
		// prc[3] = 150;
		System.out.println("共有幾本書？" + prcLength);
		System.out.print("書的價格為：");

		for (int i = 0; i < prcLength; i++)
			System.out.print(prc[i] + " ");
	}
}