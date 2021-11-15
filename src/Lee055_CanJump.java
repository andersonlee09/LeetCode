/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 21:51
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee055_CanJump {
    public boolean canJump(int[] nums) {
        int carbon = 0;
        for (int i = 0; i < nums.length; i++) {
            if (carbon < i) {
                return false;
            } else {
                carbon = Math.max(carbon, i+nums[i]);
            }
        }
        return true;
    }
}
