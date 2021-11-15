/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 16:37
 * @purpose 实现正则表达式匹配
 * .' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * @ModifiedRecords null
 */
public class RegularExpressionMatching_010 {
    public static void main(String[] args) {
        RegularExpressionMatching_010 demo = new RegularExpressionMatching_010();
        String s = "aab";
        String p = "c*a*b";
        boolean result = demo.isMatch(s, p);
        System.out.println(result);
    }

    public boolean isMatch(String s, String p) {
        int sHead = 0;
        int pHead = 0;
        while (pHead < p.length() && sHead < s.length()) {
            if (s.charAt(sHead) == p.charAt(pHead) || p.charAt(pHead) == '.') {
                pHead++;
                sHead++;
            } else if (p.charAt(pHead) != '*') {
                return false;
            } else {
//                while (s.charAt(pHead) != s.charAt(pHead + 1)) {
//                    pHead++;
//                }
            }
        }
        return true;
    }
}
