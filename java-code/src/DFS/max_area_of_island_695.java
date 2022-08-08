package DFS;

import java.util.Arrays;

public class max_area_of_island_695 {

	public static void printMatrix(int[][] matrix) {
		for (int[] a : matrix)
			System.out.println(Arrays.toString(a));
	}

	public static int countIslands(int[][] matrix) {
		int numIslands = 0;

		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				if (matrix[rows][cols] == 1) {
					System.out.println("1 found!");
					numIslands++;
					visitIslandDFS(matrix, rows, cols, 0);
				}
			}
		}
//		printMatrix(matrix);
//		tester(matrix);
//		printMatrix(matrix);
		return numIslands;

	}

	private static void visitIslandDFS(int[][] matrix, int x, int y) {
		if(x < 0 || y < 0 || x > matrix.length - 1 || y > matrix[0].length - 1 || matrix[x][y] == 0) {
			return;
		}
		
		matrix[x][y] = 0;
		
		visitIslandDFS(matrix, x + 1, y);
		visitIslandDFS(matrix, x - 1, y);
		visitIslandDFS(matrix, x, y + 1);
		visitIslandDFS(matrix, x, y - 1);
	}


	public static void main(String[] args) {
		System.out.println(countIslands(new int[][] { { 0, 1, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 0, 1, 1, 1, 0 },
				{ 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 } }));

		System.out.println("take 2");
		System.out.println(countIslands(new int[][] { { 1, 1, 1, 0, 0 }, { 0, 1, 0, 0, 1 }, { 0, 0, 1, 1, 0 },
				{ 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 } }));
	}

}
