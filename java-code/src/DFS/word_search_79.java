package DFS;

public class word_search_79 {
	static boolean[][] visited;
	public static boolean dfs(String[][] str, int x, int y, int index, String find) {
//		System.out.println(find.charAt(index));
//		System.out.println(str[x][y].charAt(0));
//		System.out.println(find.charAt(index) != str[x][y].charAt(0));
//		System.out.println(visited[x][y]);

		if(index == find.length())
			return true;
		System.out.println(x < 0 || x >= str.length|| y < 0 || y >= str[0].length || find.charAt(index) != str[x][y].charAt(0) || visited[x][y]);
		if(x < 0 || x >= str.length|| y < 0 || y >= str[0].length || find.charAt(index) != str[x][y].charAt(0) || visited[x][y]) {
			return false;
		}
		System.out.println("index= " + index + "      str[x][y]= " + str[x][y] + "      find.charAt(index)" + String.valueOf(find.charAt(index)));


		visited[x][y] = true;
		
		if(dfs(str, x - 1, y, index++, find) || dfs(str, x + 1, y, index++,find) || dfs(str, x, y - 1, index++, find) || dfs(str, x, y + 1, index++, find)) {
			return true;
		}
		visited[x][y] = false;
		return false;
	
	}
	
	
	public static void main(String[] args) {
		String[][] str = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
		String find = "ABCCED";
				
		for(int x = 0; x < str.length; x++) {
			for(int y = 0; y < str[x].length; y++) {
				System.out.print(str[x][y]);
			}
			System.out.println();
		}
		
		visited = new boolean[str.length][str[0].length];
		
		boolean found = false;
		
		for(int x = 0; x < str.length; x++) {
			for(int y = 0; y < str[x].length; y++) {
				if(str[x][y].charAt(0) == find.charAt(0))
					found = dfs(str, x, y, 0, find);
				System.out.println(found);
			}
		}
		
		System.out.println(found);
	}
}
