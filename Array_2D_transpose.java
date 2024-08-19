public class Array_2D_transpose {
	public static void main(String[] args) {
		String[] title = { "編號", "價格", "庫存量" , "page"};
		
		int[][] bookShop = { 	
				{ 1, 2, 3 }, 
				{ 200, 350, 250 },
				{ 5, 3, 10 }, 
				{ 254, 325, 1025 } 	
				};
//		for (int i = 0; i < bookShop.length; i++) {
//			
//			System.out.print(title[i] + "\t");
//
//			for (int j = 0; j < bookShop[i].length; j++)
//				
//				System.out.print(bookShop[i][j] + "\t");
//			
//			System.out.println();
//			
//		}
			
		
		for (int i = 0; i < bookShop.length; i++) 
			System.out.print(title[i] + "\t");
		System.out.println();
		
		for (int i = 0; i < bookShop[i].length; i++) 
		{	
			for (int j = 0; j < bookShop[i].length+1; j++)
			{
				
				System.out.print(bookShop[j][i] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}