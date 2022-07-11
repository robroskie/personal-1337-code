import java.util.HashMap;

public class longest_substring_without_repeating_characters_3 {
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "abc";
		String str3 = "abcabcde";
		String str4 = "dvdf";
		
		
//		checkRepeat(str1);
//		checkRepeat(str2);
//		checkRepeat(str3);
		checkRepeat(str4);
		
	}
	
	public static void checkRepeat(String str) {
		HashMap<String, Integer> contained = new HashMap<>();
		
        int rtnCount = 0;
		int count = 0;
		
		for(int z = 0; z < str.length(); z++) {
			String curr = Character.toString(str.charAt(z));
			
			if(contained.containsKey(curr)) {
				System.out.println("end of longest string");
				
				count = 0;
				//contained = new HashMap<>();
//				z++;
			}
			else {
				contained.put(curr, 1);
				count++;
				
			}

			rtnCount = Math.max(count, rtnCount);
			
		}

		
		System.out.println(contained.toString());
		System.out.println(rtnCount);
	}
}


//for(int i = z; i < str.length(); i++) {
//
//}
