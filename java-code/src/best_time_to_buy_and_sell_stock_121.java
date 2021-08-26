//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

//Time complexity: O(n)
//Runtime: 3 ms, faster than 18.33% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 105.6 MB, less than 6.60% of Java online submissions for Best Time to Buy and Sell Stock.

public class best_time_to_buy_and_sell_stock_121 {
	public static void main(String[] args) {
		int[] a = {7,1,5,3,6,4};
		int[] b = {3,2,6,5,0,3};
		int[] c = {1,2,4};
		
		System.out.println(maxProfit(a));
		System.out.println(maxProfit(b));
		System.out.println(maxProfit(c));
	}
	
    public static int maxProfit(int[] prices) {

    	if(prices.length <= 1)
    		return 0;
  
        int low = prices[0];
        int high = prices[1];
        int maxProfit = high - low;
        
        for(int i = 0; i < prices.length - 1; i++) {
        	
        	if(prices[i] < low) {
        		low = prices[i];
        		high = prices[i + 1];
        	}
        	if(prices[i+1] > high) {
        		high = prices[i + 1];
        	}
        	maxProfit = Math.max(maxProfit, high-low);
        }
        

        if(maxProfit < 0)
        	return 0;
        
        return maxProfit;
        
    } 
}
