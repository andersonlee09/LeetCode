import java.util.Arrays;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 11:13
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee215_FindKthLargest {
    public static void main(String[] args) {
        Lee215_FindKthLargest demo = new Lee215_FindKthLargest();
        System.out.println(demo.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1, len = nums.length;
        int res;
        while (left < right) {
            res = partition(nums, left, right);
            if (res == len - k) return nums[len - k];
            else if (res < len - k) left = res + 1;
            else right = res;
        }
        return nums[len - k];
    }

    public int partition(int[] nums, int left, int right) {
        int temp = nums[left];
        while (left < right) {
            while (nums[right] > temp && left < right) right--;
            nums[left] = nums[right];
            while (nums[left] < temp && left < right) left++;
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }

}
