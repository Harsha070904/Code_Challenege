import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class String_Permutation {
    private static void permute(char[] chars, int index, HashSet<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1, result);
            swap(chars, index, i); 
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static List<String> getUniquePermutations(String s) {
        HashSet<String> resultSet = new HashSet<>();
        permute(s.toCharArray(), 0, resultSet);
        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        String s = "aabb";
        List<String> permutations = getUniquePermutations(s);
        System.out.println(permutations);
    }
}
