/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/11 20:58
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee070_ClimbStairs {
    public int climbStairs(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 1;
        ints[1] = 1;
        for (int i = 2; i <= n; i++) {
            ints[i] = ints[i-1] + ints[i-2];
        }
        return ints[n];

    }
}
