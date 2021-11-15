/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 18:50
 * @purpose 最大盛水量问题
 * @ModifiedRecords null
 */
public class MaxArea_011 {
    public static void main(String[] args) {
        MaxArea_011 demo = new MaxArea_011();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(demo.maxArea(height));;
    }

    public int maxArea(int[] height) {
        int tail = height.length-1;
        int head = 0;
        int result = Math.min(height[tail], height[head]) * tail;
        while (tail != head) {
            if (height[head] > height[tail]) {
                tail--;
            }else {
                head++;
            }
            result = Math.max(result, Math.min(height[tail], height[head]) * (tail - head));
        }
        return result;
    }


}
