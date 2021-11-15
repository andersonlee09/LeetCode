/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/18 21:52
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee704_Search {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid-1;
            else left = mid + 1;
        }
        return -1;
    }
}
