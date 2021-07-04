public class set_matrix_zeroes_73 {
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		printMatrix(matrix);
		
		setZeroes(matrix);
		
		printMatrix(matrix);
	}
	
	public static void setZeroes(int[][] matrix) {
	
		//This does not work since the updated reference will can change in the main method
		//int[] row_zeroes = new int[matrix[0].length];
		
		here: for(int row = 0; row < matrix[0].length; row++) {
			for(int col = 0; col < matrix.length; col++) {
//				System.out.println("loop");
				if(matrix[row][col] == 0) {
//					System.out.println("zero entry");
					zeroRow(matrix, row);
					zeroCol(matrix, col);
					continue here;
				}
			}
		}
		
//		printMatrix(matrix);
		
		

	}

	public static void zeroRow(int[][] matrix, int curr_row) {
		System.out.println("loop row zeroing");
		for(int col = 0; col < matrix.length; col++) {
			matrix[curr_row][col] = 0;
		}

	}
	
	public static void zeroCol(int[][] matrix, int curr_col) {
		System.out.println("loop col zeroing");
		for(int row = 0; row < matrix[0].length; row++) {
			matrix[row][curr_col] = 0;
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix[0].length; i++) {
			for(int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + ", ");
			System.out.println("\n");
		}
		System.out.println("\n");
	}
}
