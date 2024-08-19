package InnerClassLambda;
import java.util.Arrays;
import java.util.Comparator;

//Product_data
class Product_data {
	private String name;
	private int price;
	private int qty;

	public Product_data(String name, int price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	// getTotal()方法可取得單價*數量小計
	public int get_sum_value() {
		return (price * qty);
	}

	// 顯示產品銷售資訊
	public void show() {
		System.out.print(name + "\t" + price + "\t" + qty + "\t" + get_sum_value() + "\t");
	}
}

// ProductComparator類別實作Comparator介面的compare方法
// 用來比較Product產品銷售金額(單價*數量)

class ProductComparator implements Comparator<Product_data> {
	public int compare(Product_data product1, Product_data product2) {
		int p1_sum_value, p2_sum_value, temp = 1;
		p1_sum_value = product1.get_sum_value();
		p2_sum_value = product2.get_sum_value();
		if (p1_sum_value > p2_sum_value) {
			temp = 1;
		} else if (p1_sum_value == p2_sum_value) {
			temp = 0;
		} else if (p1_sum_value < p2_sum_value) {
			temp = -1;
		}
		return temp;
	}
}

public class LambdaMyObject1 {
	public static void main(String[] args) {
		// 建立p[0]~p[3]的Product物件陣列
		Product_data[] p_data_array = new Product_data[] { new Product_data("烈空座", 380, 23),
				new Product_data("甲賀忍蛙", 250, 23), new Product_data("皮卡丘", 300, 47), new Product_data("雷電雲", 240, 57) };

		// 使用Arrays的sort()方法進行由小到大排序p物件陣列

		// 排序規則為ProductComparator介面物件
		Arrays.sort(p_data_array, new ProductComparator());

		System.out.println("  品名  單價  數量  金額  名次");
		System.out.println("===================================");
		// 以倒印方式印出p產品物件陣列資訊，以及產品銷售金額名次
		for (int i = p_data_array.length - 1, k = 1; i >= 0; i--, k++) {
			p_data_array[i].show();
			System.out.println(k);
		}
	}
}
