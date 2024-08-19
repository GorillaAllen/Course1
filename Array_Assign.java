public class Array_Assign {
	public static void main(String[] args) {
		int[] cntVan = { 5, 3, 10 };
		int[] cntLisa = cntVan;

		cntLisa[0] = 0;
		System.out.print("麗沙小姐將第一本書賣完後的存量: ");
		for (int count : cntLisa)
			System.out.print(count + " ");
		System.out.println();
		System.out.print("梵谷先生接手時書的存量: ");
		for (int count : cntVan)
			System.out.print(count + " ");
	}
}