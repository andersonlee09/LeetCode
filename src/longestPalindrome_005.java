/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 14:31
 * @purpose 寻找最长回文子串
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * @ModifiedRecords null
 * <p>
 * 我的思想：
 * 如果 s[i] != s[j]，dp[i][j] 为 false
 * 如果 s[i] == s[j]，则有三种情况：
 * 当 下标i 与 下标 j 相同，则 s[i] 和 s[j] 是同一个字符，例如 a，这是回文串
 * 当 下标i 与 下标 j 相差为 1，例如 aa，也是回文串
 * 当 下标i 与 下标 j 相差大于 1 时，例如 abcba，这时候就看bcb 是否是回文串，bcb 的区间是 [i + 1, j - 1]
 * 如果 dp[i][j] 是回文串，并且长度大于结果长度：我们就更新结果
 */
public class longestPalindrome_005 {

    public String longestPalindrome(String s) {
        String res = "";
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1)
            return s;
        int N = s.length();
        boolean[][] dp = new boolean[N][N];
        for (int j = 1; j < N; j++) {  //反正两边有相差为一的情况，所以让右侧直接从数组第二个元素开始
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i == j) {
                        dp[i][j] = true;
                    } else if (i == j - 1) {
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j] && (j - i + 1) > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        longestPalindrome_005 demo = new longestPalindrome_005();
        String s = "babad";
        System.out.println(demo.longestPalindrome(s));
    }
}
