/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/11 20:41
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee064_MinPathSum {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] arr = new int[m][n];
        for (int i = 1; i < m; i++) {
            arr[i][0] = grid[i][0];
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += Math.min(arr[i-1][j], arr[i][j-1]);
            }
        }
        return arr[m-1][n-1];
    }
}
