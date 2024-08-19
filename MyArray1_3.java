package ex05;

public class MyArray1_3 {

	public static void main(String[] args) {
		// (1)
//		int[] n = new int[4] ;
//			n[0]=42;
//			n[1]=67;
//			n[2]=90;
//			n[3]=32;
		
		
		// (2)			
		int[] n = new int[]	{42, 67, 90, 32};
		
		
		// (3)	
	//	int[] n = {42, 67, 90, 32};
		
		
		int sum = 0;
		
		for (int i = 0; i < 4; i ++) //4 times
			{
				
				System.out.println(" n[" + i + "] = " + n[i]);
				sum += n[i];
			}
		System.out.println(" n 陣列元素總和為 " + sum);
	}

}
