import java.io.InputStream;
import java.util.*;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 19:09
 * @purpose null
 * @ModifiedRecords null
 */

/*
public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int head, tail;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {  // 已经排序后的数如果第一个都大于零则不用再运行
                return result;
            }
            if (i > 0 && nums[i] == nums[i] - 1) {  // 如果
                continue;
            }
            tail = nums.length - 1;
            head = i + 1;
            while (head != tail) {
                if (nums[head] + nums[tail] > -nums[i]) {
                    tail--;
                } else if (nums[head] + nums[tail] < -nums[i]) {
                    head++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    while (tail > head && nums[tail] == nums[tail - 1]) tail--;
                    while (tail > head && nums[head] == nums[head + 1]) head++;
                    tail--;
                    head++;
                }
            }
        }
        // 得到结果后开始去重
        return result;
    }
 */
public class sumOfThreeNumber_015 {
    public static void main(String[] args) {
        sumOfThreeNumber_015 demo = new sumOfThreeNumber_015();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(demo.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int head, tail;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {  // 已经排序后的数如果第一个都大于零则不用再运行
                return result;
            }
            if (i > 0 && nums[i] == nums[i-1]) {  // 如果当前的等于后一个的则直接跳过避免结果重复
                continue;
            }
            tail = nums.length - 1;
            head = i + 1;
            while (head < tail) {
                if (nums[head] + nums[tail] > -nums[i]) {
                    tail--;
                } else if (nums[head] + nums[tail] < -nums[i]) {
                    head++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    while (tail > head && nums[tail] == nums[tail - 1]) tail--;
                    while (tail > head && nums[head] == nums[head + 1]) head++;
                    tail--;
                    head++;
                }
            }
        }
        // 得到结果后开始去重
        return result;
    }
}