package Arrays_Hashing;

import java.util.HashSet;

public class valid_sudoku_36 {

	public static boolean isValidSudoku(char[][] board) {
		// Check if each row is ok

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < board.length; i++) {
			int left = 0;

			set = new HashSet<Character>();
			while (left < board[i].length) {
				System.out.println(set);
				if (set.contains(board[i][left]))
					return false;
				else if (board[i][left] != '.') {
					set.add(board[i][left]);

				}
				System.out.println(board[i][left]);
				left++;

			}
			System.out.println();
		}

		// Check if each column is ok
		for (int i = 0; i < board.length; i++) {
			int left = 0;

			set = new HashSet<Character>();
			while (left < board[i].length) {
				System.out.println(set);
				if (set.contains(board[left][i]))
					return false;
				else if (board[left][i] != '.') {
					set.add(board[left][i]);

				}
				System.out.println(board[left][i]);
				left++;

			}
			System.out.println();
		}

		// Check each of the 9 boxes
		int left = 0;
		int mid = 1;
		int right = 2;

		for (int z = 0; z < 3; z++) {
			set = new HashSet<Character>();
			for (int i = 0; i < 9; i++) {
				System.out.printf("checking %c   %c   %c \n", board[i][left], board[i][mid], board[i][right]);
			
				if (set.contains(board[i][left]) || set.contains(board[i][mid]) || set.contains(board[i][right])) {
					return false;
				} else {
					if(board[i][left] != '.')
						set.add(board[i][left]);
					if(board[i][mid] != '.')
						set.add(board[i][mid]);
					if(board[i][right] != '.')
						set.add(board[i][right]);
				}

				if (i == 2 || i==5) {
					set = new HashSet<Character>();
				}

			}
			System.out.println();

			left += 3;
			mid += 3;
			right += 3;
		}

		return true;
	}

	public static void main(String[] args) {

		char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		boolean result = isValidSudoku(board);
		System.out.println(result);
	}
}

/*
 * 
 * 
 * [[".",".",".",".","5",".",".","1","."]
 * [".","4",".","3",".",".",".",".","."]
 * [".",".",".",".",".","3",".",".","1"]
 * ["8",".",".",".",".",".",".","2","."]
 * [".",".","2",".","7",".",".",".","."]
 * [".","1","5",".",".",".",".",".","."]
 * [".",".",".",".",".","2",".",".","."]
 * [".","2",".","9",".",".",".",".","."]
 * [".",".","4",".",".",".",".",".","."]]
 * 
 * 
 */