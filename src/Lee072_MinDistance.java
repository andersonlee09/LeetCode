/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/11 21:09
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee072_MinDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length() + 1, n = word2.length() + 1;
        int[][] ints = new int[m][n];
        for (int i = 1; i < m; i++) {
            ints[i][0] = i;
        }
        for (int i = 1; i < n; i++) {
            ints[0][i] = i;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    ints[i][j] = Math.min(Math.min(ints[i-1][j], ints[i][j-1]), ints[i-1][j-1]) + 1;
                }else {
                    ints[i][j] = Math.min(Math.min(ints[i-1][j] + 1, ints[i][j-1] + 1), ints[i-1][j-1]);
                }
            }
        }
        return ints[m-1][n-1];
    }
}
