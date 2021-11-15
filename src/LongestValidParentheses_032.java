import java.util.Stack;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/8 18:23
 * @purpose null
 * @ModifiedRecords null
 */
public class LongestValidParentheses_032 {
    public static void main(String[] args) {
        LongestValidParentheses_032 demo = new LongestValidParentheses_032();
        System.out.println(demo.longestValidParentheses("()()"));
    }

    public int longestValidParentheses(String s) {
        int maxNum = 0, key = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {  // 如果是左括号
                stack.add(i);
            }else {  // 如果是右括号
                stack.pop();
                if (stack.empty()) {
                    stack.add(i);
                }else {
                    maxNum = Math.max(maxNum, i-stack.peek());
                }
            }
        }
        return maxNum;
    }

}
