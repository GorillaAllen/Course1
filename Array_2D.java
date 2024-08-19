public class Array_2D {
	public static void main(String[] args) {
		String[] title = { "編號", "價格", "庫存量", "頁數", "備註" };
		int[][] bookShop = { { 1, 2, 3 ,4 }, 
							 { 200, 350, 250 ,200 }, 
							 { 5, 3, 10, 12 }, 
							 {90, 84, 95 ,102},
							 {0}
						   };

//		for (int i = 0; i < title.length; i++) {
//			System.out.print(title[i] + "\t");
//
//			for (int j = 0; j < bookShop[i].length; j++)
//				System.out.print(bookShop[i][j] + "\t");
//			System.out.println();
//		}
		
		for(int i = 0 ; i < title.length ; i++ ) {
			System.out.print( title[i] + "\t");
			
			for(int j = 0 ; j < bookShop[i].length ; j++ ) {
			System.out.print( bookShop[i][j] + "\t" );
			}
		System.out.print( "\n" );
		}
	}
}