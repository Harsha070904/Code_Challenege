public class Long_pali_substring {
    private static String expandCen(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String longestPali(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String oddPali = expandCen(s, i, i);
            String evenPali = expandCen(s, i, i + 1);
            if (oddPali.length() > longest.length()) {
                longest = oddPali;
            }
            if (evenPali.length() > longest.length()) {
                longest = evenPali;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String s = "Madam";
        System.out.println("Longest Palindromic Substring: " + longestPali(s));
    }
}
