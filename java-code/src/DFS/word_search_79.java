package DFS;

public class word_search_79 {
	static boolean[][] visited;
	public static boolean dfs(char[][] board, int x, int y, int index, String find) {

		if(index == find.length())
			return true;

		if(x < 0 || x >= board.length|| y < 0 || y >= board[0].length || find.charAt(index) != board[x][y] || visited[x][y]) {
			return false;
		}



		visited[x][y] = true;
		
		if(dfs(board, x - 1, y, index++, find) || dfs(board, x + 1, y, index++,find) || dfs(board, x, y - 1, index++, find) || dfs(board, x, y + 1, index++, find)) {
			return true;
		}
		visited[x][y] = false;
		
		System.out.println("end");
		return false;
	
	}
	
	
	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String find = "ABCCED";
				
//		for(int x = 0; x < board.length; x++) {
//			for(int y = 0; y < board[x].length; y++) {
//				System.out.print(board[x][y]);
//			}
//			System.out.println();
//		}
//		
		visited = new boolean[board.length][board[0].length];
		
		boolean found = false;
		
		for(int x = 0; x < board.length; x++) {
			for(int y = 0; y < board[x].length; y++) {
				if(board[x][y] == find.charAt(0)) {
					found = dfs(board, x, y, 0, find);
					System.out.println(x + ", " + y + "   **** " + found + " *******");
				}

			}
		}
		
		System.out.println(found);
	}
}
