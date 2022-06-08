package Solns;

import java.util.LinkedList;
import java.util.Queue;

public class num_of_islands_200 {
	
	public static int bfs(int row, int col, char[][] grid) {
		Queue<Character> q = new LinkedList<Character>();
		q.add(grid[row][col]);
		
		
		
		
		
		
		return 0;
	}

	
    public static int numIslands(char[][] grid, int[][] visited) {
		int totalIslands = 0;
		
        for(int row = 0; row < grid.length; row++) {
        	for(int col = 0; col < grid[0].length; col++) {
        		if(grid[row][col] == '1' && visited[row][col] == 0) {
            		visited[row][col] = 1;
            		totalIslands += bfs(row, col, grid);
        		}


        	}
        	System.out.println();
        }
        return -1;
    }
    
    
    
    public static void main(String[] args) {
    	int numIslands = 0;
    	int[][] visited = new int[4][5];

    	char[][] grid = {
    	        {'1','1','0','0','0'},
    	        {'1','1','0','0','0'},
    	        {'0','0','1','0','0'},
    	        {'0','0','0','1','1'}
    	};
    	
    	numIslands(grid, visited);
    	
    }
}
