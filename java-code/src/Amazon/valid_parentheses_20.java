package Amazon;

import java.util.Stack;

public class valid_parentheses_20 {
    /**
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
    	if(s.length() % 2 != 0)
    		return false;
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    
    	
    	
    	for(int i = 0; i < s.length(); i++) {
    		char currentBracket = s.charAt(i);
    	
    		if(currentBracket == '{')
    			stack.push('}');
    		else if(currentBracket == '(')
    			stack.push(')');
    		else if(currentBracket == '[')
    			stack.push(']');
    		else if(stack.isEmpty() || stack.pop() != currentBracket) {
    			System.out.println( stack.isEmpty());
    			System.out.println("false 2");
    			return false;
    		}

    	}
    	
    	return stack.isEmpty();
    }
    
    public static void main(String[] args) {
    	String s = "()[]{}";
  
    	boolean res = isValid(s);
    	System.out.println(res);
    }
}
