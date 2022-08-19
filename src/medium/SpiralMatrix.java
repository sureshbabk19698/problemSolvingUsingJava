package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	private static void printSpiral(int[][] matrix) {
		int tempColumn = matrix[0].length - 1;
		int tempRow = matrix.length - 1;

		int totalValues = matrix.length * matrix[0].length;
		int visitedIndex = 0;
		
		List<Integer> result = new ArrayList<>();
		for (int row = 0; row <= tempRow; row++) {
			// Horizontal Right
			for (int col = row; col <= tempColumn; col++) {
				visitedIndex++;
				result.add(matrix[row][col]);
			}

			// Vertical Down
			for (int j = row + 1; j <= tempRow; j++) {
				visitedIndex++;
				result.add(matrix[j][tempColumn]);
			}

			// Horizontal Left
			for (int col = tempColumn - 1; col >= row; col--) {
				visitedIndex++;
				result.add(matrix[tempRow][col]);
			}

			// Vertical Up
			for (int j = tempRow - 1; j > row; j--) {
				visitedIndex++;
				result.add(matrix[j][row]);
			}

			if (visitedIndex == totalValues) {
				break;
			}
			
			tempColumn--;
			tempRow--;
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
	}
}
