public class Array_Access_ForEach {
	public static void main(String[] args) {
		int prc[] = { 200, 350, 200 };
		
		System.out.print("書的價格為：");

		for (int price : prc)
			System.out.print(price + " ");
	}
}