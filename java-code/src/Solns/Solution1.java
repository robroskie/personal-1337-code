package Solns;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
	public static int  numberOfDays(int[] days)
	{
		int  answer = 0;
		// Write your code here
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < days.length; i++) {
			map.merge(days[i], 1, Integer::sum);
		}

		System.out.println(map);
		
		for(int key : map.keySet()) {
		    if(map.get(key) % 2 != 0)
		    	answer++;
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
//		Scanner in = new Scanner(System.in);
//		//input for days
//		int days_size = in.nextInt();
//		int days[] = new int[days_size];
//		for(int idx = 0; idx < days_size; idx++)
//		{
//			days[idx] = in.nextInt();
//		}
		int[] test = {4, 8, 2, 8, 9};
		int result = numberOfDays(test);
		System.out.print(result);
		
	}
}
