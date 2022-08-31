package Amazon;

public class unique_paths_62 {
	public static int totalPaths = 0;
	
	public static void dfs(int[][] grid, int x, int y){
		if(x == grid.length - 1 && y == grid[0].length - 1)
			totalPaths++;
			
		else if(x < grid.length - 1 && y < grid[0].length - 1) {
			totalPaths++;
			dfs(grid, x + 1, y);
			dfs(grid, x, y + 1);
		}
}

		
		
		
	
	
	
    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        
        dfs(grid, 0, 0);
        return totalPaths;
    }
	
	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		System.out.println(uniquePaths(m, n));
	}
}
