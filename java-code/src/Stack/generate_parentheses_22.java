package Stack;

import java.util.ArrayList;
import java.util.List;




public class generate_parentheses_22 {
	public static void backtrack(int open, int closed, int n, String s, List<String> list){
		if(open == n && closed == n) {
			list.add(s);
			return;
		}
		if(open < n) {
			backtrack(open + 1, closed, n, s + "(", list);
		}
		if(closed < open) {
			backtrack(open, closed + 1, n, s + ")", list);
		}
	}
	
    public static List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<>();
    	backtrack(0, 0, n, "", list);
    	return list;
    }
    
	public static void main(String[] args) {
		List<String> result = generateParenthesis(3);
		System.out.println(result);
	}
}
