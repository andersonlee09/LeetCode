/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/17 16:54
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee415_AddStrings {
    public static void main(String[] args) { // '0' 的ASCII码为48


    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add > 0) {
            int x = i >= 0 ? i - 48 : 0;
            int y = j >= 0 ? j - 48 : 0;
            int temp = x + y + add;
            ans.append(temp % 10);
            add = temp > 10 ? 1 : 0;
            i--;
            j--;
        }
        return String.valueOf(ans.reverse());
    }
}
