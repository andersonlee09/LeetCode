import java.util.*;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/11 19:10
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee056_Merge {
    public static void main(String[] args) {
        Lee056_Merge demo = new Lee056_Merge();
        System.out.println(Arrays.deepToString(demo.merge(new int[][]{{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {4, 6}})));
    }

    public int[][] merge(int[][] intervals) {
        // 先按照数组第一个元素进行排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            int fir = intervals[i][0];
            if (fir <= res.get(count)[1]) {
                if (intervals[i][1] > res.get(count)[1]) {
                    res.get(count)[1] = Math.max(intervals[i][1], res.get(count)[1]);
                }
            } else {
                res.add(intervals[i]);
                count++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
