package medium;

public class WordSearch {

	boolean visitedIndex[][];

	public boolean exist(char[][] board, String word) {

		int rowLen = board.length;
		int colLen = board[0].length;

		visitedIndex = new boolean[rowLen][colLen];

		for (int row = 0; row < rowLen; row++) {
			for (int col = 0; col < colLen; col++) {
				if (word.charAt(0) == board[row][col] && search(row, col, board, 0, word, rowLen, colLen)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean search(int row, int col, char board[][], int index, String word, int rowLen, int colLen) {

		if (index == word.length()) {
			return true;
		}

		if (row < 0 || row >= rowLen || col < 0 || col >= colLen || word.charAt(index) != board[row][col]
				|| visitedIndex[row][col]) {
			return false;
		}
		visitedIndex[row][col] = true;

		if (search(row + 1, col, board, index + 1, word, rowLen, colLen)
				|| search(row - 1, col, board, index + 1, word, rowLen, colLen)
				|| search(row, col + 1, board, index + 1, word, rowLen, colLen)
				|| search(row, col - 1, board, index + 1, word, rowLen, colLen)) {
			return true;
		}

		visitedIndex[row][col] = false;
		return false;
	}

	public static void main(String[] args) {
		WordSearch ws = new WordSearch();
		char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		System.out.println(ws.exist(board, "ABCCED"));
	}

}