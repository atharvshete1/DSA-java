public class buy_sell {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 2,4,7,2, 4, 1 };
        System.out.println(maxProfit(arr));
    }

}