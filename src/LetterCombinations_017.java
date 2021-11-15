import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/9/3 20:48
 * @purpose 电话号码的数字组合
 * @ModifiedRecords null
 * <p>
 * 'a' - '1' 为48
 */
public class LetterCombinations_017 {
    public static void main(String[] args) {
        LetterCombinations_017 demo = new LetterCombinations_017();
        System.out.println(demo.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        if (len == 0) {
            return Collections.emptyList();
        }
        char c = digits.charAt(0);
        if (len == 1) {
            return getOneChar(c);
        }
        return mergeList(getOneChar(c), letterCombinations(digits.substring(1, len)));
    }

    public List<String> getOneChar(char c) {
        List<String> temp = new ArrayList<>();
        if (c < '8') {
            temp.add(String.valueOf((char) ((c - 50) * 3 + 97)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 98)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 99)));
        }
        if (c == '7') {
            temp.add(String.valueOf((char) ((c - 50) * 3 + 100)));
        } else if (c == '8') {
            temp.add(String.valueOf((char) ((c - 50) * 3 + 98)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 99)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 100)));
        } else if (c == '9'){
            temp.add(String.valueOf((char) ((c - 50) * 3 + 98)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 99)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 100)));
            temp.add(String.valueOf((char) ((c - 50) * 3 + 101)));
        }
        return temp;
    }

    public List<String> mergeList(List<String> list1, List<String> list2) {
        List<String> temp = new ArrayList<>();
        for (String s : list1) {
            for (String p : list2) {
                temp.add(s + p);
            }
        }
        return temp;
    }

}
