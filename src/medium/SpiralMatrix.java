package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	private static void printSpiral(int[][] matrix) {
		int rowBegin = 0;
		int rowEnd = matrix.length - 1;

		int columnBegin = 0;
		int columnEnd = matrix[0].length - 1;

		List<Integer> result = new ArrayList<>();
		while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
			// Horizontal Right
			for (int col = columnBegin; col <= columnEnd; col++) {
				result.add(matrix[rowBegin][col]);
			}
			rowBegin++;

			// Vertical Down
			for (int j = rowBegin; j <= rowEnd; j++) {
				result.add(matrix[j][columnEnd]);
			}
			columnEnd--;

			// Horizontal Left
			if (rowBegin <= rowEnd) {
				for (int col = columnEnd; col >= columnBegin; col--) {
					result.add(matrix[rowEnd][col]);
				}
			}
			rowEnd--;

			// Vertical Up
			if (columnBegin <= columnEnd) {
				for (int j = rowEnd; j >= rowBegin; j--) {
					result.add(matrix[j][columnBegin]);
				}
			}
			columnBegin++;

		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		int[][] fiveXfive = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		printSpiral(fiveXfive);
		
		int fiveXfour[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 6, 7, 8, 9 }, 
				{ 11, 12, 13, 14 }, 
				{ 16, 17, 18, 19 },
				{ 21, 22, 23, 24 } };
		printSpiral(fiveXfour);
		
		int threeXfour[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }};
		printSpiral(threeXfour);

		int oneXone[][] = { { 7 }, { 9 }, { 6 } };
		printSpiral(oneXone);
	}
}
