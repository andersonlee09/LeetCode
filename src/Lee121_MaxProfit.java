/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/15 22:55
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee121_MaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }else {
                profit = Math.max(profit, prices[i]-min);
            }
        }
        return profit;
    }
}
