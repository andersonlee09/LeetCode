/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/1 20:27
 * @purpose null
 * @ModifiedRecords null
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 以这个字符串为例：abcabcbb，当i等于3时，也就是指向了第二个a, 此时我就需要查之前有没有出现过a,
 * 如果出现了是在哪一个位置出现的。然后通过last[index] 查到等于1, 也就是说，如果start 依然等于0的话，
 * 那么当前窗口就有两个a了，也就是字符串重复了，所以我们需要移动当前窗口的start指针，移动到什么地方呢？
 * 移动到什么地方，窗口内就没有重复元素了呢？ 对了，就是a上一次出现的位置的下一个位置，就是1 + 1 = 2。
 * 当start == 2, 当前窗口就没有了重复元素，那么以当前字符为结尾的最长无重复子串就是bca,然后再和之前
 * 的res取最大值。然后i指向后面的位置，按照同样思路计算。
 */


public class longestStrWithoutRepetition_003 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(start++));
            }
            set.add(c);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        longestStrWithoutRepetition_003 demo = new longestStrWithoutRepetition_003();
        String s = "abcabcbb";
        System.out.println(demo.lengthOfLongestSubstring(s));
    }


}
