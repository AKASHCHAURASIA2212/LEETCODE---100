class Solution {
    
    public static int approch3(int[] arr) {
        int min = arr[0];
        int finalprofit = 0;
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            finalprofit = arr[i] - min;
            profit = Math.max(finalprofit, profit);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Max Profit " + profit);
        return profit;
    }
    public int maxProfit(int[] prices) {
        return approch3(prices);
    }
}