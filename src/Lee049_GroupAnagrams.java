import java.util.*;

/**
 * @author andersonLee
 * @version 1.0
 * @date 2021/10/10 18:45
 * @purpose null
 * @ModifiedRecords null
 */
public class Lee049_GroupAnagrams {
    public static void main(String[] args) {
        Lee049_GroupAnagrams demo = new Lee049_GroupAnagrams();
        System.out.println(demo.groupAnagrams(new String[]{""}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Character>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            List<Character> charList = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                charList.add(str.charAt(i));
            }
            charList.sort(Comparator.naturalOrder());
            List<String> strings = map.get(charList);
            if (strings != null) {
                strings.add(str);
                map.replace(charList, strings);
            }else {
                List<String> lists = new ArrayList<>();
                lists.add(str);
                map.put(charList, lists);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<Character> key : map.keySet()) {
            res.add(new ArrayList<>(map.get(key)));
        }
        return res;
    }
}
