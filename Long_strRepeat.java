import java.util.HashSet;
import java.util.Scanner;

public class Long_strRepeat {
    public static int lengLongSubstr(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0; 
        int maxLength = 0; 
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left)); 
                left++; 
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: S = ");
        String s = sc.nextLine();
        int result = lengLongSubstr(s);
        System.out.println("Output: " + result);
        
        sc.close(); 
    }
}
