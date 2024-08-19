import java.util.Arrays;

public class Array_Sort1 {
	public static void main(String[] args) {
		int[] cntLisa = { 5, 3, 10 };
		int[] prcLisa = new int[cntLisa.length];
		
		System.arraycopy(cntLisa,0, prcLisa, 0, cntLisa.length);
		System.out.println("書籍依存量排序: ");
		
		
		Arrays.sort(prcLisa );
		for (int count : prcLisa )
			System.out.println("prcLisa : "+count + " ");
		
		for (int count1 : cntLisa )
			System.out.println("cntLisa : "+count1 + " ");
		
	}
}