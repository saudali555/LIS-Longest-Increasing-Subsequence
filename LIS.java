package com.longestincreasing.sequence;

public class LIS {
	public static int Lis(int[] arr, int i, int n, int prev)
	{
		if (i == n) {                         // Base case zero Elements
			return 0;
		}
            
		int excl = Lis(arr, i + 1, n, prev);  // Exclude the current element and process the remaining Elements

			
		int incl = 0;                         //  Include current if current>previous  
		if (arr[i] > prev) {
		incl = 1 + Lis(arr, i + 1, n, arr[i]);
		}

		return Integer.max(incl, excl);       // return the maximum of two 
		}

		public static void main(String[] args)
		{
			int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
			System.out.print("The length of the LIS is "+ Lis(arr, 0, arr.length, Integer.MIN_VALUE));
	}
}