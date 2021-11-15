/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/11 22:14
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee075_SortColors {
    public void sortColors(int[] nums) {
        int zeroPtr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) swap(nums, i, zeroPtr++);
        }
        int onePtr=zeroPtr;
        for (int i = zeroPtr; i < nums.length; i++) {
            if (nums[i] == 1) swap(nums, i, onePtr++);
        }
    }

    public void swap(int[] nums, int o1, int o2) {
        int temp = nums[o1];
        nums[o1] = nums[o2];
        nums[o2] = temp;
    }
}
