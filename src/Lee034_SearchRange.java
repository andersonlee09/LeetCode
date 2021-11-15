import java.util.Arrays;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/8 23:33
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee034_SearchRange {
    public static void main(String[] args) {
        Lee034_SearchRange demo = new Lee034_SearchRange();
        System.out.println(Arrays.toString(demo.searchRange(new int[]{2, 2}, 3)));
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};
        int left = search(nums, target, true);
        if (left == -1) {  // 这里很重要 如果左边都没找到就不要找右边了 不然找右边容易下标越界
            return new int[] {-1, -1};
        }else {
            return new int[] {left, search(nums, target, false)};
        }
    }

    public int search(int[] nums, int target, boolean isLeft) {
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = isLeft ? (left + right) / 2 : (left + right + 1) / 2;
            if (nums[mid] == target) {
                if (isLeft) {
                    right = mid;
                } else {
                    left = mid;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left] == target ? left : -1;
    }
}
