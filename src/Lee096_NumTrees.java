/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/12 22:37
 * @purpose null
 * @ModifiedRecords null
 * 此题理解仍然存在问题
 */
public class Lee096_NumTrees {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] + dp[i-j];
            }
        }
        return dp[n];
    }
}
