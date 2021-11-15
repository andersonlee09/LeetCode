import java.util.ArrayList;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/12 20:06
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee078_Subsets {
    public static void main(String[] args) {
        Lee078_Subsets demo = new Lee078_Subsets();

        System.out.println(demo.subsets(new int[]{0}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(path, res, nums, 0);
        return res;
    }

    public void dfs(List<Integer> path, List<List<Integer>> res, int[] nums, int index) {
        res.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(path, res, nums, index + 1);
            path.remove(path.size() - 1);
        }
    }
}
/*
 * 二进制方法
  public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < (1 << nums.length); i++) {
            System.out.println(i);
            List<Integer> list = new ArrayList<>();
            int count = 0;
            int temp = i;
            while (temp > 0) {
                if (temp % 2 == 1) list.add(nums[count]);
                count++;
                temp /= 2;
            }
            if (list.size() > 0) res.add(list);
        }
        return res;
    }
 */
