import java.util.ArrayList;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 12:16
 * @purpose 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 * @ModifiedRecords null
 */
public class Lee039_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        Lee039_CombinationSum demo = new Lee039_CombinationSum();
        System.out.println(demo.combinationSum(candidates, 7));
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, new ArrayList<>(), res, target);
        return res;
    }

    public void dfs(int[] candidates, int index, List<Integer> path,List<List<Integer>> res, int pam) {  // pam为剩余值
        if (pam < 0) return;
        if (pam == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(candidates, i, path, res, pam-candidates[i]);
            System.out.println(path);
            path.remove(path.size()-1);
        }
    }
}
