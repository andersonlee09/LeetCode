import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/4 22:55
 * @purpose null
 * @ModifiedRecords null
 */
public class ValidParentheses_020 {
    public static void main(String[] args) {
        ValidParentheses_020 demo = new ValidParentheses_020();
        System.out.println(demo.isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
