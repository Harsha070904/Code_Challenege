import java.util.*;

public class Anagrams_group {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"abc", "bca", "cab", "xyz", "zyx", "yxz"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
