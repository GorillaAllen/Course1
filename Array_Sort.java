import java.util.Arrays;

public class Array_Sort {
	public static void main(String[] args) {
		int[] cntLisa = { 5, 3, 10 };

		System.out.print("書籍依存量排序: ");
		Arrays.sort(cntLisa);
		for (int count : cntLisa)
			System.out.print(count + " ");
	}
}