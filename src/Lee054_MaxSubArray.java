/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 19:45
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee054_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0], sum = nums[0];
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            }else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
