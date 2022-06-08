package Solns;

import java.util.ArrayList;

public class number_of_1_bits_191 {
	public static void main(String[] args) {
		System.out.println(hammingWeight(15));
	}
    public static int hammingWeight(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
		int count = 0;
        do {
			if(n % 2 != 0) 
				count++;
			n = (int) Math.floor(n / 2);
        } while(n / 2 != 0 || n > 0);
        return count;
    }

}
