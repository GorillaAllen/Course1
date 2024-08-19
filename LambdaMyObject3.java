package InnerClassLambda;
import java.util.Arrays;

//Product_data
class Product_data3 {
	private String name;
	private int price;
	private int qty;

	public Product_data3(String name, int price, int qty) {
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

//class ProductComparator2 implements Comparator<Product_data2> {
//	public int compare(Product_data2 product1, Product_data2 product2) {
//		int p1_sum_value, p2_sum_value, temp = 1;
//		p1_sum_value = product1.get_sum_value();
//		p2_sum_value = product2.get_sum_value();
//		if (p1_sum_value > p2_sum_value) {
//			temp = 1;
//		} else if (p1_sum_value == p2_sum_value) {
//			temp = 0;
//		} else if (p1_sum_value < p2_sum_value) {
//			temp = -1;
//		}
//		return temp;
//	}
//}

public class LambdaMyObject3 {
	public static void main(String[] args) {
		// 建立p[0]~p[3]的Product物件陣列
		Product_data3[] p_data_array = new Product_data3[] { new Product_data3("烈空座", 380, 23),
				new Product_data3("甲賀忍蛙", 250, 23), new Product_data3("皮卡丘", 300, 47),
				new Product_data3("雷電雲", 240, 57) };

		Arrays.sort(p_data_array, (product1, product2) -> {
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
		});

		System.out.println("  品名  單價  數量  金額  名次");
		System.out.println("===================================");
		// 以倒印方式印出p產品物件陣列資訊，以及產品銷售金額名次
		for (int i = p_data_array.length - 1, k = 1; i >= 0; i--, k++) {
			p_data_array[i].show();
			System.out.println(k);
		}
	}
}
