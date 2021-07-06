//https://leetcode.com/problems/set-matrix-zeroes/

import java.util.Arrays;
public class set_matrix_zeroes_73 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
		printMatrix(matrix);
		
		setZeroes2(matrix);
		
		printMatrix(matrix);
	}
	
	//First attempt. Uses O(m*n) space
	//Runtime: 8 ms, faster than 5.43% of Java online submissions for Set Matrix Zeroes.
	//Memory Usage: 40.2 MB, less than 95.46% of Java online submissions for Set Matrix Zeroes.
	public static void setZeroes(int[][] matrix) {

		int[][] copy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
		
			for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if(copy[row][col] == 0) {
					zeroRow(matrix, row);
					zeroCol(matrix, col);
				}
			}
		}
	}

	//Second attempt. Uses O(m + n) space
	//Runtime: 5 ms, faster than 7.58% of Java online submissions for Set Matrix Zeroes.
	//Memory Usage: 40.7 MB, less than 46.08% of Java online submissions for Set Matrix Zeroes.
	public static void setZeroes1(int[][] matrix) {

		int[] zeroRows = new int[matrix.length];
		int[] zeroCols = new int[matrix[0].length];
		
			for(int row = 0; row < matrix.length; row++) {
				for(int col = 0; col < matrix[0].length; col++) {
					if(matrix[row][col] == 0) {
						zeroRows[row] = 1;
						zeroCols[col] = 1;
					}
				}
			}
			
			int count = 0;
			for(int i : zeroRows) {
				if(i == 1)
					zeroRow(matrix, count);
				++count;
			}
			
			count = 0;
			for(int i : zeroCols) {
				if(i == 1)
					zeroCol(matrix, count);
				++count;
			}

	}


	//Third attempt. Uses O(1) space
	//Runtime: 1 ms, faster than 93.54% of Java online submissions for Set Matrix Zeroes.
	//Memory Usage: 40.8 MB, less than 34.71% of Java online submissions for Set Matrix Zeroes.
	public static void setZeroes2(int[][] matrix) {
		int extra = 1;

		//Iterate over the first row and save zero condition status in a variable
		for(int col = 0; col < matrix[0].length; col++) {
			if(matrix[0][col] == 0) {
				extra = 0;
			}
		}
		
		//Iterate over remaining rows. If row contains a zero, set leftmost element of row to zero and topmost element of column to zero.
			for(int row = 1; row < matrix.length; row++) {
				for(int col = 0; col < matrix[0].length; col++) {
					if(matrix[row][col] == 0) {
						matrix[0][col] = 0;
						matrix[row][0] = 0;
					}
				}
			}

		//Starting at the 2nd column, from left to right zero out any columns that have a topmost element value of 0
		for(int col = 1; col < matrix[0].length; col++) {
			if(matrix[0][col] == 0) {
				zeroCol(matrix, col);
			}
		}	
		
		//Starting at the 2nd row, from top to bottom zero out any rows that have a leftmost element value of 0
		for(int row = 1; row < matrix.length; row++) {
			if(matrix[row][0] == 0) {
				zeroRow(matrix, row);
			}
		}
		
		//Zero out the leftmost column if the left top element is zero
		if(matrix[0][0] == 0)
			zeroCol(matrix, 0);
		
		//Zero out the top row if the status variable has been set to zero
		if(extra == 0) {
			zeroRow(matrix, 0);
		}
	}
    
	public static void zeroRow(int[][] matrix, int curr_row) {
		for(int col = 0; col < matrix[0].length; col++) {
			matrix[curr_row][col] = 0;
		}
	}
	
	public static void zeroCol(int[][] matrix, int curr_col) {
		for(int row = 0; row < matrix.length; row++) {
			matrix[row][curr_col] = 0;
		}
	}
	
	
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + ", ");
			System.out.println("\n");
		}
		System.out.println("\n");
	}
}
