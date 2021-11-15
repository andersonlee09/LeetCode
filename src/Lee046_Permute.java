import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 15:55
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee046_Permute {
    public static void main(String[] args) {
        Lee046_Permute demo = new Lee046_Permute();
        System.out.println(demo.permute(new int[]{1,2,3}));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        recursive(0, output, res);
        return res;
    }

    public void recursive(int index, List<Integer> output, List<List<Integer>> res) {
        if (index == output.size()-1) {
            res.add(new ArrayList<>(output));
            return;
        }
        for (int i = index; i < output.size(); i++) {
            Collections.swap(output, i, index);
            recursive(index+1, output, res);
            Collections.swap(output, i, index);
        }
    }
}
