﻿package ex05;

public class Non_R_Array1 {

	public static void main(String[] args) {
		int[][] n = new int[3][];
		
		/*
		 * {
		 * 
		 * {},{},{}
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		n[0] = new int[] {1};
		/*
		 * {
		 *    {1},{},{}
		 * }
		 */
		
		
		n[1] = new int[] {2, 3,11,12,46};
		/*
		 * {
		 *   {1},{2,3},{}
		 * }
		 */
		
		n[2] = new int[] {4, 5, 6,88,79,415,245};
		/*
		 * {
		 *   {1},{2,3},{4,5,6}
		 * }
		 */
		
		
		for (int i = 0; i < n.length ; i++) //3
		{
			for (int j = 0 ; j<n[i].length ; j++)
				System.out.print(" " + n[i][j]);
			
			System.out.println();
		}
	}

}
