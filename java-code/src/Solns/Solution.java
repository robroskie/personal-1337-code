package Solns;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static int[][] rotatedImage(int[][] matrix) {

//		int rows = matrix[0][0];
//		int cols = matrix[1][0];
//		
//
//		
//		System.out.println("rows" + rows);
//		System.out.println("cols" + cols);
		System.out.println(matrix[0].length + ", " + matrix.length);
		int[][] answer = new int[matrix[0].length][matrix.length];

//			int[][] copy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				// System.out.print(matrix[row][col] + ", ");
				System.out.println("Row" + row + "col" + col);
				answer[col][row] = matrix[matrix.length - row - 1][col];

			}
			// System.out.println("\n");
		}

//		for (int row = 0; row < answer.length; row++) {
//			for (int col = 0; col < answer[row].length; col++) {
//				System.out.print(answer[row][col] + " ");
//			}
//			System.out.println();
//		}

		// Write your code here

		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// input for matrix
		int matrix_row = in.nextInt();
		int matrix_col = in.nextInt();
		int matrix[][] = new int[matrix_row][matrix_col];
		for(int idx = 0; idx < matrix_row; idx++)
		{
			for(int jdx = 0; jdx < matrix_col; jdx++)
			{
				matrix[idx][jdx] = in.nextInt();
			}
		}

		
//		for (int row = 0; row < matrix.length; row++) {
//			for (int col = 0; col < matrix[row].length; col++) {
//				System.out.print(matrix[row][col] + " ");
//			}
//			System.out.println();
//		}
		
		
		int[][] result = rotatedImage(matrix);
		for(int idx = 0; idx < result.length; idx++)
		{
			for(int jdx = 0; jdx < result[0].length - 1; jdx++)
			{
				System.out.print(result[idx][jdx] + " ");
			}
			System.out.print(result[idx][result[0].length - 1]);
			System.out.println();
		}
	}
}
