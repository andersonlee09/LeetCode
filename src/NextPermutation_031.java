import java.util.Arrays;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/8 10:08
 * @purpose null
 * @ModifiedRecords null
 */
public class NextPermutation_031 {
    public static void main(String[] args) {
        NextPermutation_031 demo = new NextPermutation_031();
        demo.nextPermutation(new int[]{3, 2, 1});
    }

        public void nextPermutation(int[] nums) {
            if (nums.length <= 1) {
                return;
            }


            int n = nums.length, temp = 0, i;
            for (i = n - 2; i >= 0; i--) {  // 先找到非降序的点
                if (nums[i] < nums[i+1]) {
                    temp = nums[i];
                    break;
                }
            }
    // 如果已经到极限直接排序
            if (i < 0) {
                Arrays.sort(nums);
                return;
            }


            int count = nums[i + 1];
            int index = i + 1;
            for (int j = i + 2; j < n; j++) {
                if (nums[j] > temp) {
                    count = Math.min(count, nums[j]);
                    index = j;
                }
            }

            // 交换两个数字
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            // 将i 以后的数组排序
            Arrays.sort(nums, i + 1, n);
            System.out.println(Arrays.toString(nums));

        }



}
