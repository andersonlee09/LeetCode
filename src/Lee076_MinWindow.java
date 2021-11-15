/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/12 14:29
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee076_MinWindow {
    public String minWindow(String s, String t) {
        int[] need = new int[128];  // 记录需要每个字符具体个数
        /**
         * @par size:窗口大小 如果没有改变过那就是无穷大
         * @par count:记录需要字符的个数
         * @par resultStart
         */
        int count = t.length(), left = 0, right = 0, size = Integer.MAX_VALUE, resultStart = 0;
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        for (right = 0; right < s.length(); right++) {  // i为窗口右边界
            char ch = s.charAt(right);
            if (need[ch] > 0) {
                count--;
            }
            need[ch]--;  // 无论如何相应的字符都记录一次  没用的会让数组中的字符变为负数
            if (count == 0) {  // 字符已经足够 窗口左侧开始向右滑动
                while (left < right && need[s.charAt(left)] < 0) {
                    need[s.charAt(left)]++;
                    left++;
                }
                if (right - left + 1 < size) {
                    size = right - left + 1;
                    resultStart = left;
                }
                need[s.charAt(left)]++;  // 将左侧窗口元素排除 所以需要数加一
                left++;  // 向右移动一个
                count++;
            }
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(resultStart, resultStart + size);
    }
}
