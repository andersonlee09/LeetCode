/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/8 21:39
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee033_Search {
    public static void main(String[] args) {
        Lee033_Search demo = new Lee033_Search();
        System.out.println(demo.search(new int[]{1, 3}, 0));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[right]) {  // 如果右侧有序
                if (nums[mid] < target && target <= nums[right]) {  // target 小于左侧最小数
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {  // 如果右侧有序
                if (nums[mid] > target && target >= nums[left]) {  // target大于右侧最大数
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

}
