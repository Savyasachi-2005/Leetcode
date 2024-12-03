class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables
        // minPrice is set to the maximum possible value, which will track the lowest price encountered.
        int minPrice = Integer.MAX_VALUE;
        
        // maxProfit will store the maximum profit we can achieve.
        int maxProfit = 0;

        // Loop through all the prices to find the optimal buy and sell days.
        for (int price : prices) {
            // Update minPrice if the current price is lower than the previously encountered minPrice
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate the profit if we sell on the current day
            int profit = price - minPrice;

            // Update maxProfit if the current profit is greater than the previously recorded maxProfit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit that can be made
        return maxProfit;
    }
}
