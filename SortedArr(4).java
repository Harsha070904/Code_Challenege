import java.util.Arrays;

public class SortedArr {
    private static int nextGap(int gap) {
        if (gap <= 1) {
            return 0;
        }
        return (gap + 1) / 2; 
    }
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = nextGap(m + n);

        while (gap > 0) {
            int i = 0;

            while (i + gap < m) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
                i++;
            }
            int j = gap > m ? gap - m : 0;
            while (i < m && j < n) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                i++;
                j++;
            }
            if (j < n) {
                while (j + gap < n) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                    j++;
                }
            }
            gap = nextGap(gap);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 7, 14, 21, 5, 3};
        int[] arr2 = {12, 20, 18, 13};
        int m = arr1.length;
        int n = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        merge(arr1, arr2, m, n);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}
