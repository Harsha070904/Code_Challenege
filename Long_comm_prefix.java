public class Long_comm_prefix {
    public static String longCommPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        java.util.Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = {"each", "early", "earn"};
        System.out.println("Longest Common Prefix: " + longCommPrefix(strs));
    }
}
