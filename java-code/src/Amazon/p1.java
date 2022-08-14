package Amazon;

import java.util.HashMap;
import java.util.Map;

public class p1 {
	public static void main(String[] args) {
		int[][] a = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};

		
		int[] rows = {0, 0, 0};
		int[] cols = {0, 0, 0};
		
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[x].length; y++) {
				if(a[x][y] == 1)
					rows[x]++;
				else
					rows[x]--;
			}
		}
		
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[x].length; y++) {
				if(a[y][x] == 1)
					cols[x]++;
				else
					cols[x]--;
			}
		}
		
		for(int i : rows)
			System.out.println(i);
		System.out.println("\n");
		for(int i : rows)
			System.out.println(i);
		
		
		int max = 0;
		
		
		for(int x = 0; x < a.length; x++) {
			for(int y = 0; y < a[x].length; y++) {
				max = Math.max(rows[x] + cols[y], max);
			}
		}
		System.out.println(max);
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i < a.length; i++) {
//			map.merge(a[i], 1, Integer::sum);
//		}
//		System.out.println(map);
//		
//		for(int k : map.keySet())
//			System.out.println(k);
	}
}
