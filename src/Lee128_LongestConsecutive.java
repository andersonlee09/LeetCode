import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/16 17:54
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee128_LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }
        for (Integer num : num_set) {
            if (!num_set.contains(num - 1)) { // 这一句减少不必要的重复 让集合直接从最小的数开始遍历  精髓！！！
                int current = num;
                int newMax = 0;
                while (num_set.contains(current)) {
                    current++;
                    newMax++;
                }
                max = Math.max(newMax, max);
            }
        }
        return max;
    }
}
