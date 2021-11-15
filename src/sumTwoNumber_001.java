import java.util.Arrays;
import java.util.HashMap;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/1 15:35
 * @purpose null
 * @ModifiedRecords null
 */
public class sumTwoNumber_001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        sumTwoNumber_001 demo = new sumTwoNumber_001();
        System.out.println(Arrays.toString(demo.twoSum(nums, target)));
    }

    /*public int[] twoSum(int[] nums, int target) {    // 我自己写的最朴素的方法
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0 ,0};
    }*/

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]))
                return new int[]{i, hash.get(nums[i])};
            hash.put(target - nums[i], i);
        }
        return new int[]{0, 0};
    }
}
