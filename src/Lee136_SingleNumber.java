import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/15 23:26
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num :
                nums) {
            res ^= num;
        }
        return res;
    }
}
