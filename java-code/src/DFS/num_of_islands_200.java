package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class num_of_islands_200 {

	public static void bfs(int[][] grid, int[] curCoordinates) {

	}

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		char[][] grid1 = { { '1', '2', '3', '4', '5' }, { '6', '7', '8', '9', 'a' }, { 'b', 'c', 'd', 'e', 'f' },
				{ 'g', 'h', 'i', 'j', 'k' } };

		int[][] grid2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < grid2.length; i++) {
			for(int z = 0; z < grid2[i].length; z++) {
				System.out.print(grid2[i][z] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	

		bfs(grid2, new int[] {0,0});
	}

}
