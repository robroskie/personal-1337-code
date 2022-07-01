package Solns;

import java.util.Scanner;

public class Solution2 {
	public static int  sumDigits(int numX, int numY)
	{
		int  answer = 0;
		// Write your code here
		for(int i = 0; i < numX; i++) {
//			System.out.println(i);
			String s = String.valueOf(i);
			System.out.println("current element" + s);
			int sum = 0;
			for(int z = 0; z < s.length(); z++) {
				System.out.println("adding" + Character.getNumericValue(s.charAt(z)));
				sum += Character.getNumericValue(s.charAt(z));
			}
			System.out.println("sum is " + sum);
			if(sum == numY)
				answer++;
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
		int numX = 30;
		int numY = 6;
//		Scanner in = new Scanner(System.in);
//		// input for numX
//		int numX = in.nextInt();
//		
//		// input for numY
//		int numY = in.nextInt();
//		
//		
		int result = sumDigits(numX, numY);
		System.out.println();
		System.out.print(result);
		
	}
}
