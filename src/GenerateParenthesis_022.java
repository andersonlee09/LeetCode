import java.util.ArrayList;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/12 16:25
 * @purpose null
 * @ModifiedRecords null
 */
public class GenerateParenthesis_022 {
    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n, 0, 0);
        return result;
    }

    public void dfs(List<String> res, String temp, int n, int left, int right) {  // left right 分别为左右括号个数
        if (left > n || right > n) return;
        if (left == n && right == n) res.add(temp);
        if (left >= right) {
            dfs(res, temp+"(", n, left+1, right);
            dfs(res, temp+")", n, left, right+1);
        }
    }
}
