import java.util.HashMap;
import java.util.Scanner;

public class Substr_KDis {
    
    public static int countSubstringsWithKDistinct(String s, int k) {
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }
    private static int countAtMostKDistinct(String s, int k) {
        int left = 0, right = 0, count = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            while (freqMap.size() > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++;
            }
            count += right - left + 1;
            right++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: s = ");
        String s = scanner.nextLine();
        System.out.print("Input: k = ");
        int k = scanner.nextInt();
        int result = countSubstringsWithKDistinct(s, k);
        System.out.println("Output: " + result);
        scanner.close();
    }
}
