package org.example;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        // Initialize buy and sell pointers
        int buy = 0;
        int sell = 1;

        int maxProfit = 0;

        while(sell < prices.length) {
            // profitable?
            if(prices[buy] < prices[sell]) {
                int currentProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buy++;
            }
            sell++;
        }
        return maxProfit;
    }

    // Example main
    public static void main(String[] args) {
        // Create instance
        MaxProfit profit = new MaxProfit();
        int[] input = {0,1,5,3,6,4};
        System.out.println("Max profit is: " + profit.maxProfit(input));
    }
}
