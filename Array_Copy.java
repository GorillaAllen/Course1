public class Array_Copy {
	public static void main(String[] args) {
		double[] prcVan = { 200, 0, 350.0, 250.0 };
		double[] prcLisa = new double[prcVan.length];

		//System.arraycopy(prcVan, 0, prcLisa, 0, prcVan.length);
		
		 for( int i = 0 ; i < prcVan.length ; i++ ) {
			prcLisa[i] = prcVan[i];
		} 
			
			
		System.out.print("麗沙小姐將書籍八折出售: ");
		for (int i = 0; i < prcLisa.length; i++)
			prcLisa[i] *= 0.8;

		for (double price : prcLisa)
			System.out.print(price + " ");
		System.out.println();
		System.out.print("梵谷先生書店的書籍售價: ");
		for (double price : prcVan)
			System.out.print(price + " ");
	}
}