﻿package ex05;

public class TwoDimArray2_1{

	public static void main(String[] args)
	{
		
		int x=5;
		int[] n1 = {1,2,3,4,5};
		
		int[][] n = 
			{ 
				{ 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } 
			};
		
		int sum = 0;
		
			for (int[] r : n) 
				{
					for (int i :r) 
						{
							sum += i;
						}
				}
			
		System.out.println(" n 陣列元素總和為 " + sum);
	}

}
