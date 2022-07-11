import java.util.ArrayList;
import java.util.List;

public class letter_combinations_phone_number_17 {

	public static void main(String[] args) {
		System.out.println(letterComb("23"));
		System.out.println(letterComb(""));
		System.out.println(letterComb("3"));
	}

    public static List<String> letterComb(String digits) {
    	List<String> l = new ArrayList<>();
    	
    	if(digits.length() == 0)
    		return new ArrayList<>();;
    	
    	letterComb(digits, "", 0, l);
    	
    	return l;
    }

    public static void letterComb(String digits, String str, int lvl, List<String> l) {
    	String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    	if(lvl < digits.length()) {
    		String curr_letters = letters[digits.charAt(lvl) - '0' - 2];
	    	for(int i = 0; i < curr_letters.length(); i++) {
	    		letterComb(digits, str + curr_letters.charAt(i), lvl + 1, l);
	    	}
    	}

    	if(lvl == digits.length()) 
    		l.add(str);
    }
}
