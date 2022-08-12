package medium;

public class RotateImage {

	public static void rotate(int[][] matrix) {

		int len = matrix.length;

		for (int row = 0; row < len; row++) {
			for (int col = row; col < len; col++) {
				int temp = matrix[row][col]; // 0 , 1
				matrix[row][col] = matrix[col][row]; 
				matrix[col][row] = temp;
			}
		}
		
		for (int row = 0; row < len; row++) {
			for (int col = 0; col < len/2; col++) {
				int temp = matrix[row][col]; // 0 , 1
				matrix[row][col] = matrix[row][len - 1 - col]; 
				matrix[row][len - 1 - col] = temp;
			}
		}
		print(matrix);
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, 9, 13 }, 
				    	   { 2, 6, 10, 14 }, 
				    	   { 3, 7, 11, 15 }, 
				    	   { 4, 8, 12, 16 } };
		rotate(matrix);
	}

	private static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
