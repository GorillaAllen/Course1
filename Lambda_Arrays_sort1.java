package InnerClassLambda;
import java.util.Arrays;

public class Lambda_Arrays_sort1 {
	public static void main(String[] args) {
		// 建立name[0]~name[3]字串陣列元素
		String[] name = new String[] { "Apple", "Kiwi", "Banana", "Watermelon" };
		// 實作字串比較的規則
		Arrays.sort(name, (str1, str2) -> str1.compareToIgnoreCase(str2));
		// 印出排序後的結果
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}