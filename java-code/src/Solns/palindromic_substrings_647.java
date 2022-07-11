
public class palindromic_substrings_647 {
	public static void main(String[] args) {
		String str = "aaa";
		System.out.println(countSubstrings(str));
	}
	
	static int countSubstrings(String s) {
		int count = 0;
		char left = '9';
		char right = '8';
		
		for(int i = 0; i < s.length(); i++) {
			boolean cont = true;
			int z = 1;
			
			while(cont) {
				System.out.println("loop");
				if(i - z >= 0) {
					left = s.charAt(i - z);
				}
				else {
					left = '9';
				}
				if(i + z <= s.length() - 1) {
					right = s.charAt(i + z);
				}
				else {
					right = '8';
				}
				System.out.println("left is " + left + "     right is " + right);
				if(left != right)
					cont = false;
				else
					count++;
				count++;
				z++;
			}

		}
		
		
		
		return count;
	}
}
