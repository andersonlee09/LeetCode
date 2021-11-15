/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 16:48
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee048_Rotate {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[] temp = new int[len - 1];
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len - i; j++) {
                temp[j] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = matrix[i][j];
            }
            for (int j = 0; j < len - i + 1; j++) {
                swap(matrix, temp, len-i-1, i+j+1, j);
            }
            for (int j = 0; j < len - i + 1; j++) {
                swap(matrix, temp, i+j+1, i, j);
            }
            if (len - i + 1 >= 0) System.arraycopy(temp, 0, matrix[i], 0, len - i + 1);
        }
    }
    public void swap(int[][]matrix, int[]nums, int i, int j, int index){
        int temp = matrix[i][j];
        matrix[i][j] = nums[index];
        nums[index] = temp;
    }
}
