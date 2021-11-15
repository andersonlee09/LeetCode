/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 14:01
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee042_Trap {
    public int trap(int[] height) {
        int h = height.length;
        if (h < 3) return 0;
        int maxLeft = 0, maxRight = 0, res = 0, left = 0, right = h-1;// 一定不能提前从1开始 让maxLeft为height[0] maxRight为height[h-1]
        while (left <= right) {
            maxLeft = Math.max(maxLeft,height[left]);
            maxRight = Math.max(maxRight, height[right]);
            if (height[left] < height[right]) {
                res += Math.min(maxLeft, maxRight) - height[left++];
            }else {
                res += Math.min(maxLeft, maxRight) - height[right--];
            }
        }
        return res;
    }
}
